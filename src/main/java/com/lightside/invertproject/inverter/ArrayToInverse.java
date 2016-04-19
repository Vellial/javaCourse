package com.lightside.invertproject.inverter;

/**
 * Entity class - array to inverse.
 * @param <T> any type
 */
public class ArrayToInverse<T> {
    private T[] arr;

    /**
     * Default constructor
     */
    public ArrayToInverse() {
    }

    /**
     * Constructor with args
     * @param array array to inverse
     */
    public ArrayToInverse(final T[] array) {
        this.arr = array;
    }

    /**
     * Array getter
     * @return arr
     */
    public T[] getArr() {
        return arr;
    }

    /**
     * Array setter
     * @param arr array
     */
    public void setArr(final T[] arr) {
        this.arr = arr;
    }
}
