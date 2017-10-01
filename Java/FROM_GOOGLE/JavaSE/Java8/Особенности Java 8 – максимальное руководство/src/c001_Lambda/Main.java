package c001_Lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        В своей простейшей форме лямбда может быть представлена в виде разделенных запятыми списка параметров,
// символа –> и тела. Например:
        List<String> list = Arrays.asList("a", "b", "d");
        list.forEach(e -> System.out.println(e));

//        Обратите внимание, что тип аргумента e определен компилятором. Кроме того вы можете явно указать
// тип параметра обернув параметр в скобки. Например:
        Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );

//        В случае, если тело лямбды более сложное, оно может быть обернуто в фигурные скобки
// подобно определению обычной функции в Java. Например:
        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );

    }
}
