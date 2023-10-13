package arraysSnacks;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CheckingOutApp {
    Scanner scanner;
    ArrayList<String> productName = new ArrayList<>();
    ArrayList<BigDecimal> productPrice = new ArrayList<>();
    ArrayList<Integer> productQuantity = new ArrayList<>();
    ArrayList<BigDecimal> total = new ArrayList<>();
    ArrayList<BigDecimal> subtotal = new ArrayList<>();
    ArrayList<BigDecimal> billTotal = new ArrayList<>();

    String customerName;
    String cashierName;
    double discount;


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
        }
        display("What is your name: ");
        cashierName = scanner.nextLine();
        display("How much discount will he get? ");
        discount = scanner.nextDouble();

        for (int i = 0; i < productQuantity.size(); i++) {
            total.add(productPrice.get(i).multiply(BigDecimal.valueOf(productQuantity.get(i))));
        }
        subtotal.addAll(total);

    }

    public void userPrompt() {
        Scanner input = new Scanner(System.in);
        display("What did the customer buy? ");
        String name = input.nextLine();
        productName.add(name);
        display("How many pieces: ");
        int quantity = input.nextInt();
        productQuantity.add(quantity);
        display("How much per product: ");
        BigDecimal price = input.nextBigDecimal();
        productPrice.add(price);

    }

    public void date() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh.mm aa");
        String time = simpleDateFormat.format(date);
        LocalDate localDate = LocalDate.now();
        display("date: " + localDate + " " + time);
    }

    public void invoice() {

        display("Semicolon Stores");
        display("Main Branch");
        display("09018296447");
        date();
        display("Cashier's name: " + cashierName);
        display("Customer name: " + customerName);
        display("======================================================");
        display("ITEM          QTY         PRICE       TOTAL(NGN)");
        display("-------------------------------------------------------");
        for (int i = 0; i < productName.size(); i++) {
            System.out.print(productName.get(i)+ " \t  " + productQuantity.get(i) + " \t\t " + productPrice.get(i) + " \t\t " + total.get(i));
            System.out.println();
        }
        display("-------------------------------------------------------");
        display("Sub Total: " + subtotal);

    }


    public static void display(String input) {
        System.out.println(input);
    }

    public static void main(String[] args) {
        CheckingOutApp checkingOutApp = new CheckingOutApp();
        checkingOutApp.customerCart();
        checkingOutApp.invoice();



    }
}
