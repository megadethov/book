package java2.lesson01_Generics.ex4;

import java.io.Serializable;

/**
 * Created by mega on 05.09.2016.
 */
public class Gen3<T extends Animal & Miauable/* & Serializable*/> {
    T obj;

    public Gen3(T obj) {
        this.obj = obj;
    }
}
