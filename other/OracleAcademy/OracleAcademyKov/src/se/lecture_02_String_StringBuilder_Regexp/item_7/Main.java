package se.lecture_02_String_StringBuilder_Regexp.item_7;

/**
 * Created by Yefremov Yuriy
 */
// Используется очень редко
public class Main {
    public static void main(String[] args) {
        String str = "Hello my world"; // исходная строка
        String criteria = "mygw"; // критерий для поиска
        /*


        public boolean regionMatches(boolean ignoreCase,
                                    int toffset,
                                    String other,
                                    int ooffset,
                                    int len)
    ignoreCase — true — игнорировать регистр, false — не игнорировать регистр.
    toffset — позиция, с которой начнем отсчет.
    other — другая строка, часть которой мы будем сравнивать.
    ooffset — позиция, с которой начнем отсчет в строке other
    len — количество символов для сравнения

       */

        // выведет "true", здесь мы явно определили позицию поиска 6
        System.out.println(str.regionMatches(6, criteria, 0, criteria.length() - 2));

        // Еще однастрока
        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";

        boolean foundIt = false; // флаг

        for (int i = 0; i <= (searchMe.length() - findMe.length()); i++) { // длинаСторки-длинаИскомого, тк срвнивать последние символы нет необходимости
            // стартуем с 0 символа строки, а затем в каждой итерации смещаемся на +1
            // если regionMatches найдет искомое слово в строке, то выполнится тело if()
            if(searchMe.regionMatches(i, findMe, 0, findMe.length())) {
                foundIt = true; //ставим флаг в true
                System.out.println(searchMe.substring(i, i + findMe.length())); // вырезать найденное слово из строки
                break; // закончить выполнение цикла
            }
        } // end for

        if (!foundIt) { // проверяем состояние флага
            System.out.println("No match found."); // если остался false
        }
    }
}
