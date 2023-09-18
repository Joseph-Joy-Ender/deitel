package chapter5;

public class RightAngledTriangle {


    public static void rightAngledTriangle(int height){
        for (int i = 1; i < height; i++) {
            printSpace(height);
            printStar(i);
            System.out.println();
        }
    }

    public static void printSpace(int numberOfSpace){
        for (int space = numberOfSpace; space > 0 ; space--) {
            System.out.print(" ");

        }
    }

    public static void printStar(int numberOfStars) {
        for (int i = 0; i < numberOfStars ; i++) {
            System.out.print("* ");
        }

    }

    public static void printSquare(int numberOfSides){
        for (int i = 0; i < numberOfSides; i++) {
            printStar(numberOfSides);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightAngledTriangle(7);
        printSquare(9);
    }
}
