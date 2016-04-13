package com.lightside.invertproject.inverter;

/**
 * Entity class - array to inverse.
 */
public class ArrayToInverse<T>  {
    private T[] arr;

    /**
     * Constructor
     */
    public ArrayToInverse() {
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
