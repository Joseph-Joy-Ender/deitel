package w3resource.vehicle;

import w3resource.vehicle.Vehicular;

public class Motorcycle extends Vehicular {
    private double engineDisplacement;
    public Motorcycle(String make, String model, String year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType, fuelEfficiency);
//        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement(){
        return engineDisplacement;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 80.0;
    }
}
