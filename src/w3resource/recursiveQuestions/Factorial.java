package w3resource.recursiveQuestions;

public class Factorial {
    public int calculateFactorial(int number){
        if (number == 0) return 1;
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        Factorial factor = new Factorial();
        System.out.println(factor.calculateFactorial(5));
        int factorial = factor.calculateFactorial(7);
        System.out.println(factorial);

    }
}
