package Day3;

public class Carmain {
    public static void main(String[] args) {
        Carclass car = new Carclass();

        car.startEngine();
        car.setSpeed(80);
        car.setFuelLevel(40.5);

        System.out.println("Engine On: " + car.isEngineOn());
        System.out.println("Speed: " + car.getSpeed() + " km/h");
        System.out.println("Fuel Level: " + car.getFuelLevel() + " liters");

        car.stopEngine();
        System.out.println("Engine On: " + car.isEngineOn());
    }
}
