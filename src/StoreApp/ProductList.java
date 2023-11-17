package StoreApp;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductList {
    private final ArrayList<Product> productsName = new ArrayList<>();


    public void productList() {
        Scanner scanner = new Scanner(System.in);
        display("What is the customer's name: ");
        String name1 = scanner.nextLine();

        display("What did the user buy? ");
        String name = scanner.nextLine();

    }


    private static void display(String input) {
        System.out.println(input);
    }

    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.productList();
    }
}
