package task;

import java.util.HashMap;

public class HashMapExamples {


    public static String hashes(String name, int age){
        HashMap<String, Integer> people = new HashMap<>();
        String result = "";
        people.put(name, age);
        for (String i: people.keySet()){
            result = i + ": " + people.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "John";
        int age = 32;
        System.out.println(hashes(name, age));

    }
}
