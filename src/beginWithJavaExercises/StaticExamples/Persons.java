package beginWithJavaExercises.StaticExamples;

public class Persons {

    private String firstName, lastName;

    public Persons(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public  String toString(){
        return firstName + " " + lastName;
    }
}
