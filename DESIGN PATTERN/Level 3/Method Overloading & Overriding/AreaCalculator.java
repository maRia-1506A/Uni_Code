// Create overloaded methods in a class AreaCalculator to calculate area for different shapes.

public class AreaCalculator {
    double calculateArea(double r) {
        return 3.14 * r * r;

    }

    double calculateArea(double h, double w) {
        return h*w;

    }
    public static void main(String[] args) {
        AreaCalculator result= new AreaCalculator();
        System.out.println("Area of a circle: "+result.calculateArea(1));
        System.out.println("Area of a rectangle: "+result.calculateArea(2, 3));
    }

}
