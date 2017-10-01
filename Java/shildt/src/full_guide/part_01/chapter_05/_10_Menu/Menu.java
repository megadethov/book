package full_guide.part_01.chapter_05._10_Menu;

import java.io.IOException;

/**
 * Created by mega on 24.08.2016.
 */
public class Menu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Play");
            System.out.println("2. Save");
            System.out.println("3. Exit");
            System.out.println("Make your choice: 1,2,3");
            choice = (char) System.in.read();
            if (choice == '3') break;
        } while (choice < '1' || choice > '3');

        switch (choice) {
            case '1':
                System.out.println("Play the game");
                break;
            case '2':
                System.out.println("Save the game");
                break;
            case '3':
                System.out.println("Exit the game");
                break;
        }

    }
}
