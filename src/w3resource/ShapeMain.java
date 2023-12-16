package w3resource;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(32.0, 12.1);

        double area = rectangle.getArea();
        System.out.println(area);
    }
}
