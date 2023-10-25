package chibuzo_task;

import java.util.ArrayList;

public class HighestCommonFactor {
    public static ArrayList<Integer> primeFactors(int x) {
        ArrayList<Integer> result = new ArrayList<>();
// the number of 2s
        while(x % 2 == 0) {
            result.add(2);
            x /= 2;
        }

// Number of Odd Numbers
        for (int i = 3; i <= Math.sqrt(x); i += 2) {
            while(x % i == 0) {
                result.add(i);
            }
        }

        if( x > 2) {
            result.add(x);
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 12;
        System.out.println(primeFactors(number));
    }

}
