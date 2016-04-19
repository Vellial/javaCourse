package com.lightside.invertproject.inverter;

/**
 * Interface for inverting arrays of any type.
 * @param <T>
 */
interface IInvertArray<T> {

    /**
     * Method for inverting arrays.
     * @param array array to inverse.
     * @param <T> array type.
     */
    <T> void inverse(final T[] array);

}
