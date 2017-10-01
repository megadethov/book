package full_guide.part_01.chapter_14_Generics._11_GenericInterface;

/**
 * Created by mega on 06.09.2016.
 */
// Обобщенный мнтерфейс для определения масимального и минимального значения
public interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}
