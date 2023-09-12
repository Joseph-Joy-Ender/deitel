package timeTable;

public class SubtractionTableFor4 {
    public static void main(String[] args) {

        System.out.println("Table " + "  ");

        int num = 4;

        for (int i = 1; i <= 12 ; ++i) {
            System.out.printf("%d - %d = %d\n ", num, i, num - i);

        }
    }
}
