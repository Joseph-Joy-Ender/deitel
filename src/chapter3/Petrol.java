package chapter3;

public class Petrol {

    private String stationsLocation;
    private String type;
    private int quantity;
    private double price;
    private double discount;

    public Petrol(String stationsLocation, String type, int quantity, double price, double discount) {
        this.stationsLocation = stationsLocation;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public void setStationsLocation(String stationsLocation) {
        this.stationsLocation = stationsLocation;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStationsLocation() {
        return stationsLocation;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public  double getPurchasedAmount(){
        double netPurchase = (quantity * price) - discount;
       double netPurchasedAmount = netPurchase;
       return netPurchasedAmount;
    }

    public static void main(String[] args) {
        Petrol petrol = new Petrol("Ikeja Lagos State", "Diesel", 1000, 450.0, 0.05);
        petrol.setStationsLocation("Ikeja Lagos State");
        petrol.setType("Diesel");
        petrol.setQuantity(1000);
        petrol.setPrice(300.0);
        petrol.setDiscount(0.07);
        System.out.println("The station location is " + petrol.getStationsLocation());
        System.out.println("The type of petrol is " + petrol.getType());
        System.out.println("The quantity of the petrol is " + petrol.getQuantity());
        System.out.println("The discount price is " + petrol.getDiscount());
        System.out.println("The purchase amount is " + petrol.getPurchasedAmount());







    }
}
