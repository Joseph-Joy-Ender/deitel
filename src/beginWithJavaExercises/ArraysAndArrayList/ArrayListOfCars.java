package beginWithJavaExercises.ArraysAndArrayList;

import java.util.ArrayList;

public class ArrayListOfCars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Mercedes");
        cars.add("Camry");
        cars.add("Bentley");

        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
    }
}
