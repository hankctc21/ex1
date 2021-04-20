

package cs240;

class Demo {

    public static void main(String[] args) {

        String[] items = {"hat", "apple", "book", "phone"};

        LinkedList list1 = new LinkedList();

        for (String item : items)
            list1.add(item);

        LinkedList list2 = list1;
        //LinkedList list2 = new LinkedList(list1);

        System.out.println();
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();

        String item = "book";
        //String item = "hat";
        System.out.println("removing from list1: " + item);
        int index = list1.find(item);
        list1.remove(index);

        System.out.println();
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();

    }

}

class LinkedList {

    private class Node {
        private Object item;
        private Node next;
        private Node prev;
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {

        clear();

    }

    public LinkedList(LinkedList list) {

        size = list.size;
        head = list.head;
        tail = list.tail;

    }

    public void clear() {

        size = 0;
        head = null;
        tail = null;

    }

    public int size() {

        return size;

    }

    public void add(Object item) {

        Node node = new Node();
        node.item = item;

        if (tail == null)
            head = node;
        else
            tail.next = node;

        node.prev = tail;
        node.next = null;
        tail = node;

        size++;

    }

    public Object remove(int index) {

        Node n = getNode(index);

        if (n == head)
            head = n.next;
        else
            n.prev.next = n.next;

        if (n == tail)
            tail = n.prev;
        else
            n.next.prev = n.prev;

        n.prev = null;
        n.next = null;

        size--;

        return n.item;

    }

    public int find(Object item) {

        Node n = head;

        for (int i = 0; i < size; i++) {

            if (item.equals(n.item))
                return i;

            n = n.next;

        }

        return -1;

    }

    private Node getNode(int index) {

        Node n = head;

        for (int i = 0; i < index; i++)
            n = n.next;

        return n;

    }

    public String toString() {

        String s = "[";

        for (Node n = head; n != null; n = n.next) {
            s += n.item;
            if (n.next != null)
                s += ", ";
        }

        return s + "]";

    }

}

