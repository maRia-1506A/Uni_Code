// Create a Calculator class with methods for addition, subtraction, multiplication, and division.

public class Calculator {

    public int addition(int n1, int n2) {
        return n1+n2;
    }

    public int subtraction(int n1, int n2) {
        return n1-n2;
    }

    public int multiplication(int n1, int n2) {
        return n1*n2;
    }

    public double division(double a, double b) {
        return b/a;
    }

    public static void main(String[] args) {
        Calculator c= new Calculator();
        System.out.println("Addition: "+c.addition(10,20));
        System.out.println("Subtraction: "+c.subtraction(10,20));
        System.out.println("Multiplication: "+c.multiplication(10,20));
        System.out.println("Division: "+c.division(100, 200));
    }
}
