package w3resource.recursiveQuestions;

public class CalculateSum {
    public int calculateSum(int number){
        if (number == 0 || number < 0) return 0;
        return number + calculateSum(number - 1);

    }
}
