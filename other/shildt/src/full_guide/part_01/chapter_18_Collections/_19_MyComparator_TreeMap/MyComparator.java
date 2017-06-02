package full_guide.part_01.chapter_18_Collections._19_MyComparator_TreeMap;

import java.util.Comparator;

/**
 * Created by mega on 09.09.2016.
 */
// Компаратор для сортировки счетов по фамилиям вкладчиков
public class MyComparator implements Comparator<String> {
    @Override
    // сравнить последние слова в строках
    public int compare(String o1, String o2) {
        int i, j, k;
        // Найти индекс символа с которого начинается фамилия
        i = o1.lastIndexOf(' '); // позиция пробела(последнего) между именем и фамилией
        j = o2.lastIndexOf(' '); // позиция пробела(последнего) между именем и фамилией
        k = o1.substring(i).compareTo(o2.substring(j)); // сравнить две подстроки - фамилии
        if (k == 0) // если фамилии совпадают сравнить по имени и фамилии
            return o1.compareTo(o2);
        else return k; // иначе вернуть сравнение только по фамилиям
    }
}
