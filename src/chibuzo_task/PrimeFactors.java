package chibuzo_task;
public class PrimeFactors {

    public static void primeNumbers(int number){
        for (int i = 2; i <= (number - 1) ; i++) {
            if (number % i == 0){
                System.out.println(i);
            }

        }

    }

    public static void primeNumberFactors(int numbers){


    }

    public static void main(String[] args) {
        int number = 12;
        primeNumbers(number);
    }
}
