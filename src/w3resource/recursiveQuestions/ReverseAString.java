package w3resource.recursiveQuestions;

public class ReverseAString {
    public String reversedString(String word) {
        if (word.isEmpty() || word.length() == 1) return word;
        return reversedString(word.substring(1)) + word.charAt(0);


    }


}
