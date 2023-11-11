package JavaOOPDoneRightExamples;

public class Money {
    private final String amount;
    private final String currency;

    public Money(String amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void print(Printer printer) {
        printer.print(currency);
        printer.print(amount);
    }
}
