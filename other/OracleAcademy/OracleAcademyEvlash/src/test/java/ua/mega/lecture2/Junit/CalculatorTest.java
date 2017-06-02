package ua.mega.lecture2.Junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yefremov Yuriy
 */
// создадим тест для имеющегося метода
public class CalculatorTest {
    @Test
    public void sum() {
        int actual = Calculator.sum(1, 2, 3);
        int expected = 6;
        Assert.assertEquals("A sum() ", expected, actual, 0.001);
    }
    // Создадим еще один тест, а потом под него реализуем метод - TDD
    @Test
    public void sqrt() {
        double actual = Calculator.sqrt(4);
        double expected = 2;
        Assert.assertEquals("A sqrt() ", expected, actual, 0.001);
    }

}