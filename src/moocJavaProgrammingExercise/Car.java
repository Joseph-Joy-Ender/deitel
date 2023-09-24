package moocJavaProgrammingExercise;

public class Car {

    private String name;
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Name of car is " + name + "\n" + "Colour of car is " + colour;
    }
}
