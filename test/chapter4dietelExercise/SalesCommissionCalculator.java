package chapter4dietelExercise;

public class SalesCommissionCalculator {

    private final int SALARY = 200;
    private final double PERCENTAGE = 0.09;

    private double priceForItemSold;
    private double calculateCommission;

    private double totalWages;


    public int getSALARY(){
        return SALARY;
    }

    public double getPERCENTAGE() {
        return PERCENTAGE;
    }

    public void setPriceForItemSold(double priceForItemSold) {
        if (priceForItemSold < 0) this.priceForItemSold = 0;
        else {
            this.priceForItemSold = priceForItemSold;
        }
    }
    public double getPriceForItemSold() {
        return priceForItemSold;
    }

    public double calculateCommission() {
         calculateCommission = getPERCENTAGE() * getPriceForItemSold();
        return calculateCommission;
    }


    public double calculateTotalWage() {
        totalWages = calculateCommission() + getSALARY();
        return totalWages;
    }
}
