package beginWithJavaExercises.InheritanceAndPolyExamples;

public class BoxDemo {

    public static void main(String[] args) {
        Box room = new Box(12.5, 10.5, 9.5);
        System.out.println("volume is " + room.getVolume());
    }
}
