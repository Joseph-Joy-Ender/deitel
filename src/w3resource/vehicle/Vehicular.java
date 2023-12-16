package w3resource.vehicle;

public abstract class Vehicular {
    private String make;
    private String model;
    private String year;
    private String fuelType;
    private double fuelEfficiency;

    public Vehicular(String make, String model, String year, String fuelType, double fuelEfficiency){
        this.fuelType = fuelType;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
    }
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }

    public String getFuelType(){
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract double calculateFuelEfficiency();
    public abstract  double calculateDistanceTraveled();
    public abstract double getMaxSpeed();
}
