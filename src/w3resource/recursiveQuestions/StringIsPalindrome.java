package w3resource.recursiveQuestions;

public class StringIsPalindrome {
    public boolean stringIsPalindrome(String word){
        if (word.length() <= 1) return true;
        char first = word.charAt(0);
        char second = word.charAt(word.length() - 1);
        if (first != second) return false;
        String remaining = word.substring(1, word.length() -1);
        return stringIsPalindrome(remaining);
    }
}
