package se.lecture_03_Exception_junit.item_2;

public class Main {
    public static void main(String[] args) throws Exception {
//        exTest1(); // летит Exception
//        exTest2(); // catch NPE
        exTest3(); // летит RuntimeException
    }

    public static void exTest1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) { // поймал и снова бросил
            throw e;
        }
    }

    public static void exTest2() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("catch NPE"); // ловит NPE
        } catch (Exception e2) {
            System.out.println("catch Exception"); // не сработал
        }
    }

    public static void exTest3() {
        try {
            try {
                throw new Exception(); // летит Exception
            } catch (Exception e) { // здесь его поймали
                throw new Exception(); // и бросили уже другой Exception
            } // из вложенного t-c летит Exception

        } catch (Exception e) { // здесь мы ловим летящий из вложенного t-c Exception
            System.out.println("Catch Exception");
            throw new RuntimeException(); // и бросаем новый RuntimeException
        } catch (Throwable th) { // здесь RuntimeException не будет пойман, тк два catch не могут вместе работать
            System.out.println("Throwable kill them all");
        }
    }
}
