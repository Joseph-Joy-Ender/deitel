package chibuzo_task;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sumOfEven = 0;
        for (int i = 0; i <= 10 ; i++) {
            if (i % 2 == 0){
                sumOfEven += i;
            }
        }
        System.out.println("sum of even numbers is: " + sumOfEven);
    }

}
