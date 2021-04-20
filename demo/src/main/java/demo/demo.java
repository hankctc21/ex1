

package demo;

import java.util.Arrays;

class INode {

    INode children[] = new INode[25];
    int count = 0;

    public INode(char[] charArray, int count) {
        setChar(charArray);
        setCount(count);

    }



    public char[] getChar() {
        return charArray;
    }

    public void setChar(char[] c) {
        this.charArray = c;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /*
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    */

    @Override
    public String toString() {
        return charArray + "-" + count;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this)
            return true;

        if (o == null)
            return false;

        if (getClass() != o.getClass())
            return false;

        INode p = (INode)o;

        return (charArray.equals(p.charArray) && count == p.count);

    }

    @Override
    public int hashCode() {
        return (charArray.hashCode() + count);
    }


}


class Demo {

    public static void main(String[] args) {

        INode p1 = new INode("a");
        INode p2 = new INode("Ann");
        INode p3 = new INode("Bob");
        INode p4 = new INode("Ann");

        INode[] people = { p1, p2, p3, p4 };

        System.out.println();
        System.out.println("people:");
        System.out.println(Arrays.toString(people));
        System.out.println();

	/*
	Arrays.sort(people);

        System.out.println("people after sort:");
	System.out.println(Arrays.toString(people));
        System.out.println();
	

	
        System.out.println("Person.compareTo: p1.compareTo ? ");
        System.out.println("p1 = " + p1.compareTo(p1));
        System.out.println("p2 = " + p1.compareTo(p2));
        System.out.println("p3 = " + p1.compareTo(p3));
        System.out.println("p4 = " + p1.compareTo(p4));
        System.out.println();
	

	
	Comparable comp1;
	Comparable comp2 = new Comparable();
	Comparable comp3 = new Person("Ned", 20);
	Comparable comp4 = new String();
	Comparable comp5 = new Demo();
	

    }*/}

}

