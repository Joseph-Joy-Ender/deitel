package w3resource.abstractions.question2;

public class Main {
    public static void main(String[] args) {
        double radius = 4.0;
        Circle circle = new Circle(radius);
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Radius of a circle " + radius);
        System.out.println("Area of a circle: " + circle.calculateArea());
        System.out.println("Perimeter of a circle: " + circle.calculatePerimeter());
        System.out.println();
        System.out.println("Area of a triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
    }
}
