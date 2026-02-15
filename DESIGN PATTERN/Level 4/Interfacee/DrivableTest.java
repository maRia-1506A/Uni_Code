// Create an interface Drivable with methods start() and stop() implemented by Car and Bike.

interface Drivable {
    void start();
    void stop();
}

class Car implements Drivable {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Bike implements Drivable {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class DrivableTest {
    public static void main(String[] args) {
        Drivable d1= new Car();
        Drivable d2= new Bike();

        d1.start();
        d2.start();
        System.out.println();
        d1.stop();
        d2.stop();
    }
}
