// Parent class
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method
    void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + " km/h");
    }
}

// Child class
class Car extends Vehicle {
    int seats;

    Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }

    // Overriding method
    void displayInfo() {
        System.out.println("Car Brand : " + brand);
        System.out.println("Speed     : " + speed + " km/h");
        System.out.println("Seats     : " + seats);
    }
}

// Main class
public class TestVehicle {
    public static void main(String args[]) {

        Vehicle v = new Vehicle("Honda", 120);
        Car c = new Car("Toyota", 180, 5);

        System.out.println("Vehicle Details:");
        v.displayInfo();

        System.out.println("\nCar Details:");
        c.displayInfo();
    }
}
