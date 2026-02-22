interface uniSystem{
    uniSystem clone();
    void display();
}

class Student implements uniSystem{
    private String studentId, name, dept;

    public Student(String studentId, String name, String dept) {
        this.studentId= studentId;
        this.name= name;
        this.dept= dept;
    }

    public uniSystem clone() {
        return new Student(this.studentId, this.name, this.dept);
    }

    public void setID(String studentId) {
        this.studentId= studentId;
    }
    public void setName(String name) {
        this.name= name;
    }

    public void display() {
        System.out.println(name+" "+studentId+" "+dept);
    }
}

public class uniSystemManagement {
    public static void main(String[] args) {
        uniSystem s1= new Student("106", "Maria", "SWE");
        System.out.println("Student 1:");
        s1.display();

        Student cloneS1= (Student) s1.clone();
        cloneS1.setID("364");
        cloneS1.setName("Aziz");
        System.out.println("\nStudent 2:");
        cloneS1.display();
    } 
}
