package chapter4;

public class Triangle {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                for (int k = 0; k < 10; k++) {
                    for (int l = 1; l <= i; l++) {
                        System.out.print("*");


                    }


                }


            }
        }
    }
}

//for (int k = 10; k > 0; k--) {
//        for (int l = k; l < 10; l++) {
//        System.out.print(" ");
//        }
//        for (int m = 5; m <= k ; m++) {
//        System.out.print("*");
//        }
//
//        }
