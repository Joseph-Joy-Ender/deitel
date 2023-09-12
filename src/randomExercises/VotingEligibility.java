package randomExercises;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if((age >= 18) || (age == 18)) {
            System.out.println("Can vote");
        }
        else{
            System.out.println("Cannot vote");
        }
    }
}
