package chapter4;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 6 ; i++) {
            int j;
            for (j = 1; j <= i; j++) {

            }
            System.out.print(i);

            System.out.print(j);
        }

//        int product = 3;
//        while (product <= 100){
//            product = 3 * product;
//            System.out.println("Product is = " + product);
//        }
    }
}
