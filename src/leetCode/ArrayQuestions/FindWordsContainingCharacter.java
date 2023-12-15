package leetCode.ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x){
        List<Integer> count =  new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) count.add(i);

            }


        }
        return count;
    }

    public static void main(String[] args) {
        FindWordsContainingCharacter findWord = new FindWordsContainingCharacter();
        String[] words = {"leet", "code"};
        char ch = 'e';
        System.out.println(findWord.findWordsContaining(words, ch));
    }
}
