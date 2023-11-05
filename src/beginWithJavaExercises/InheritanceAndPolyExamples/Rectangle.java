package beginWithJavaExercises.InheritanceAndPolyExamples;

public class Rectangle {
    private final double length;
    private final double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "Length: " + length + "\nWidth: " + width;
    }
}
