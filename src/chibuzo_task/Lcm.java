package chibuzo_task;

import java.util.Stack;

public class Lcm {

    public static Stack<Integer> lcm(int ... number){
        Stack<Integer> result = new Stack<>();
        int ans = number.length;

        for (int i = ans - 1; i >= 0; i--) {
            if (ans % 2 == 1){
              result.add(2);
            }
        }

        for (int i = 3; i <= Math.sqrt(ans); i += 2) {
            while(ans % i == 0) {
                result.add(i);
            }
        }

        if(ans > 2) {
            result.add(ans);
        }

        return result;
    }




    public static void main(String[] args) {
        int [] number = {8,16,12};
        System.out.println(lcm(number));
    }
}
