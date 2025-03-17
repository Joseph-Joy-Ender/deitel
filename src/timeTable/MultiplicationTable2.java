package timeTable;

public class MultiplicationTable2 {
    public static void main(String[] args) {

        System.out.print("S/N " + "  ");
        System.out.println("Table " + "   ");

        int num = 2;

        for (int count = 1; count <= 10 ; count++) {
            System.out.printf("%d * %d = %d \n ", num, count, num * count);
        }
    }
}
