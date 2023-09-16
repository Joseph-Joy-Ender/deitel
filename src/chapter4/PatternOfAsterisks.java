package chapter4;

public class PatternOfAsterisks {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) System.out.print(" ");
            for (int j = 0; j <= 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


