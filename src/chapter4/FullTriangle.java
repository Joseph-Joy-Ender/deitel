package chapter4;

public class FullTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int space = i; space < 5; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int row = 0; row < 5; row++) {
                  for (int spaces = i; spaces < 5; spaces++) {
                    System.out.print(" ");

                 for (int k = 0; k <= row; k++) {
                System.out.print(" * ");
            }
               }

            }

            System.out.println();

        }
    }
}