public class Vehicle {

    public void move(){
        System.out.println("Vehicle is moving");
    }
    
}

class Car extends Vehicle {
    public void speed() {
        System.out.println("The car is in full speed");
    }

    public static void main(String[] args) {
        Car car= new Car();
        car.move();
        car.speed();
    }
}