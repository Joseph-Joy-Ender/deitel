package moocJavaProgrammingExercise;

public class Products {

    private double price;
    private int quantity;
    private String name;

    public Products(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }


    public void printProduct(){
        price = 1.1;
        quantity = 13;
        name = "Banana";
    }

    public static void main(String[] args) {
        Products products = new Products("Banana", 500, 13);
        System.out.println("Name of product is " + products.name);
        System.out.println("Quantity is " + products.quantity);
        System.out.println("Price " + products.price);

    }
}
