package beginWithJavaExercises.InheritanceAndPolyExamples;

public class Box extends Rectangle{
    private final double height;
    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public String toString() {
        return super.toString() + "\nHeight: " + height;
    }
}
