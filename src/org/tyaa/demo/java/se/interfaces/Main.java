package org.tyaa.demo.java.se.interfaces;

public class Main {

    public static void main(String[] args) {
	    /* A a1 = new A();
	    // A.B b1 = a1.new B();
        var b1 = a1.new B();
        System.out.println(b1.getSecret());
        System.out.println(A.C.getStaticSecret()); */
        Integer[] integers = {-1, 10, 0, 300, 20, 8, 7};
        String[] strings = {"John", "Bill", "Mary"};
        /* BubbleSort.sort(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        } */
        BubbleSort.uniSort(integers, new IComparator() {
            @Override
            public Integer compare(Object o1, Object o2) {
                return ((Integer) o2) - ((Integer) o1);
            }
        });
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println();
        BubbleSort.uniSort(strings, (o1, o2) -> ((String) o1).compareTo((String) o2));
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
