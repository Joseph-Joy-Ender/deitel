package moocJavaProgrammingExercise;

public class PaymentPlan {

private double balance;
    public void paymentCard(double balance){
        if (balance < 150) this.balance = balance;
        else {
            this.balance = 150;
        }
    }
    public double getBalance(){
        return balance;
    }

    public void eatAffordably(double amount) {
      balance -= amount;
    }

    public void eatHeartily(double amount) {
        balance -= amount;
    }

    public void addMoney(double amount) {
        balance += amount;
    }
}
