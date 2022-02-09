package org.tyaa.demo.java.se.interfaces;

@FunctionalInterface
public interface IComparatorGeneric<T> {
    Integer compare(T o1, T o2);
}
