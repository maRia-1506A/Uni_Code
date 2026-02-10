// Write a program that handles ArithmeticException when dividing by zero.

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("Continue....");
    }

}
