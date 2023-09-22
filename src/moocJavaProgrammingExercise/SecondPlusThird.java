package moocJavaProgrammingExercise;

import java.util.ArrayList;

public class SecondPlusThird {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(0);

        System.out.println(arrayList.get(2) + arrayList.get(1));
        System.out.println(arrayList.get(3) + arrayList.get(4));
    }
}
