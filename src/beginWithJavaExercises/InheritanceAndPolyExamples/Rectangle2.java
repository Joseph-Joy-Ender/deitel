package beginWithJavaExercises.InheritanceAndPolyExamples;

public class Rectangle2 extends Shape{

    public Rectangle2(double height, double width) {
        super(height, width);
    }

    public double getArea() {
        return height * width;
    }

}
