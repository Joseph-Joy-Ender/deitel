package chapter3;

public class BikeTest {
    public static void main(String[] args) {

        chapter3.Bike joyBike = new Bike();

        joyBike.setName("Yaris");
        System.out.println("Name of bike is " + joyBike.getName());

        joyBike.setName("Toyota");
        System.out.println("New name is " + joyBike.getName());

        joyBike.setOn(true);
        System.out.println("Bike is on " + joyBike.isOn());

        joyBike.setOn(false);
        System.out.println("Bike is on " + joyBike.isOn());
    }
}
