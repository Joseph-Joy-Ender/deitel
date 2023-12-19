package w3resource.recursiveQuestions;

public class RaiseToPower {
    public double raiseToPower(double base, int power){
       if (power == 0)return 1;
       return base * raiseToPower(base, power - 1);
    }
}
