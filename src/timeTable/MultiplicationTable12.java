package timeTable;

public class MultiplicationTable12 {
    public static void main(String[] args) {
        System.out.print("S/N " + "     ");
        System.out.println("Table " + "  ");

        int num = 24;
        for (int count = 1; count <= 12; ++count) {
            System.out.printf("%d * %d = %d \n", num, count, num * count);

        }

    }

}

