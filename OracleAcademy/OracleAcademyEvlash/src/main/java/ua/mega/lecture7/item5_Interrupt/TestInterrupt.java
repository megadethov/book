package ua.mega.lecture7.item5_Interrupt;

/**
 * Created by Yefremov Yuriy
 */
// interrupt() - это рекомендация потоку завершить работу (флаг - true). Если поток в это время sleep или wait - InterruptedException

public class TestInterrupt {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                return; // если у спящего вызовут interrupt() завершаем работу метода - потока
            }
        });
        thread.start();

        thread.interrupt(); // это вызовет у спящего потока InterruptedException, а тк в catch - return - поток завершится

    }
}
