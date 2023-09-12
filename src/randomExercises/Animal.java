package randomExercises;

public class Animal {
    private String name;
    private String type;
    private String colour;
    private int age;

    public static void main(String[] args) {
        Animal animal = new Animal("Lion", "Wild Animal", "Black and White", 90);
     //   System.out.println(animal);
       animal.setName("Tiger");
        animal.setAge(40);
       animal.setType("Domestic Animal");
        animal.setColour("Black and Pink");
        System.out.println("The animal name is: " + animal.getName());
        System.out.println("The animal type is: " + animal.getType());
        System.out.println("The animal colour is: " + animal.getColour());
        System.out.println("The animal age is: " + animal.getAge());

    }

    public Animal(String name, String type, String colour, int age) {
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
