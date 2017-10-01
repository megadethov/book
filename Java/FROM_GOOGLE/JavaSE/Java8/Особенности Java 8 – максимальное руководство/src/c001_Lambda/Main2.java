package c001_Lambda;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        //        Лямбда может ссылаться на члены класса и локальные переменные (неявно делает обращение эффективным
// независимо от того обращается к final полю или нет). Например, эти 2 фрагмента эквиваленты:
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );

//        И:
        final String separator2 = "-";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator2 ) );
    }
}
