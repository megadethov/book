package full_guide.part_01.chapter_18_Collections._26_PropertiesDemo;

import java.util.Properties;
import java.util.Set;

/**
 * Created by mega on 10.09.2016.
 */
// продемонстрировать применение Properties
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("A", "One");
        prop.put("B", "Two");
        prop.put("C", "Three");
        prop.put("D", "Four");
        
        // взять Set ключей
        Set keySet = prop.keySet();
        // прочитать
        for (Object obj : keySet) { // не String, а Object
            System.out.println(obj + " - " + prop.getProperty((String) obj)); // требуется приведение
        }

        // найти значение по ключу
        System.out.println(prop.getProperty("Z")); // Z нет в ключах имеет значение - null
        System.out.println(prop.getProperty("W", "no value")); // w нет в ключах, ему присвоится указанное "no value"
    }

}
