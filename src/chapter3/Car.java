package chapter3;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
            return price;
        }

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes Benz", "two thousand and three", 20000);
        car1.setModel("Mercedes Benz");
        car1.setYear("two thousand and three");
        car1.setPrice(2000000);
        double discount1 = car1.getPrice() * 0.05;
        System.out.println("The model of car is: " + car1.getModel());
        System.out.println("The year of car is: " + car1.getYear());
        System.out.println("The price of car is: " + car1.getPrice());
        System.out.printf("Price after discount is %s%n ", discount1);

        System.out.println();

        Car car2 = new Car("Honda", "two thousand and four", 15000);
        car2.setModel("Honda");
        car2.setYear("two thousand and four");
        car2.setPrice(150000);
        double discount = car2.getPrice() * 0.07;

        System.out.println("The model of car is: " + car2.getModel());
        System.out.println("The year of car is: " + car2.getYear());
        System.out.println("The price of car is: " + car2.getPrice());
        System.out.printf("Price after discount is %.4f%n ", discount);

    }
    }

