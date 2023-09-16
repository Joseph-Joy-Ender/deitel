package chapter4;

public class FullTriangle2 {
    public static void main(String[] args) {
        for (int i = 0; i < 7 ; i++) {
            for (int space = i; space < 7; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }

        for (int row = 8; row > 0 ; row--) {
            for (int spaces = row; spaces < 7 ; spaces++) {
                System.out.print("  ");
            }
            for (int j = row; j > 0 ; j--) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
