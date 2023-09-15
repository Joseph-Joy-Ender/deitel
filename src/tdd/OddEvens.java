package tdd;

public class OddEvens {

    private int negativeNumber;
    private int number;
    public void negativeNumber(int negativeNumber) {
        if (number < 0){
            System.out.println("invalid number");
            return;
        }else this.negativeNumber = Math.max(negativeNumber, 0);
    }
    public double getNegativeNumber(){
        return negativeNumber;

    }

    public int getNumber() {
        return number;
    }

    public void oddNumber(int number) {
        if (number < 0){
            System.out.println("number is invalid");
        } else if (number % 2 == 0){
            System.out.print("The number is an Even Number");
        }else {
            System.out.println("The number is an Odd Number");
        }



    }
}
