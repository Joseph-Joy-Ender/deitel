package chapter2;

public class Accountant {
    private int balance;

    public Accountant(int balance){
        this.balance = balance;
    }
  //  public void deposit(int amount){
    //    balance = balance + amount;
    //}
    //public void withdrawal(int amount){
      //  balance = balance - amount;
       // this.balance = balance;
    //}
    //public int checkBalance(){
      //  return balance;
    //}
  public void deposit(int amount) {
      if(amount > 0) {
          balance += amount;
      }
  }

    public void withdrawal(int amount  ) {
        if((amount <= balance) && (amount > 0)) {
            balance = balance - amount;
        }

    }

    public int checkBalance() {
        return balance;
    }
}


