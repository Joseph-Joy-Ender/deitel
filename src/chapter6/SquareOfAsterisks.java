package chapter6;

public class SquareOfAsterisks {

    public static void square(int numberOfRowAndColumn){
        for (int row = 0; row < numberOfRowAndColumn; row++) {
            for (int column = 0; column < numberOfRowAndColumn; column++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        square(10);
    }
}
