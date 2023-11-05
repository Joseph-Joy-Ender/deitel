package beginWithJavaExercises.InheritanceAndPolyExamples;

public class Triangle extends Shape{

    public Triangle(double height, double width) {
        super(height, width);
    }

    public double getArea() {
        return height * width / 2;
    }
}
