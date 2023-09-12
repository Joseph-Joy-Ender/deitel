package timeTable;

public class MultiplicationTable50 {
    public static void main(String[] args) {

        System.out.print("S/N " + "  ");
        System.out.println("Table " + "   ");

        int num = 50;
        for (int count = 1; count <= 12 ; count++) {
            System.out.printf(" %d * %d = %d \n ", num, count, num * count);

        }
    }
}
