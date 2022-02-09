package org.tyaa.demo.java.se.interfaces;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) /* throws InterruptedException */ {
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
        BigDecimal price1 = new BigDecimal("49999.99");
        price1 = price1.setScale(2, BigDecimal.ROUND_HALF_UP);
        Order[] orders = {
            new Order("PC", price1, 10),
            new Order("MacBook", new BigDecimal(100000), 3),
            new Order("Display", new BigDecimal(10000), 10)
        };
        System.out.println();
        BubbleSort.uniSortGeneric(orders, (o1, o2) -> o1.goodName.compareTo(o2.goodName));
        for (Order order : orders) {
            System.out.println(order);
        }
        System.out.println();
        BubbleSort.numberSort(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println();
        Double[] doubles = {-1.99, 10.05, 0.87, 300.65, 20.0, 8.88, 7.1};
        BubbleSort.numberSort(doubles);
        for (Double doubleValue : doubles) {
            System.out.println(doubleValue);
        }
        // Unchecked (Runtime) Exception
        int x = 0;
        int y = 0;
        try {
            // throw new InterruptedException();
            // throw new InterruptedException();
            // Thread.currentThread().interrupt();
            // System.out.println(x / y);
            integers[10] = 0;
        // } catch (ArithmeticException exception) {
        } catch (Exception exception) {
            if (exception instanceof ArithmeticException) {
                System.err.printf("Division by zero exception: %s / %s\n", x, y);
            } else if (exception instanceof InterruptedException) {
                System.err.println("InterruptedException");
            } else {
                System.err.println("Unknown Exception");
                System.err.println(exception.getMessage());
            }
        } finally {
            System.out.println("Action 1 Passed");
        }
        // java.lang.ArithmeticException arithmeticException;
        // Checked Exception
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Action 2 Passed");
        }
        System.out.println("OK");
        Comparable comparable;
    }
}
