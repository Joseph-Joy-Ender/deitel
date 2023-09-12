package chapter1;


public class MTN {
    private String ussd;
    private double amount;

    public MTN() {
    }

    public MTN(String ussd, double amount) {
        this.ussd = ussd;
        this.amount = amount;
    }

    public String getUssd() {
        return ussd;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUssd(String ussd) {
        this.ussd = ussd;
    }

    public void menu(int map) {
        switch (map) {
            case 1 -> phoneBook();
            case 2 -> messages();
        }
    }

    private void messages() {
        System.out.println("Message is displayed");
    }

    private void phoneBook() {
        System.out.println("Phonebook is displayed");
    }

}
