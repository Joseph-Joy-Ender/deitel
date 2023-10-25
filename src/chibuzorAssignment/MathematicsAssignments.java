package chibuzorAssignment;
public class MathematicsAssignments {


    public static double divide(int firstNumber, int secondNumber){
        if (secondNumber == 0){
            return 0;
        }else return (double) firstNumber / secondNumber;
    }


    public static boolean palindrome(String number){
        StringBuilder backward = new StringBuilder();
        int numberOfLength = 0;

        numberOfLength = numberOfLength + number.length();
        for (int i = numberOfLength - 1; i >= 0; i--) {
            backward.append(number.charAt(i));
        }
        return number.contentEquals(backward);
    }

    public static int factors(int number){
        int total = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count == 0)total++;
        }
        return total;
    }

    public static int subtract(int number1, int number2){
        return Math.abs(number1 - number2);
    }



    public static boolean isPrimeNumber(int number){
        if(number == 1) {
            return false;
        }
        int flag = 0;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        return flag != 1;
    }


    public static int factorial(int number){
        int total = 1;

        for (int i = 1; i <= number; i++) {
            total = total * i;
        }
        return total;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;

    }

    public static boolean isSquare(int number){
        double squareRoot = Math.sqrt(number);
        int wholeNumberPart = (int) squareRoot;
        double fractionalPart = squareRoot - wholeNumberPart;
        return !(fractionalPart > 0.0);
    }

    public static void main(String[] args) {
        int number = 12;
        System.out.println(MathematicsAssignments.factors(number));
    }
}
