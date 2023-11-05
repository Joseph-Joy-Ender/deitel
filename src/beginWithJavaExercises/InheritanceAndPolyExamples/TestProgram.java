package beginWithJavaExercises.InheritanceAndPolyExamples;

public class TestProgram {
    public static void main(String[] args) {
        Rectangle2 rectangle2 = new Rectangle2(5, 4);

        Triangle triangle = new Triangle(5, 10);

        System.out.println("Area of rectangle is: " + rectangle2.getArea());

        System.out.println("Area of triangle is: " + triangle.getArea());
    }
}
