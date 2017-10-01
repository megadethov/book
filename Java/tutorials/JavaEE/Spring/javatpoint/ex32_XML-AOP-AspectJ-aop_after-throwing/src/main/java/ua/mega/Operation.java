package ua.mega;

public class Operation {
    public void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid Age");
        } else {
            System.out.println("Thanks for vote");
        }
    }
}
