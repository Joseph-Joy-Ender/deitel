package chapter4;

public class Mystery2 {
    public static void main(String[] args) {
//        int count = 1;
//
//        while (count <= 20){
//            System.out.println(count % 3 == 1 ? "#########" : "++++++++++");
//            ++count;
//        }
//
//        int row = 5;
//        while (row >= 1){
//            int column = 5;
//
//            while (column >= 1){
//                System.out.println(row % 2 == 0 ? "X" : "0");
//                ++column;
//            }
//            --row;
//            System.out.println();
//        }
//

        for (int row = 0; row < 5 ; row++) {
            for (int column = 0; column < 10; column++) {
                System.out.print(" * ");
             //   System.out.print(" ");

            }
            System.out.println();
        }
       // System.out.println();
    }
}
