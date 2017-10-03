package se.lecture_01_AdvancedClasses.item1_8;

public class $MethodReferenceDemo {
    public static void main(String[] args) {

        // var 1
        FuncPrint funcPrint = new FuncPrint() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };
        funcPrint.print("Hello");

        // var 2
        funcPrint = s -> System.out.println(s);
        funcPrint.print("Hello");

        // var 3
        funcPrint = System.out::println; // здесь мы не пишем реализацию, а указываем готовую кдасс::метод
        funcPrint.print("Hello");

    }
}

interface FuncPrint{
    void print(String str);
}

