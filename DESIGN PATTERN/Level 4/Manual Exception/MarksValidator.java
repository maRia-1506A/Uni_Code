/*
Create a class MarksValidator with a method validate(int marks). If marks is outside
0-100, throw an IllegalArgumentException with a clear message.
*/
public class MarksValidator {
    public void validate(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Mark is not valid");
        } else {
            System.out.println("Mark: "+marks);
        }
    }

    public static void main(String[] args) {
        MarksValidator mv= new MarksValidator();

        try{
            mv.validate(101);
        } catch(IllegalArgumentException e) {
            System.err.println(e);
        }
    }
}
