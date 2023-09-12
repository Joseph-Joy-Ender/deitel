package randomExercises;

public class Animals {
    private String name;
    private String colour;
    private int age;
    private String type;

    public Animals(String name, String colour, int age, String type) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.type = type;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Animals animals = new Animals("Dog", "purple Black", 30, "Domestic Animal");
        //System.out.println(animals);
        animals.setName("Dog");
        animals.setAge(30);
        animals.setColour("purble Black");
        animals.setType("Domestic Animal");
        System.out.println("Name of animal is :" + animals.getName());
        System.out.println("Age of animal is: " + animals.getAge());
        System.out.println("Colour of animal is: " + animals.getColour());
        System.out.println("Type of animal is: " + animals.getType());
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name = '" + name + '\'' +
                ", colour = '" + colour + '\'' +
                ", age = " + age +
                ", type = '" + type + '\'' +
                '}';
    }
}
