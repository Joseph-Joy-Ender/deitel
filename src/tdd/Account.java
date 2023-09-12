package tdd;

public class Account {

    private double balance = 13000;
//        private double deposit;
    public Account(){
      //  this.balance = balance;
  //      this.deposit = deposit;
    }
    // public void setDeposit(double deposit) {
       // this.deposit = deposit;
// }
 // public double getDeposit(){
    //  return this.deposit = 5000;
// }


    public void  setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        this.balance = balance;
        return this.balance;
    }

  //  public void  setBalance(double balance){
    //    this.balance = balance;

    // }
  //  public double checkBalance() {
    //    return balance;
   // }

    public double withdrawBalance (double amount) {

       // double result = 0;
        if (amount > balance || amount < 0)
            System.out.print("Invalid Amount");
        else {
            System.out.print("Withdrawal successful");
         //   result = balance - amount;
           // setBalance(result);
          //  return result;
        }
        return balance;
    }

   // public double deposit() {
    // double deposit1 = deposit;
    //    return deposit1;
    // }
   //  public double deposit2() {
      // public double deposit () {
    //    return this.deposit + 2000;
    }
    //  double result = balance - amount ;     // double result =  amount - balance;
        //  setBalance(result);

        // return amount;
       // return result;
// }