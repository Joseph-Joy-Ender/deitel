package task;

import java.util.HashMap;

public class CharacterFrequency {

    public static String characterCount(String word){
        HashMap<Character, Integer> diction = new HashMap<>();
       for (char ch: word.toCharArray()){
           diction.put(ch, diction.getOrDefault(ch, 0) + 1);
       }

        return String.valueOf(diction);
    }

    public static int count(String[] array, String element){
        int count = 0;
        for(String word: array){
            if (word.equals(element)) count++;
        }
        return count;
    }

    public static int count(String element){
        return element.length();
    }



    public static void main(String[] args) {
        String word = "semicolon.africa";
        System.out.println(characterCount(word));

    }
}
