package timeTable;

public class MultiplicationTable3 {
    public static void main(String[] args) {

        System.out.println("S/N " + "  ");
      //  System.out.print("Times " + "  ");
       // System.out.println(" =  ");

        int num = 3;
        for (int i = 1; i <= 12 ; i++) {
            System.out.printf("%d * %d = %d\n ", num, i, num * i);
        }
    }
}
