/**Create a class Student with private fields (name, id, cgpa). Provide public getters and
setters. Write a separate class StudentTest to verify that fields cannot be accessed directly.(DONE)**/

public class Student {
    private String name;
    private int id;
    private double cgpa;

    public void setStudent(String name, int id, double cgpa) {
        this.name= name;
        this.id= id;
        this.cgpa= cgpa;
    }

    public String getStudent() {
        return "Name: "+name+", Id: "+id+", CGPA: "+cgpa;
    }
    
    public static void main(String[] args) {
        Student s= new Student();
        s.setStudent("Maria", 106, 3.96);
        System.out.println(s.getStudent());
    }
}
