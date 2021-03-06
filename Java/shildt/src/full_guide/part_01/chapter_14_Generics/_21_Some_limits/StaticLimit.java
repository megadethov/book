package full_guide.part_01.chapter_14_Generics._21_Some_limits;

/**
 * Created by mega on 06.09.2016.
 */
public class StaticLimit<T> {
    /*static*/ T obj; // нельзя создать статик переменную обобщенного типа

    /*static*/ T getObj() { // ни в одном из статических методов нельзя использовать параметр типа - обобщенный
        return obj;
    }
}

//    Если объявить статические члены по параметру типа, объявленному в их классе,
//        нельзя, то объявить статические обобщенные методы со своими параметрами
//        типа все же можно, как демонстрировалось в примерах, представленных ранее
//        в этой главе.