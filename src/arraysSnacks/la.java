package arraysSnacks;

import java.util.*;

public class la {
    public static void main(String[] args) {

        List<String> books = Arrays.asList("Effective java", "Clean code", "Refactoring");

   books.sort(Comparator.comparingInt(String::length));
    }

}

