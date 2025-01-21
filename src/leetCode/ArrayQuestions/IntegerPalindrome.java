package leetCode.ArrayQuestions;

public class IntegerPalindrome {
    public static boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        StringBuilder reversedX = new StringBuilder();
        System.out.println(xString.length());
        for(int i = xString.length() - 1; i >= 0; i --){
            reversedX.append(xString.charAt(i));
        }
        System.out.println(reversedX);

        return xString.contentEquals(reversedX);

    }

    public static void main(String[] args) {

        System.out.println(IntegerPalindrome.isPalindrome(10));
    }
}

