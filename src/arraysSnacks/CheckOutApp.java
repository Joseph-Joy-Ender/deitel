package arraysSnacks;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {

    public static void main(String[] args) {

        ProductList productList = new ProductList();
        productList.displayProductList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.println("Select a Product");
        String userSelection = scanner.nextLine();
        System.out.println(customerName);
        System.out.println(userSelection);





    }


}

class Cart {
    
}

class Customer {
    private String name;

}

class ProductList {
    private final ArrayList<Products> usersProducts;
    public ProductList() {
        usersProducts = new ArrayList<>();
        Products product1 = new Products("Fan Milk", 500.0);
        Products product2 = new Products("Yoyo Yoghurt", 800.0);
        Products product3 = new Products("Vanilla Ice Cream", 450.0);
        Products product4 = new Products("Eva Water", 300.0);
        Products product5 = new Products("Fanta", 200.0);

        usersProducts.add(product1);
        usersProducts.add(product2);
        usersProducts.add(product3);
        usersProducts.add(product4);
        usersProducts.add(product5);

    }
    public void addNewProduct(Products products) {
        usersProducts.add(products);
    }
    public void displayProductList() {
        System.out.println("Products List");
        for (int i = 0; i < this.usersProducts.size(); i++) {
            System.out.println((i + 1) + ". " + this.usersProducts.get(i).getName() + " " + this.usersProducts.get(i).getPrice());
        }
    }
}

class Products {
    private final String name;
    private final double price;


    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}

