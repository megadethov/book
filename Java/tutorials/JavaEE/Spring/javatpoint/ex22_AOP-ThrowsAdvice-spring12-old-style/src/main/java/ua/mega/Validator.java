package ua.mega;

public class Validator {
    public void validate(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("Not valid Age");
        } else {
            System.out.println("vote confirmed");
        }
    }
}
