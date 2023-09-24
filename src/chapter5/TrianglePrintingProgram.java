package chapter5;

public class TrianglePrintingProgram {

    public static void shape1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }



    public static void shape3(){
        for (int i = 10; i > 0 ; i--) {
            for (int space = 6; space > 0; space--) {
                System.out.print(' ');

            }
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println(" ");


    }


    public static void shape2(){
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        shape1();
        shape3();
        shape2();

    }
}
