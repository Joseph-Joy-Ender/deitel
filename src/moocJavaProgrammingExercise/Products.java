package moocJavaProgrammingExercise;

public class Products {

    private final double price;
    private final int quantity;
    private final String name;

    public Products(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }


    public static void main(String[] args) {
        Products products = new Products("Banana", 500, 13);
        System.out.println("Name of product is " + products.name);
        System.out.println("Quantity is " + products.quantity);
        System.out.println("Price " + products.price);

    }
}
