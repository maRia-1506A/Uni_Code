/**Create a Grade class with private marks for three subjects. Provide methods to input
marks, calculate average, and determine grade.**/

public class Grade {
    private float m1, m2, m3;

    public void inputMark(float m1, float m2, float m3) {
        this.m1= m1;
        this.m2= m2;
        this.m3= m3;
    }

    public float average() {
        return m1+m2+m3/3;
    }

    public void gradeDet(){
        float avg= average();
        if(avg >= 80) {
            System.out.println("Grade: A+");
        } else if(avg >75 && avg<80) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: C");
        }
    }

    public static void main(String[] args) {
        Grade g= new Grade();
        g.inputMark(96, 69, 85);
        System.out.println("Average: "+g.average());
        g.gradeDet();

    }
}
