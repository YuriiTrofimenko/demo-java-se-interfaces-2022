package org.tyaa.demo.java.se.interfaces;
/** A comparison function, which imposes a total ordering on some collection of objects. */
@FunctionalInterface
public interface IComparatorGeneric<T> {
    /**
     * <p>int compare​(T o1, T o2)</p>
     *
     * <p>Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.</p>
     *
     * <p>The implementor must ensure that <strong>sgn(compare(x, y)) == -sgn(compare(y, x))</strong> for all x and y. (This implies that compare(x, y) must throw an exception if and only if compare(y, x) throws an exception.)</p>
     *
     * <p>The implementor must also ensure that the relation is transitive: <strong>((compare(x, y)>0) && (compare(y, z)>0))</strong> implies compare(x, z)>0.</p>
     *
     * <p>Finally, the implementor must ensure that compare(x, y)==0 implies that <strong>sgn(compare(x, z))==sgn(compare(y, z))</strong> for all z.</p>
     *
     * <p>It is generally the case, but not strictly required that <strong>(compare(x, y)==0) == (x.equals(y))</strong>. Generally speaking, any comparator that violates this condition should clearly indicate this fact. The recommended language is "Note: this comparator imposes orderings that are inconsistent with equals."</p>
     *
     * <p>In the foregoing description, the notation sgn(expression) designates the mathematical signum function, which is defined to return one of -1, 0, or 1 according to whether the value of expression is negative, zero, or positive, respectively.</p>
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     * */
    Integer compare(T o1, T o2);
}
