package ua.mega.lecture2.Practice1.item1_4;

import org.junit.Assert;
import org.junit.Test;
import ua.mega.lecture2.Practice1.item1_4.ArraySum;
import ua.mega.lecture2.Practice1.item1_4.MyException;

/**
 * Created by Yefremov Yuriy
 */
// 1. Установка JUnit. Одиночные тесты
//
//        Установите JUnit на локальный компьютер. Проверьте установку
//
//        JUnit.
//
//        Спроектируйте класс суммирования элементов массива ArraySum,
//
//        содержащий статический метод Sum(), принимающий массив в качестве
//
//        параметра.
//
//        Разработайте класс ArraySumTest для тестирования ArraySum.
//
//        Реализуйте класс ArraySum. Добейтесь корректного выполнения
//
//        тестов.
//
// 2. JUnit: тесты над общими наборами объектов (fixtures)
//
//        Расширьте класс ArraySum, запланировав в нем конструктор и метод
//
//        экземпляра Sum(), суммирующий массив, заданный в конструкторе.
//
//        Расширьте класс ArraySumTest, превратив его в fixture (тест,
//
//        использующий общий набор объектов). В качестве общего объекта должен
//
//        выступать массив для суммирования.
//
//        Реализуйте дополнительную функциональность в классе ArraySum.
//
//        Добейтесь корректного выполнения тестов.
//
// 3. JUnit: тестирование исключений
//
//        Добавьте в класс ArraySumTest метод, тестирующий поведение
//
//        класса ArraySum при передаче в его статический метод Sum() значения null.
//
//        Оцените результат выполнения теста и добейтесь его корректного
//
//        выполнения.
//
//        Откорректируйте тестирующий метод так, чтобы он ожидал
//
//        генерации исключения и выдавал ошибку в случае, если исключение не
//
//        возникает. Добейтесь корректного выполнения теста.
//
// 4. JUnit: группы тестов (test suites)
//
//        Добавьте в проект новый класс ArrayProd, реализующий
//
//        произведение элементов массива и соответствующий тестовый класс
//
//        ArrayProdTest.
//
//        Объедините ArraySumTest и ArrayProdTest в рамках группы тестов
//
//        AllTests.
//
//        Выполните группу тестов за один раз.
//
// 5. Разработка, основанная на тестах
//
//        Разработайте на основе тестов один из следующих классов.
//
//        Разработать класс, представляющий студента. Студент характеризуется
//
//        именем, фамилией, группой и набором экзаменов, которые он сдавал.
//
//        Экзамен характеризуется названием предмета, оценкой студента по нему и
//
//        датой сдачи (год, семестр). Группа характеризуется курсом и факультетом.
//
//        Необходимые операции таковы:
//
//        узнать наивысшую оценку среди всех экзаменов по данному
//
//        предмету
//
//        добавить ему оценку по экзамену
//
//        удалить для него оценку по экзамену;
//
//        если он такой экзамен не сдавал - сгенерировать исключение
//
//        узнать число экзаменов, которые он сдал с указанной оценкой
//
//        узнать его средний балл за указанный семестр;

public class ArraySumTest {

    int[] nullArr = null;
    int[] emptyArr = {};
    int[] zeroArr = {0};
    int[] arr = {10, 20, 30};
    int[] negativeArr = {-10, -20, -30};

    @Test(expected = MyException.class)
    public void sumNull() throws Exception {
        ArraySum.sum(nullArr);
    }

    @Test
    public void sumEmpty() throws MyException {
        int actual = ArraySum.sum(emptyArr);
        int expected = 0;
        Assert.assertEquals("A sum()", expected, actual, 0.0001);
    }

    @Test
    public void sumZero() throws MyException {
        int actual = ArraySum.sum(zeroArr);
        int expected = 0;
        Assert.assertEquals("A sum()", expected, actual, 0.0001);
    }

    @Test
    public void sumArr() throws MyException {
        int actual = ArraySum.sum(arr);
        int expected = 60;
        Assert.assertEquals("A sum()", expected, actual, 0.0001);
    }

    @Test
    public void sumNegative() throws MyException {
        int actual = ArraySum.sum(negativeArr);
        int expected = -60;
        Assert.assertEquals("A sum()", expected, actual, 0.0001);
    }



}