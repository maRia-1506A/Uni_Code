// Create classes Person -> Employee -> Manager to demonstrate multilevel inheritance.

public class Person {
    String name;
}

class Employee extends Person {
    int id;    
}

class Manager extends Employee{
    double salary;

    public static void main(String[] args) {
        Manager m= new Manager();
        m.name="Maria";
        m.id= 222;
        m.salary=10500.98;
        System.out.println("Name: "+m.name);
    }
}
