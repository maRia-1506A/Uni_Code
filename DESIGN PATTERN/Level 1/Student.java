public class Student {
    // variable
    String name;
    int id;
    double cgpa;

    // method 
    public void display() {
        System.out.println("Name: "+name+", ID: "+id+", CGPA: "+cgpa);
    }

    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Zanantul Farzana";
        s1.id=106;
        s1.cgpa=3.96;
        s1.display();
    }
}