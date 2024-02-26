package chapter5;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        shape1();
        shape2();
        shape3();
    }
    private static void shape1(){
        for (int i = 1; i <= 5; i++) {
            for (int space = i; space < 6 ; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    private static void shape2(){
        for (int i = 0; i < 6; i++) {
            System.out.print("* ");

        }
        System.out.println();
    }
    private static void shape3(){
        for (int i = 5; i > 0 ; i--) {
            for (int spaces = i; spaces < 6; spaces++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
