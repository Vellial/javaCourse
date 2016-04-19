package com.lightside.invertproject.inverter;

/**
 * Reversing integer arrays.
 */
public class InvertArray implements IInvertArray {
    /**
     * Inverse array of any type.
     * @param array array to inverse.
     */
    public void inverse(final Object[] array) {
        int end = array.length - 1;

        for (int i = 0; i < end / 2; i++) {
            Object tmp = array[i];
            array[i] = array[end - i];
            array[end - i] = tmp;
        }
    }
}
