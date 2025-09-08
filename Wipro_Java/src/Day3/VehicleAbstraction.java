package Day3;

import java.util.Scanner;

abstract class Vehicle {
    abstract void startEngine();
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Starting car engine...");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Starting bike engine...");
    }
}

public class VehicleAbstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        Vehicle v;

        if (input.equals("car")) {
            v = new Car();
        } else if (input.equals("bike")) {
            v = new Bike();
        } else {
            System.out.println("Invalid vehicle type.");
            scanner.close();
            return;
        }

        v.startEngine();
        scanner.close();
    }
}
