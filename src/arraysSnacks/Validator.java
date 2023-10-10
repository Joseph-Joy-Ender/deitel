package arraysSnacks;

public class Validator {
    public static void main(String[] args) {
        long creditCardNumber = 4388576018410707L;
        String number = creditCardNumber + "";
        String firstDigit = number.substring(0, 1);
        String firstTwoDigits = number.substring(0, 2);

        String creditCardType = "";
        System.out.println(number);
        System.out.println(firstDigit);
        System.out.println(firstTwoDigits);

        // getting the length of the credit card
        int lengthOfCreditCard = number.length();
        System.out.println(lengthOfCreditCard);
        String valid = "Valid";

        int firstDigitToNumber = Integer.parseInt(firstDigit);
        int firstTwoDigitsToNumber = Integer.parseInt(firstTwoDigits);

        if (lengthOfCreditCard >= 13 && lengthOfCreditCard <= 16) {
            // Card is Valid
            int addition = evenPosition(number.toCharArray()) + oddPosition(number.toCharArray());
            System.out.println(addition);
            if(addition % 10 != 0) {
                valid = "Invalid";
            }

            if(firstTwoDigitsToNumber == 37) {
                creditCardType = "American Express cards";
            } else if (firstDigitToNumber == 4) {
                creditCardType = "Visa cards";
            } else if (firstDigitToNumber == 5) {
                creditCardType = "MasterCard";
            } else if (firstDigitToNumber == 6) {
                creditCardType = "Discover cards";
            } else {
               valid = "Invalid";
            }
        } else {
            valid = "Invalid";
        }

        System.out.println("Card Type: " + creditCardType);
        System.out.println("Length of Card: " + lengthOfCreditCard);
        System.out.println("Is Card Valid: " + valid);

        //System.out.println(number.toCharArray());
        //System.out.println(evenPosition(number.toCharArray()));
        //System.out.println(oddPosition(number.toCharArray()));


    }
    public static int evenPosition(char[] number){

        int total = 0;
        for (int i = number.length; i > 0; i--) {
            if( i % 2 != 0) {
                //Even Digit Position
                int result = (Integer.parseInt(String.valueOf(number[i - 1])) * 2);
                //System.out.println(number[i - 1]);
                if( result > 9) {
                   total = total + addNumbersGreaterThanNine(result);
                }else{
                    total = total + result;
                }

            }
        }
        return total;

    }

    public static int addNumbersGreaterThanNine(int number){
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        return sum;
    }

    public static int oddPosition(char[] number){
        int total = 0;
        for (int i = number.length; i > 0; i--) {
            if( i % 2 == 0) {
              //  System.out.println(number[i - 1]);
                total += Integer.parseInt(String.valueOf(number[i - 1]));
            }
        }
        return total;
    }
}

