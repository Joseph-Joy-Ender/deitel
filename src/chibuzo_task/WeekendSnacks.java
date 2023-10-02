package chibuzo_task;
import java.util.Arrays;

public class WeekendSnacks {


    public static int largestElement(int[] numbers){
        int largest = 0;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;

    }



    public static boolean elementOccurrenceInAList(int[] firstNumber, int secondNumber){
        for (int numbers : firstNumber) {
            if (numbers == secondNumber)
                return true;
            }
          return false;
        }



    public static String concatenatingTwoLists(char[] characters, int[] numbers) {
        StringBuilder result = new StringBuilder();

        for (char character : characters) {
            result.append(character).append(", ");
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                result.append(numbers[i]).append(", ");
            } else {
                result.append(numbers[i]);
            }

        }
        return result.toString();
    }


        public static String returningAListOfDigits(int input){
            if(input < 0) {
                input = input * -1;

            }
            String inputToString = "" + input;
            int[] numbers = new int[inputToString.length()];

            int temp = input;
            int size = numbers.length - 1;
            int remainder = 0;

            while (temp > 0) {
                remainder = temp % 10;
                numbers[size] = remainder;
                size--;
                temp /= 10;
            }

            return Arrays.toString(numbers);
        }



    public static String reversedArray(int[] numbers) {

        int[] reversedNumbers = new int[numbers.length];
        int size = reversedNumbers.length - 1;
        for ( int i = 0; i < reversedNumbers.length; i++) {
            reversedNumbers[i] = numbers[size];
            size--;
        }

        return Arrays.toString(reversedNumbers);
    }

    public static int sumOfElementUsingForLoop(int[] sumOfNumber){
        int sum = 0;
        for (int j : sumOfNumber) {
            sum += j;
        }
        return sum;

    }

    public static int sumOfElementsUsingWhileLoop(int[] sumOfNumber){
        int sum = 0;
        int number = 0;
        while (number < sumOfNumber.length){
            sum += sumOfNumber[number];
            number++;
        }
        return sum;
    }


    public static int sumOfElementsUsingDoWhileLoop(int[] sumOfNumber){
        int sum = 0;
        int number = 0;
        do {
            sum += sumOfNumber[number];
            number++;
        }
         while (number < sumOfNumber.length);

         return sum;
    }


    public static String runningTotalOfAList(int[] number){
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            number[i] = sum;
        }
        return Arrays.toString(number);
    }


    public static String oddPositions(int[] oddNumbers){
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= oddNumbers.length; i++) {
             if (i % 2 != 0){
                 result.append(oddNumbers[i - 1]).append(" ");

             }
        }
        return result.toString();
        }


        public static String evenPositions(int[] evenNumbers){

        StringBuilder result = new StringBuilder();
            for (int i = 1; i <= evenNumbers.length; i++) {
                if( i % 2 == 0) {
                     result.append(evenNumbers[i - 1]).append(" ");
                }
            }
            return result.toString();
        }


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


        public static String combinedTwoList(char[] characters, int[] numbers){
            String result = "";
            int totalLength = characters.length + numbers.length;
            StringBuilder resultArray = new StringBuilder();
            for (int i = 0; i < totalLength; i++) {
                if( i < characters.length && i < numbers.length) {
                    resultArray.append(characters[i]).append(", ");
                    if(i < numbers.length - 1) {
                        resultArray.append(numbers[i]).append(", ");
                    } else {
                        resultArray.append(numbers[i]);
                    }
                }

            }
            return resultArray.toString();
        }


//    public static void main (String[]args){
//        int[] numbers = {1, 2, 3, 4, 5};
//
//            System.out.println(Arrays.toString(WeekendSnacks.reversedArray(numbers)));
//
//        }

   }