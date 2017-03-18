package full_guide.part_01.chapter_07._20_VarArgs;

/**
 * Created by mega on 25.08.2016.
 */
public class VarArgErr {
}

class Err {
    void test(int x, int y, int... val){} // начиная с третьего аргумента - значения val
//    void test(int x, int... val, int y){} // не компилируется, vararg всегда последний
//    void test(int... val, int... x){} // не компилируется, vararg всегда один

}
