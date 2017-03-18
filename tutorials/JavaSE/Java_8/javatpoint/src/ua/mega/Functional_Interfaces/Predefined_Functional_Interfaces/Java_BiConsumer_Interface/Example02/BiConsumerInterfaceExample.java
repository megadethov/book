package ua.mega.Functional_Interfaces.Predefined_Functional_Interfaces.Java_BiConsumer_Interface.Example02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Mohan");
        map.put(110, "Sujeet");
        map.put(115, "Tom");
        map.put(120, "Danish");

        // Referring method
        BiConsumer<Map<Integer, String>, String> biCon = BiConsumerInterfaceExample::showDetails;
        biCon.accept(map, "Student");
    }


    static void showDetails(Map<Integer, String> map, String mapName) {
        System.out.println("----------" + mapName + " records-----------");
        map.forEach(
                (key, value) -> System.out.println(key + " " + value)
        );
    }
}
