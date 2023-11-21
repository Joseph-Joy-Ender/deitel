package chapter5;


public class ChristmasTree {


    public static void shape2(){
        for (int i = 0; i < 6; i++) {
            for (int space = i; space <= 8 ; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void shape1(){
        for (int i = 0; i <= 15; i++) {
            for (int space = i; space < 15; space++) {
                System.out.print(" ");
                }
            for (int j = 0; j < i ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
            }

        }


    public static void main(String[] args) {
        shape1();
        shape2();
    }

    }

