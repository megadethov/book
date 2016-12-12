package ua.mega;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class GenericTypesInRuntime {

    @Test
    public void testName() {
        List<Integer> ints = Arrays.asList(10, 20, 30); // the same
        List objects = Arrays.asList(10, 20, 30); // the same
        ints.add(10);
        int i = ints.get(0);

        // ограничение 1
//        if (ints instanceof List<Integer>) ; // нелязя в рантайме проверить тип коллекци
//        if (ints instanceof List) ; // проверить, что это List можно
    }

    // ограничение 2 (на overloading, тк вся информация о типе в рантайм теряется, оба параметра будут - List)
//    public void method(List<String> str) {} // в рантайм произойдет стирание типов
//    public void method(List<Integer> ints) {} // в рантайм произойдет стирание типов
}