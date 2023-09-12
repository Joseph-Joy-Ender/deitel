package chapter4;

public class Palindrome {


    public String check(String input) {
            if (input.length() != 5){
                for (int i = 0; i < input.length(); i++) {
                    for (int j = input.length(); j > 1; j--) {
                        if (input.charAt(i) == input.charAt(j)) {
                            System.out.println("it is a palindrome");
                        } else System.out.println("it is not");

                    }
                }
            return null;
        }
        return input;
    }

    public int integer(int integer) {
        if (integer != 5){
            System.out.println("Error");
            System.out.println("Enter number again");

        }
        return integer;
    }

    public String viceVersa(String inputs) {
        if (inputs == inputs) {
            System.out.println("It is not a palindrome");
        } else {
            System.out.println("It is a palindrome");
        }
        return inputs;
    }

}