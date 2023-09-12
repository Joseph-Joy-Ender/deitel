package randomExercises;

public class Widening {
    public static void main(String[] args) {
        int number1 = 100;
        float number = number1;
        System.out.println(number1);
        System.out.println(number);

        float number2 = 10.55f;
        int number3 = (int) number2;
        System.out.println(number2);
        System.out.println(number3);

        int number4 = 130;
        byte number5 = (byte) number4;
        System.out.println(number4);
        System.out.println(number5);

        byte number6 = 10;
        byte number7 = 10;
        byte number8 = (byte)(number6 + number7);
        System.out.println(number8);
    }
}
