package task;

public class PalindromeClassTask {

    public static boolean isPalindrome (String str){
        str = str.toLowerCase();
        if (str.length() <= 1) return true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }



}
