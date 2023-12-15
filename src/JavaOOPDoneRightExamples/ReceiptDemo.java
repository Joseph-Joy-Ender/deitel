package JavaOOPDoneRightExamples;

public class ReceiptDemo {
    public static void main(String[] args) {
        new ReceiptDemo().run();
    }

    private void run() {
        Receipt receipt = new Receipt(new Printer());
        receipt.add("Bread", new Money("200", "Naira"));
        receipt.add("Tiger bread", new Money("900", "Naira"));
        receipt.add("Red wine", new Money("1500", "Naira"));

        receipt.print();
    }
}
