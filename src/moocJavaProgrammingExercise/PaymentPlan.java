package moocJavaProgrammingExercise;

public class PaymentPlan {

private double balance;
    public void setBalance(int balance){
        this.balance = balance;

    }
    public double getBalance(){
        return balance;
    }

    public void eatAffordably(double amount) {
       amount = balance - amount;
    }

}
