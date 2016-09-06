package full_guide.part_01.chapter_14._13_GenericSuperClass;

/**
 * Created by mega on 06.09.2016.
 */
// Простая иерархия обобщенных классов
public class GenA<T> {
    T obj;

    public GenA(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

// В подклассе generics используется только для поддержки обобщенных типв супер класса
class GenB<T> extends GenA<T> {

    public GenB(T obj) {
        super(obj);
    }
}
