package ua.mega.lecture3.format;

/**
 * Created by Yefremov Yuriy
 */
public class FormattedTable {
    static void printLine() {
        System.out.println("-----------------------------------------------------------");
    }
    static void printHeader() {
        System.out.printf("%-15s \t %s \t %s \t %s \n", "Player", "Matches", "Goals", "Goals per match");
    }
    static void printRow(String player, int matches, int goals) {
        System.out.printf("%-15s \t %d \t %7d \t %.1f \n", player, matches, goals, ((float)goals / matches));
    }


    public static void main(String[] args) {
        printLine();
        printHeader();
        printLine();
        printRow("Maradona", 200, 250);
        printRow("Platiny", 250, 300);
        printRow("Ziko", 300, 400);
        printLine();
    }
}
