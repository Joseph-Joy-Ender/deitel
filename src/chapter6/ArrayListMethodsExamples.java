package chapter6;

import java.util.ArrayList;

public class ArrayListMethodsExamples {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, "Water");
        arrayList.add(1, "Pure water");
        System.out.println("get an index -> " + arrayList.get(1));
        System.out.println("size of my arrayList -> " + arrayList.size());
        System.out.println("i want to remove something -> " + arrayList.remove(0));
        System.out.println("What is my size again -> " + arrayList.size());

    }
}
