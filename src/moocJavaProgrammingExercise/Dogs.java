package moocJavaProgrammingExercise;

import java.util.Scanner;

public class Dogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();

        System.out.print("Enter the name of your dog: ");
        String name = scanner.nextLine();
        dog.setName(name);

        System.out.print("Specify breed: ");
        String breed = scanner.nextLine();
        dog.setBreed(breed);

        System.out.print("What colour is your dog? ");
        String colour = scanner.nextLine();
        dog.setColour(colour);

        System.out.print("How old is the dog? ");
        int age = scanner.nextInt();
        dog.SetAge(age);

        System.out.print("What is the size of your dog? ");
        int size = scanner.nextInt();
        dog.setSize(size);


        System.out.println();

        System.out.println("The name of the dog is " + dog.getName());
        System.out.println("The breed of the dog is " + dog.getBreed());
        System.out.println("The dogs colour is " + dog.getColour());
        System.out.println("The dog is " + dog.getAge() + " Year old");
        System.out.println("Size of dog is " + dog.getSize());

    }

}
