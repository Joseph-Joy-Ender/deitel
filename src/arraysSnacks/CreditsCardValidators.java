package arraysSnacks;


import org.jetbrains.annotations.NotNull;

public class CreditsCardValidators {

   public static long evenPlaced(@NotNull char[] creditCardNumber){
       int total = 0;
       for (int i = creditCardNumber.length; i > 0 ; i--) {
           if (i % 2 != 0) {
               int result = (Integer.parseInt(String.valueOf(creditCardNumber[i - 1])) * 2);
               if (result > 9) total += (int) addNumbersGreaterThanNine(result);
                else total += result;
           }
       }
     return total;

   }


 public static long addNumbersGreaterThanNine(long creditCardNumber){
       int sum = 0;
       while (creditCardNumber > 0){
           int remainder = (int) (creditCardNumber % 10);
           sum += remainder;
           creditCardNumber /= 10;
       }
       return sum;
 }


 public static long oddlyPLaced(@NotNull char[] creditCardNumber){
       int total = 0;
     for (int i = creditCardNumber.length; i > 0 ; i--) {
         if (i % 2 == 0) total += Integer.parseInt(String.valueOf(creditCardNumber[i - 1]));
     }
     return total;
 }


 public static int lengthOfCreditCardNumber(long creditCardNumber){
       String lengthOfCard = creditCardNumber + "";
       return lengthOfCard.length();
 }



public static String additionOfEvenlyPlacedAndOddlyPlaced(long creditCardNumber){
    String valid = "Valid";
       String number = creditCardNumber + "";
    if (lengthOfCreditCardNumber(creditCardNumber) >= 13 && lengthOfCreditCardNumber(creditCardNumber) <= 16) {
        int addition = (int) (oddlyPLaced(number.toCharArray()) + evenPlaced(number.toCharArray()));
        if (addition % 10 != 0) valid = "Invalid Card";
    }else valid = "Invalid Card";

    return valid;
}

@NotNull
public static String creditCardType(long creditCardNumber) {
    String number = creditCardNumber + "";
    String firstDigit = number.substring(0, 1);
    String firstTwoDigits = number.substring(0, 2);

    int firstDigitToNumber = Integer.parseInt(firstDigit);
    int firstTwoDigitsToNumber = Integer.parseInt(firstTwoDigits);

    if (firstTwoDigitsToNumber == 37) {
        number = "American Express cards";
    } else if (firstDigitToNumber == 4) {
        number = "Visa cards";
    } else if (firstDigitToNumber == 5) {
        number = "MasterCard";
    } else if (firstDigitToNumber == 6) {
        number = "Discover cards";
    } else {
        number = "Invalid Card";
    }
    return number;

    }


}
