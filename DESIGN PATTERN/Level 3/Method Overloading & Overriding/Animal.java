// Create Animal, Dog, and Cat classes where Dog and Cat override makeSound().

public class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
    public static void main(String[] args) {
        Animal a= new Animal();
        Animal d= new Dog();
        Animal c= new Cat();
        
        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
