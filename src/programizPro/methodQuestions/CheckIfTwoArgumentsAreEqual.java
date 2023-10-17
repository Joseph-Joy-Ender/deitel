package programizPro.methodQuestions;

public class CheckIfTwoArgumentsAreEqual {
    public static String myMethod(int num1, int num2){
        if (num1 == num2){
            return "Arguments are Equal";
        }else {
            return "Arguments are not Equal";
        }
    }

    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 7;
        System.out.println(myMethod(number1, number2));

    }
}
