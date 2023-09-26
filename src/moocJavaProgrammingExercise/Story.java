package moocJavaProgrammingExercise;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but i need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("What is your job?");
        String job = scanner.nextLine();

        System.out.printf("""
                Here is the story:
                Once upon a time there was %s, who was working as a %s.
                On the way to work, %s reflected on life.
                Perhaps %s will not be a %s forever.
                """, name,job, name, name, job);
    }
}
