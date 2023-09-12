package randomExercises;

public class DivisionalNumbersUsingIfLoop {
    public static void main(String[] args) {

        for (int i = 1; i < 20; ++i) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
            for (int j = 1; j < 20; ++j) {
                if (j % 3 == 0){
                    System.out.println(j);
                }

            }
        for (int k = 1; k < 20; ++k) {
            if (k % 2 != 0){
                System.out.println(k);
            }

        }
    }
}
