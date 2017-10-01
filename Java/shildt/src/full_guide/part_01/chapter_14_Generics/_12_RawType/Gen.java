package full_guide.part_01.chapter_14_Generics._12_RawType;

/**
 * Created by mega on 06.09.2016.
 */
// Продемонстрировать базовый тип - raw type (главный недостаток - теряется типовая безопасность, но сохраняется совм.)
public class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
