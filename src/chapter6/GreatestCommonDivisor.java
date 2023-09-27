package chapter6;

public class GreatestCommonDivisor {

    public static int gcd(int number1, int number2){
        if (number1 < 0 && number2 < 0) return 0;
        int greatestDivisor = 1;
        for (int i = 1; i <= number1 && i <= number2 ; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                greatestDivisor = i;

            }
        }
        return greatestDivisor;
    }
}
