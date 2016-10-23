package java2.lesson01_Generics.ex5;

/**
 * Created by mega on 05.09.2016.
 */
public class Gen<T extends Number> { // если здесь выбрать T == Integer
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

//    public void delta(Gen<T> other) { // то и здесь будет T == Integer
//    public void delta(Gen<?> other) { // wildecards тоже работает и здесь будет T == <T extends Number>

    public void delta(Gen<? extends Integer> other) { // T == Integer и ниже. Типа второй фильтр на <T extends Number>

//    public void delta(Gen other) { // raw type тоже работает
//        if (other instanceof Integer) System.out.println(); // !!!!! instanceof не работает для Generics
        double res = this.obj.doubleValue() - other.obj.doubleValue();
        System.out.println(res);
    }

}
