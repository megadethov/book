package full_guide.part_01.chapter_14._14_GenericSuperClass_WithSubOwnerType;

/**
 * Created by mega on 06.09.2016.
 */
// В подкласс могут быть введены свои параметры типа
public class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public T getObjT() {
        return obj;
    }
}

// Подкласс, в котором определяются свой парметр типа V
class Gen2<T, V> extends Gen<T> {
    V obj;

    public Gen2(T obj, V obj2) {
        super(obj);
        this.obj = obj2;
    }

    public V getObjV() {
        return obj;
    }
}


