import java.util.WeakHashMap;

public class _06_WeakHashMap {
    public static void main(String[] args) {
        // WeakHashMap - ключи со сначениями - null удаляются из мапы GC.
        // Хорошо подходит для временного хранилища
        WeakHashMap<Data, Integer> map = new WeakHashMap<>();
        Data data = new Data(); // какой-то объект
        map.put(data, 1000);

        data = null; // делаем доступным для GC
        System.gc();

        // Проверяем очистку
        for (int i = 0; i < 100000; i++) {
            if (map.isEmpty()) {
                System.out.println("Empty!!! " + i);
                break;
            }
        }

    }
}

class Data {

}
