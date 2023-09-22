package moocJavaProgrammingExercise;

import java.util.ArrayList;

public class IteratingOverAList {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Joseph");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        System.out.println(teachers.get(0));
        System.out.println(teachers.get(1));
        System.out.println(teachers.get(2));
        System.out.println(teachers.get(3));
        System.out.println(teachers.get(4));
        
    }
}
