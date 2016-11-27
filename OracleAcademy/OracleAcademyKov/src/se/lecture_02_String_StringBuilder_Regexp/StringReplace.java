package se.lecture_02_String_StringBuilder_Regexp;

/**
 * Created by mega on 24.11.2016.
 */
public class StringReplace {
    public static final String TEXT = "РКЕНКаЙланд ПРаЙланд Мне очень нравится ТаЙланд." +
            " Таиланд это то место куда бы я поехал. тайланд - мечты сбываются!";
    public static void main(String[] args) {
        System.out.println(TEXT);
        System.out.println("------------------------------------------");
        String s = TEXT.replaceAll("ТаЙланд|Таиланд|тайланд", "Тайланд");
        System.out.println(s);
        System.out.println("------------------------------------------");
        System.out.println(TEXT.replace("ТаЙланд", "Тайланд"));
        System.out.println("------------------------------------------");
        System.out.println(TEXT.replaceAll("[а-яА-Я]{1,5}а[ийЙ]ланд", "Тайланд"));
    }
}
