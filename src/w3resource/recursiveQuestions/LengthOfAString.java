package w3resource.recursiveQuestions;

public class LengthOfAString {
    public int lengthOfString(String word){
        if (word.isEmpty()) return 0;
        return 1 + lengthOfString(word.substring(1));
    }
}
