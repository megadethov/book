package full_guide.part_01.chapter_18_Collections._27_ProperitesDefaultDemo;

import java.util.Properties;
import java.util.Set;

/**
 * Created by mega on 10.09.2016.
 */
public class PropertyDefDemo {
    public static void main(String[] args) {

        // хеш таблица для дефолтных значений
        Properties propDef  = new Properties();
        propDef.put("100", "AAA");
        propDef.put("200", "BBB");
        propDef.put("300", "CCC");

        // основная хеш таблица, в крнструкторе принимает дефолт-таблицу
        Properties prop = new Properties(propDef);
        prop.put("1", "A");
        prop.put("2", "B");
        prop.put("3", "C");

        // получить множество ключей
        Set<?> keySet = prop.keySet();

        // Вывести таблицу
        for (Object ob : keySet) {
            System.out.println(ob + " - " + prop.getProperty((String) ob));
        }

        // Если попытаться вычитать из основной таблицы значение, к-ое хранится в дефолтной оно будет считано из дефолтной
        System.out.println(prop.getProperty("100"));
    }
}
