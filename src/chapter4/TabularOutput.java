package chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("N                  N1                   N2                  N3                N4");

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i);
            int currentValue = i;
            for (int j = 0; j < 4; j++) {
                System.out.print("\t\t\t\t\t");
                currentValue = currentValue * i;
                System.out.print(currentValue);

            }
            System.out.println();

        }
    }
}
