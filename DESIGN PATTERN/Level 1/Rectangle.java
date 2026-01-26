import java.lang.*;

public class Rectangle {
    float length, width;

    Rectangle(float length, float width) {
        this.length= length;
        this.width= width;
    }

    public float area() {
        return length*width;
    }

    public static void main(String[] args) {
        Rectangle rc= new Rectangle(10, 20);
        System.out.println("The area of the rectangle is: "+rc.area());
    }
}
