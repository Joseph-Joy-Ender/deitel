package beginWithJavaExercises;

public class ReverseNumber {
    public static int reverseNumber(int number) {
        int reverse = 0;
        int temp = number;
        int remainder;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        return reverse;
    }

}