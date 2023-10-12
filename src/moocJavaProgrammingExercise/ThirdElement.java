package moocJavaProgrammingExercise;

import java.util.ArrayList;

public class ThirdElement {
    public static void main(String[] args) {
        ArrayList<String> wordlist = new ArrayList<>();

        wordlist.add("Tom");
        wordlist.add("Emma");
        wordlist.add("Alex");
        wordlist.add("Mary");

        System.out.println(wordlist.get(2));
        System.out.println(wordlist.get(1));
    }
}
