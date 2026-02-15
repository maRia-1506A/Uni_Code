// Create interfaces Flyable and Swimmable, implement both in a class Duck.
interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable, Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}

public class DuckTest {
    public static void main(String[] args) {
        Duck d= new Duck();
        d.fly();
        d.swim();
    }
}
