package arraysSnacks;
public class CreditCardValidator {


    public static int evenPlaced(long creditCardNumber) {
        int sumOfEvenPlaced = 0;
        String number = creditCardNumber + " ";
        for (int i = (int) (sizeOfCreditCard(creditCardNumber) - 2); i >= 0; i -= 2) {
            sumOfEvenPlaced += gettingTheDigitsOfTheCreditCard(Integer.parseInt(number.charAt(i) + " ") * 2);
        }
        return sumOfEvenPlaced;
    }

    public static long sizeOfCreditCard(long digits) {
        String digit = digits + " ";
        return digit.length() - 1;

    }

    public static int gettingTheDigitsOfTheCreditCard(int creditCardNumber) {
        if (creditCardNumber < 9)
            return creditCardNumber;
        else {
            int first = creditCardNumber / 10;
            int second = creditCardNumber % 10;
            return first + second;
        }

    }



    public static long oddPlaced(long creditCardNumber){
        int sumOfOddlyPlaced = 0;
        String number  = creditCardNumber + " ";
        for (int i = (int) (sizeOfCreditCard(creditCardNumber) - 1); i >= 0 ; i -= 2) {
            sumOfOddlyPlaced += Integer.parseInt(number.charAt(i) + " ");

        }
        return sumOfOddlyPlaced;
    }

    public static void main(String[] args) {
      //  System.out.println(CreditsCardValidators.lengthOfCreditCardNumber(4388576018410707L));
       // System.out.println(gettingTheDigitsOfTheCreditCard(543217689));
       // System.out.println(CreditsCardValidators.checkingTheValidityOfTheCard(4388576018402626L));
        System.out.println(CreditsCardValidators.lengthOfCreditCardNumber(4388576018402626L));
        System.out.println(CreditsCardValidators.creditCardType(4388576018402626L));
        System.out.println(CreditsCardValidators.addNumbersGreaterThanNine(4388576018402626L));
        System.out.println(CreditsCardValidators.additionOfEvenlyPlacedAndOddlyPlaced(4388576018402626L));
        long creditCardNumber = 4388576018402626L;
        String number = creditCardNumber + "";
        System.out.println(CreditsCardValidators.oddlyPLaced(number.toCharArray()));
        System.out.println(CreditsCardValidators.evenPlaced(number.toCharArray()));
       // System.out.println(CreditsCardValidators.checkingTheValidityOfTheCard(4388576018402626L));
        // System.out.println(CreditsCardValidators.creditCardType(9788576018402626L));
    }
}
