package chapter4;

public class CreditLimitCalculator {
    private int accountNumber;
    private int beginningBalance;
    private int totalItems;
    private int totalOfCredits;
    private int creditLimit;
    private int newBalance;
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        if (totalItems < 0)this.totalItems = 0;
        else {
            this.totalItems = totalItems;
        }
    }

    public int getTotalOfCredits() {
        return totalOfCredits;
    }

    public void setTotalOfCredits(int totalOfCredits) {
        this.totalOfCredits = totalOfCredits;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setNewBalance(int newBalance) {
        this.newBalance = newBalance;
    }

    public int calculateNewBalance(){
        newBalance = getBeginningBalance() + getTotalItems() - getTotalOfCredits();
        displayMessage(newBalance);
        return newBalance;
    }
    private   void displayMessage(int newBalance){
        if (newBalance > getCreditLimit()) System.out.println("Credit limit exceeded");
    }
}
