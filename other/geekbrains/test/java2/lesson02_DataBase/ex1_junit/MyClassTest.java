package java2.lesson02_DataBase.ex1_junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mega on 09.09.2016.
 */
public class MyClassTest {

    MyClass myClass;
    String msg;


    @Before
    public void setUp() throws Exception {
        myClass = new MyClass(); // для всех тестов
        msg = "Hello junit";

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void sum() throws Exception {

        int res = myClass.sum(10 /*/ 0*/, 20, 30);
        myClass.printer(Integer.toString(res));
        Assert.assertEquals(60, res); // 60 - ожидаемый результат, res - фактический. Если false - тест завален
    }

    @Test
    public void printer() throws Exception {
        myClass.printer(msg);
    }
    // Добавлен позже
    // если выброс исключения ожидаемый результат - добавить параметра в аннотацию Test
    @Test(expected = RuntimeException.class)
    public void exc() {
        myClass.exc();
    }

}