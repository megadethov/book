package full_guide.part_01.chapter_07._19_CommandLine;

/**
 * Created by mega on 25.08.2016.
 */
// Вывести все аргументы командной строки
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
