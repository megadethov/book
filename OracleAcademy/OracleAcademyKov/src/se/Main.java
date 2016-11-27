package se;

public class Main {
    public static void main(String[] args) {

        String moneyTableFormat = "%-5s%-11s%-25s%-11s%n";

        System.out.printf(moneyTableFormat, "Код", "За единиц", "Валюты", "Рублей РФ");

        System.out.println("---------------------------------------------------");

        System.out.printf(moneyTableFormat,
                "AUD", 1, "Австралийский доллар", 44.9883);

        System.out.printf(moneyTableFormat,
                "GBP", 1, "Фунт стерлингов", 86.8429);

        System.out.printf(moneyTableFormat,
                "BYR", 10000, "Белорусский рубль", 39.7716);

        System.out.printf(moneyTableFormat,
                "DKK", 10, "Датская крона", 84.9192);

        System.out.printf(moneyTableFormat,
                "USD", 1, "Доллар США", 58.4643);

        System.out.printf(moneyTableFormat, "EUR", 1, "Евро", 63.3695);

        System.out.printf(moneyTableFormat,
                "KZT", 100, "Казахский тенге", 31.4654);
    }
}
