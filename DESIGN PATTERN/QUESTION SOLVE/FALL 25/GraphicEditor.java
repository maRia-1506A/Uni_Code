interface Shape {
    Shape clone();

    void display();
}

class Circle implements Shape {
    private double r;
    private String color;

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public Shape clone() {
        return new Circle(this.r, this.color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Radious is: " + r);
        System.out.println("Color is: " + color);
    }
}

class Rectangle implements Shape {
    private double h, w;
    private String color;

    public Rectangle(double h, double w, String color) {
        this.h = h;
        this.w = w;
        this.color = color;
    }

    public Shape clone() {
        return new Rectangle(this.h, this.w, this.color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Width: " + w);
        System.out.println("Height: " + h);
        System.out.println("Color: " + color);
    }

}

public class GraphicEditor {
    public static void main(String[] args) {
        Shape circle1 = new Circle(30, "White");
        System.out.println("original: ");
        circle1.display();

        Circle circle2 = (Circle) circle1.clone();
        circle2.setColor("Black");
        System.out.println("Clone");
        circle2.display();

        Shape rec1 = new Rectangle(5, 10, "Red");
        System.out.println("original: ");
        rec1.display();
        Rectangle rec2 = (Rectangle) rec1.clone();
        rec2.setColor("Blue");
        System.out.println("Clone");
        rec2.display();

    }

}
