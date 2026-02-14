// Create an abstract class Shape and implement concrete Rectangle and Circle classes.

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape{
    double l, w;

    Rectangle(double l, double w){
        this.l= l;
        this.w= w;
    }
    
    @Override
    double area() {
        return l*w;
    }
}

class Circle extends Shape{
    double r;

    Circle(double r) {
        this.r=r;
    }

    @Override
    double area() {
        return 3.14*r*r;
    }
}

public class ShapeTest{
    public static void main(String[] args) {
        Shape s1= new Rectangle(5, 10);
        Shape s2= new Circle(1);

        System.out.println("Area of rectangle: "+s1.area());
        System.out.println("Area of circle: "+s2.area());
    }
}
