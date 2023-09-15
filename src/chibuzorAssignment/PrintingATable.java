package chibuzorAssignment;

public class PrintingATable {
    public static void main(String[] args) {
        System.out.println("""
                a             b           pow(a,b)
                1             2            1
                2             3            8
                3             4            81
                4             5            1024
                5             6            15625
                
                
                """);


        System.out.println("a               b              pow(a,b)");
        System.out.println();
        for (int a = 1; a <= 5 ; a++) {
            int b = a + 1;

            int pow = (int) Math.pow(a, b);
            System.out.println(a+                "\t\t\t\t"      +b+           "\t\t\t\t"        +pow);

        }
    }
}
