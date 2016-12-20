import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Multithreading {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 4, 7, 9));
// old style =================================================================
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println( Collections.max(list, Integer::compare));
//            }
//        }).start();

// new style==================================================================
        new Thread(() -> {
            System.out.println(Collections.max((list), Integer::compare));
                    }).start();
    }

}
