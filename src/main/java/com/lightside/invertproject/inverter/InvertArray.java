package com.lightside.invertproject.inverter;

/**
 * Reversing integer arrays.
 */
public class InvertArray implements IInvertInterface {
    /**
     * Inverse array of any type.
     * @param array array for inversing
     * @param <T> return T arg
     */
    public <T> void inverse(final ArrayToInverse<T> array) {
        try {
            T[] tmpArr = array.getArr();
            int end = tmpArr.length - 1;

            for (int i = 0; i < end / 2; i++) {
                T tmp = tmpArr[i];
                tmpArr[i] = tmpArr[end - i];
                tmpArr[end - i] = tmp;
            }
            array.setArr(tmpArr);
        } catch (Exception e) {
//            throw ArrayToInverse;
        }
    }

    /**
     * Method from interface
     * @return null
     */
    public Integer getValue() {
        return null;
    }

    /**
     * Method from interface
     * @param value value to set
     */
    public void setValue(final Integer value) {

    }
}
