package se.lecture_03_Exception_junit.item_6;

public class SalaryException extends Exception { // расширяем Exception

    private Exception hiddenException; // поле - ссылка типа Exception

    // конструктор
    public SalaryException(String message, Exception hiddenException) {
        super(message); // вызываем конструктор предка
        this.hiddenException = hiddenException;
    }

    // конструктор
    public SalaryException(String message) {
        super(message);
    }

    // геттер для поля hiddenException
    public Exception getHiddenException() {
        return hiddenException;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            salary(0);
//            salary(1);
        } catch (SalaryException e) {
            System.out.println(e.toString());
            System.out.println(e.getHiddenException());
        }
    }

    public static double salary(int coefficient) throws SalaryException {
        double res; // результат расчета
        try {
            res = 10 - 100 / coefficient;
            if(res < 0) {
                throw new SalaryException("negative salary");
            }
        } catch (ArithmeticException e) {
            throw new SalaryException("div by zero", e);
        }
         return 0;
    }


}
