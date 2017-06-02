package ua.mega.lecture2.Practice1.item1_4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yefremov Yuriy
 */
public class ArrProdTest {

    int[] nullArr = null;
    int[] emptyArr = {};
    int[] zeroArr = {0};
    int[] arr = {10, 20, 30};
    int[] negativeArr = {-10, -20, -30};

    @Test(expected = MyException.class)
    public void prodNull() throws MyException {
        ArrProd.prodArr(nullArr);
    }

    @Test
    public void prodEmpty() throws MyException {
        int actual = ArrProd.prodArr(emptyArr);
        int expected = 0;
        Assert.assertEquals("A prod()", expected, actual, 0.0001);
    }

    @Test
    public void prodZero() throws MyException {
        int actual = ArrProd.prodArr(zeroArr);
        int expected = 0;
        Assert.assertEquals("A prod()", expected, actual, 0.0001);
    }

    @Test
    public void prodArr() throws MyException {
        int actual = ArrProd.prodArr(arr);
        int expected = 6000;
        Assert.assertEquals("A prod()", expected, actual, 0.0001);
    }

    @Test
    public void prodNegative() throws MyException {
        int actual = ArrProd.prodArr(negativeArr);
        int expected = -6000;
        Assert.assertEquals("A prod()", expected, actual, 0.0001);
    }



}