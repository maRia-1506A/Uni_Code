/**Create a base class Person with a protected field nationalId. Create a subclass
Employee in a different package and show that Employee can access nationalId through inheritance.**/

public class Employee1 extends Person1 {
    public static void main(String[] args) {
        Employee1 emp= new Employee1();
        emp.nationalId= 12456;
        System.out.println(emp.nationalId);
    }
}

// this code works
