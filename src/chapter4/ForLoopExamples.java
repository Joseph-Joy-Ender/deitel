package chapter4;

public class ForLoopExamples {
    public static void main(String[] args) {
//        for (int i = 7; i <= 77 ; i+= 7) {
//            System.out.println(i);
//
//        }
//        for (int i = 50; i >= 0 ; i-= 11) {
//            System.out.println(i);
//
//        }
//
//        int count = 50;
//        while (count >= 0){
//            System.out.println(count);
//            count -= 11;
//        }
//
//        int j = 7;
//        while (j <= 77){
//            System.out.println(j);
//            j += 7;
//        }

        for (int i = 0; i <= 15 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();


        }
        System.out.println();

            for (int row = 10; row >= 0; row--) {
                for (int column = 0; column < row; column++) {
                    System.out.print("#");

                }
                System.out.println();

            }

        System.out.println();

        for (int i = 0; i <= 10 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("%");
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 10; i >= 0 ; i--) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("Joy");

            }
            System.out.println();
        }

        System.out.println();


        int counter = 1;
        do {
            System.out.print("\t" + counter);
            counter++;
        }while (counter <= 10);
        System.out.println();
    }
}
