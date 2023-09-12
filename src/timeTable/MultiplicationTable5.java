package timeTable;

public class MultiplicationTable5 {
    public static void main(String[] args) {

        System.out.println("Table " + "  ");

        int num = 5;
        for (int i = 1; i <= 12 ; i++) {
            System.out.printf("%d * %d = %d\n ", num, i, num * i);

        }
    }
}
