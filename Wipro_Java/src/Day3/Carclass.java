package Day3;

public class Carclass {
    private boolean engineStatus;
    private int speed;
    private double fuelLevel;

    public void startEngine() {
        engineStatus = true;
    }

    public void stopEngine() {
        engineStatus = false;
    }

    public boolean isEngineOn() {
        return engineStatus;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
