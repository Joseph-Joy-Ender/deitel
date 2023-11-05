package beginWithJavaExercises.StaticExamples;

public class Info {

    private final Persons name;
    private final Date dob;

    public Info(String firstName, String lastName, int month, int day, int year) {
        name = new Persons(firstName, lastName);
        dob = new Date(month, day, year);
    }

    public String toString(){
        return "Name: " + name + "\nDate of Birth: " + dob;

    }
}
