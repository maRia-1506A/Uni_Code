// Create Shape, Circle, and Triangle classes to demonstrate hierarchical inheritance.

public class Shape {
    public void draw() {
        System.out.println("Draw a shape");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        double result = 3.1416 * r * r;
        System.out.println("The area of circle is: " + result);
    }
}

class Triangle extends Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public void area() {
        double result = .5 * b * h;
        System.out.println("The area of triangle is: "+result);
    }


    public static void main(String[] args) {
        Triangle tr= new Triangle(10, 5);
        tr.draw();
        tr.area();

        Circle cr= new Circle(7);
        cr.draw();
        cr.area();
    }
}
