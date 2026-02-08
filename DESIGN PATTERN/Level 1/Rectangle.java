/**Create a class Rectangle with length and width as attributes. Include a method to 
calculate and return the area.**/

public class Rectangle {
    float length, width;

    public float area() {
        return length*width;
    }

    public static void main(String[] args) {
        Rectangle rc= new Rectangle();
        rc.length=5;
        rc.width=6;
        System.out.println("The area of the rectangle is: "+rc.area());
    }
}
