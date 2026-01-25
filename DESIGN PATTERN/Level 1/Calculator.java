import java.util.Scanner;
import java.lang.*;;

public class Calculator {
    double n1, n2;

    Calculator(double n1, double n2) {
        this.n1= n1;
        this.n2= n2;
    }

    public double addition() {
        return n1+n2;
    }

    public double subtraction() {
        return n1-n2;
    }

    public double multiplication() {
        return n1*n2;
    }

    public double division(double a, double b) {
        return b/a;
    }

    public static void main(String[] args) {
        Calculator c= new Calculator(10, 20);
        System.out.println("Addition: "+c.addition());
        System.out.println("Subtraction: "+c.subtraction());
        System.out.println("Multiplication: "+c.multiplication());
        System.out.println("Division: "+c.division(100, 200));
    }
}
