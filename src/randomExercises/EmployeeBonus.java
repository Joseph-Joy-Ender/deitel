package randomExercises;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your salary : ");
        double salary = input.nextDouble();

        System.out.println("Please enter year: ");
        int year = input.nextInt();
        if(year >= 5){
            System.out.println(salary * 0.05);
        }
        else{
            System.out.println(0);
        }
    }
}
