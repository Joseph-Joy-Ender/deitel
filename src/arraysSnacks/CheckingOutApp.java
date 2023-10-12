package arraysSnacks;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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


    public void customerCart(){
        scanner = new Scanner(System.in);
        display("What is the customers name: ");
        customerName = scanner.nextLine();
        boolean con = true;
        while (con) {
            userPrompt();

            display("Add more items? ");
           String answer = scanner.nextLine();
            if (answer.equals("no")) con = false;
        }
        display("What is your name: ");
        cashierName = scanner.nextLine();
        display("How much discount will he get? ");
        discount = scanner.nextDouble();

        display("Customer name is: " + customerName);
        display("Product bought: " + productName);
        display("Price of product: " + productPrice);
        display("Quantity: " + productQuantity);
        display("Cashier's name: " + cashierName);
        display("Discount: " + discount);

    }

  public void userPrompt(){
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

  public void date(){
      Date date = new Date();
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh.mm aa");
      String time = simpleDateFormat.format(date);
      LocalDate localDate = LocalDate.now();
      display("date: " + localDate + " " + time);
  }

  public void invoice(){
        display("Semicolon Stores");
        display("Main Branch");
        display("09018296447");
        date();
        display("Cashier's name: " + cashierName);
        display("Customer name: " + customerName);
        display("======================================================");
        display("   ITEM        QTY         PRICE             TOTAL(NGN)");
      System.out.println(productName + "     " + productQuantity + "    " + productPrice);
        display("--------------------------------------------------------");
//      System.out.println(productName);
//      System.out.println(" \t\t\t " + productQuantity);
//      System.out.println("\t\t\t" + productPrice);


  }

  public static void display(String input){
      System.out.println(input);
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckingOutApp checkingOutApp = new CheckingOutApp();
        checkingOutApp.customerCart();
        checkingOutApp.invoice();

//        int total = 0;
//        int cost = 1;
//        for (int i = 0; i < 2; i++) {
//
//            display("Enter price: ");
//            int price = scanner.nextInt();
//            display("Enter quantity: ");
//            int quantity = scanner.nextInt();
//            cost = price * quantity;
//            display("cost is: " + cost);
//            total += cost;
//        }
//
//        System.out.println(total);


    }
}
