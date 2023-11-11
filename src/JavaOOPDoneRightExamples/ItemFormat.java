package JavaOOPDoneRightExamples;

public class ItemFormat {
    private final Money price;
    private final String description;

    public ItemFormat(String description, Money price) {
        this.description = description;
        this.price = price;
    }

    public void print(Printer printer) {
        printer.print(description);
        price.print(printer);
        printer.print(" ");
    }
}
