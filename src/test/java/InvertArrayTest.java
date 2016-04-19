import com.lightside.invertproject.Main;
import com.lightside.invertproject.inverter.ArrayToInverse;
import com.lightside.invertproject.inverter.InvertArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

//import static junit.framework.TestCase.assertEquals;

/**
 * Test for InvertArray class.
 */
public class InvertArrayTest {

    private ArrayToInverse arrayToInverseInt, arrayToInverseChar;
    private Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private Integer[] intReversedArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    private Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
    private Character[] charReversedArray = {'e', 'd', 'c', 'b', 'a'};
    private InvertArray invert;
    private Main main;

    @Before
    public void setUp() {
        arrayToInverseInt = new ArrayToInverse();
        arrayToInverseChar = new ArrayToInverse(charArray);
        arrayToInverseInt.setArr(intArray);
        invert = new InvertArray();
        main = new Main();
    }

    @Test
    public void inverseIntArrTest() {
        invert.inverse(arrayToInverseInt.getArr());
        assertArrayEquals(intReversedArray, arrayToInverseInt.getArr());
    }

    @Test
    public void inverseCharArrTest() {
        invert.inverse(arrayToInverseChar.getArr());
        assertArrayEquals(charReversedArray, arrayToInverseChar.getArr());
    }

}
