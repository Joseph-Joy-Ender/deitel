package arraysSnacks;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CheckingOutApp {
    Scanner scanner;
    ArrayList<String> productNames = new ArrayList<>();
    ArrayList<Double> productPrices = new ArrayList<>();
    ArrayList<Integer> productQuantities = new ArrayList<>();
   String billTotal;
    String customerName;
    String cashierName;
    String discount;
    double balance;
    double vatAmount;
    double amountPaid;
   String percentageSymbol = "%";
    String subTotals;
    double percentageDiscount;
    double subTotal = 0.0;

    public void customerCart() {
        scanner = new Scanner(System.in);
        display("What is the customers name: ");
        customerName = scanner.nextLine();
        boolean condition = true;
        while (condition) {
            userPrompt();

            display("Add more items?(y or n) ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) condition = false;
            while (!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y")){
                System.out.println("Wrong input");
                display("Add more items?(y or n) ");
                  answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) condition = false;
            }
         }
        display("What is your name: ");
        cashierName = scanner.nextLine();
        display("How much discount will he get? ");
       int discountRate = scanner.nextInt();
         percentageDiscount = discountRate / 100.0;

        invoice();
        printHeader();
        calculations();

        printBody();
    }

    public void userPrompt() {
        Scanner input = new Scanner(System.in);
        display("What did the customer buy? ");
        String name = input.nextLine();
        productNames.add(name);
        display("How many pieces: ");
        int quantity = input.nextInt();
        while (quantity < 0 || quantity == 0){
            display("Quantity cannot be zero or less than zero");
            display("How many pieces: ");
             quantity = input.nextInt();
        }
        productQuantities.add(quantity);
        display("How much per product: ");
        double price = input.nextDouble();
        while (price < 0 || price == 0){
            display("Price cannot be negative ");
            display("How much per product: ");
            price = input.nextDouble();
        }
        productPrices.add(price);
    }
    public void balanceGiven(){
        Scanner input = new Scanner(System.in);
        display("How much did the customer give you? ");
         amountPaid = input.nextDouble();
        double billTotals = Double.parseDouble(billTotal);
        double amountsPaid = amountPaid;
        if (amountsPaid > billTotals){
            this.balance = amountPaid - billTotals;
        }

    }


    public static String date() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm aa");
        String time = simpleDateFormat.format(date);
        LocalDate localDate = LocalDate.now();
        return (localDate + " " + time);
    }

    public void invoice() {
        System.out.printf("""
                Semicolon Stores
                Main Branch
                Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                Tel: 09018296447
                Date: %s
                Cashier's name: %s
                Customer's name: %s
                
                """.formatted(date(), cashierName, customerName));
    }

    public void printHeader() {
        String header = """
               ================================================================
               Item                             Qty       Price        Total(NGN)\s
               ----------------------------------------------------------------
               """;
        System.out.println(header);
    }


    public static void display(String input) {
        System.out.println(input);
    }

    public void printBody() {
        System.out.printf("""
                ------------------------------------------------------------------------
                                                            Sub Total:           %s
                                                             Discount:           %s
                                                         VAT @ 17.50%s:           %.2f
                ========================================================================
                                                           Bill Total:           %s
                ========================================================================
                THIS IS NOT A RECEIPT KINDLY PAY %s
                ========================================================================
                """, subTotals, discount, percentageSymbol, vatAmount, billTotal, billTotal);
    }

    public void receipt(){
        System.out.printf("""
                Semicolon Stores
                Main Branch
                Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                Tel: 09018296447
                Date: %s
                Cashier's name: %s
                Customer's name: %s
                
                """.formatted(date(), cashierName, customerName));
      display("""
              =============================================================================
              ITEM                    QTY             PRICE             TOTAL(NGN)
              -----------------------------------------------------------------------------
              """);
      calculations();
        secondBody();
    }

    public void secondBody(){
        String body = """
                                                             Amount Paid:%s
                                                                 Balance:%s
                    ====================================================================
                    THANK YOU FOR YOUR PATRONAGE
                    ====================================================================
                    """.formatted(amountPaid, balance);

        System.out.println(body);
    }

    public void calculations(){
        for(int i = 0; i < productNames.size(); i++) {
            subTotal += productQuantities.get(i) * productPrices.get(i);
            System.out.printf("""
                    %s                    %d             %.2f             %.2f
                    
                    """, productNames.get(i), productQuantities.get(i), productPrices.get(i), (productQuantities.get(i) * productPrices.get(i)));
        }
        this.subTotals = String.valueOf(subTotal);
        double discount = subTotal * percentageDiscount;
        this.discount = String.valueOf(discount);
        double vat = (17.5/100) * subTotal;
        this.vatAmount = Double.parseDouble(String.valueOf(vat));
        this.billTotal = String.valueOf(subTotal  - discount + vat);
    }
    public static void main(String[] args) {
        CheckingOutApp checkingOutApp = new CheckingOutApp();
       checkingOutApp.customerCart();
        checkingOutApp.balanceGiven();
        checkingOutApp.receipt();




    }
}
