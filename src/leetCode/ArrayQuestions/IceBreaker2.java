package leetCode.ArrayQuestions;

public class IceBreaker2 {

    public int iceBreaker(int firstNumber, int secondNumber) {
        int product;
        product = firstNumber % secondNumber;
        return product;
    }
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 5;
        IceBreaker2 iceBreaker = new IceBreaker2();
        System.out.println(iceBreaker.iceBreaker(firstNumber, secondNumber));
    }
}
