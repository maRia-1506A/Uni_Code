// Create an Employee class with attributes name, id, salary and both default and parameterized constructors.

public class Employee {
    String name;
    int id;
    double salary;

    // default
    public Employee() {
        name="Maria";
        id=101;
        salary=10000;
    }

    // parameterized
    public Employee(String name, int id, double salary) {
        this.name= name;
        this.id= id;
        this.salary= salary;
    }

    public static void main(String[] args) {
        Employee e1= new Employee();
        Employee e2= new Employee("Zannatul Farzana", 106, 20000);

        System.out.println(e1.name);
        System.out.println(e2.id);
    }
}
