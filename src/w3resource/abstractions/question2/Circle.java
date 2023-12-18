package w3resource.abstractions.question2;

public class Circle extends Shape{
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }


    private double radius;
    @Override
    double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
