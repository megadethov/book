package _01_Creational.Singleton.Stage_01;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

    private static Singleton singleton;
    private static List<String> comments;

   private Singleton() {
       comments = new ArrayList<>();
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

// добавить комментарий
    public static void addComment(String comment) {
        comments.add(comment);
    }
// отобразить все комментарии
    public static void showAllComments() {
        for (String next : comments) {
            System.out.println(next);
        }
    }


}
