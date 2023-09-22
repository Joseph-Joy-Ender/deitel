package chapter4;

public class MultiplyingNumber {


    public static int multiply(int number1, int number2){
        if (number2 < 0){
            int result = 0;
            for (int count = number1; count >= 1 ; count--) {
                result += number2;

            }
            return result;
        }
            int result = 0;
            for (int i = 1; i <= number2; i++) {
               result += number1;

        }
        return result;
    }


}
