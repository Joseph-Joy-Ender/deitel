package w3resource.vehicle;

import w3resource.vehicle.Vehicular;

public class Cars extends Vehicular {
    private int noSeats;

    public Cars(String make, String model, String year, String fuelType, double fuelEfficiency, int noSeats) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.noSeats = noSeats;
    }

    public int getNoSeats() {
        return noSeats;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getNoSeats() / 5.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 120.0;
    }
}
