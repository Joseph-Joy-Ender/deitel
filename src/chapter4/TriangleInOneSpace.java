package chapter4;

public class TriangleInOneSpace {
    public static void main(String[] args) {
        shapeA();
        System.out.println(' ');
        shapeOne();
        System.out.println(' ');
        shapeB();

    }

    private static void shapeA(){
        for (int i = 1; i <= 10 ; i++) {
            for (int space = i; space <= 9 ; space++) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void shapeB(){
        for (int i = 9; i > 0; i--) {
            for (int space = i; space < 9 ; space++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0 ; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void shapeOne(){
        for (int i = 1; i <= 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(' ');
//
//            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
