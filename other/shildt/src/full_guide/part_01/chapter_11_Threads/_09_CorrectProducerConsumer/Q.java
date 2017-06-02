package full_guide.part_01.chapter_11._09_CorrectProducerConsumer;

/**
 * Created by mega on 29.08.2016.
 */
public class Q {
    int num;
    boolean isElemPresent = false;

    // получить число num
    synchronized int get() {
        // проверяю наличие элемента:
        // - есть пропускаю if
        // - нет отпускаю монитор и ложусь спать - wait set
        if (!isElemPresent) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // получаю num и освобождаю монитор
        System.out.println("get: " + num);
        // первожу флаг
        isElemPresent = false;
        // бужу 1 поток из wait set -> blocked set
        notify();
        return num;
    }

    // положить число num
    synchronized void put(int num) {
        // проверяю наличие элемента:
        // - есть ложусь спать - wait set
        // - нет
        if (isElemPresent) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.num = num;
        System.out.println("put: " + num);
        isElemPresent = true;
        notify();

    }
}
