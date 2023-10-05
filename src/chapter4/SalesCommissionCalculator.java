package chapter4;

public class SalesCommissionCalculator {

    private double priceForItemSold;


    public int getSALARY(){
        return 200;
    }

    public double getPERCENTAGE() {
        return 0.09;
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
        return getPERCENTAGE() * getPriceForItemSold();
    }


    public double calculateTotalWage() {
        return calculateCommission() + getSALARY();
    }
}
