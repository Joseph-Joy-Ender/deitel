package chapter4dietelExercise;

public class TaxCalculator {
    private String name;
    private int citizens;
    private double earnings;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCitizens(int citizens) {
        this.citizens = citizens;
    }

    public int getCitizens() {
        return citizens;
    }

    public void setEarnings(double earnings) {
        if (earnings < 0) this.earnings = 0;
        else {
            this.earnings = earnings;
        }
    }

    public double getEarnings() {
        return earnings;
    }

    public double calculateTaxRate() {
        double taxRate;
        if (earnings <= 30_000) {
            taxRate = 0.15 * getEarnings();
        } else{
            taxRate = 0.20 * getEarnings();
        }
        return taxRate;
    }
}
