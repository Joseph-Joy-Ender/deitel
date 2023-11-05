package arraysSnacks;

import java.util.Scanner;

import static arraysSnacks.CheckingOutApp.date;

public class PizzaSnacksMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        display("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.printf("""
                        <><><><><><>   WELCOME   <><><><><><>
                Semicolon Pizza Stores
                Main Branch
                Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                Tel: 09018296447
                Date: %s
                Attendant's name: Joy
                Customer's name: %s
                
                """.formatted(date(), customerName));



        display("Enter how many people are super hungry: ");
        int superHungry = scanner.nextInt();

        display("Enter how many people are hungry: ");
        int hungry = scanner.nextInt();

        display("Enter how many people are classic: ");
        int classic = scanner.nextInt();

        display("=================================================================");
        display("The total number of slices for super hungry people is: " + PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry));

        display("The total number of slices recommended for hungry people is: " + PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry));

        display("The total number of slices recommended for classic people is: " + PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic));

        display("The total number of slices is: " + PizzaSnacks.totalNumberOfSlicesOfLargeMediumAndSmallPizza(superHungry, hungry, classic));
        display(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<><><>");

        System.out.println();
        display("==================================================================");
        int total = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        display("The number of boxes for the super hungry pizza is: " + PizzaSnacks.totalNumberOfBoxesForLargePizza(total));

        int total2 = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        display("The number of boxes for the hungry people pizza is: " + PizzaSnacks.totalNumberOfBoxesOfMediumPizza(total2));

        int total3 = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        display("The number of boxes for the classic people pizza is: " + PizzaSnacks.totalNumberOfBoxesOfSmallPizza(total3));

        int totalNumber = PizzaSnacks.totalNumberOfBoxesForLargeMediumAndSmallPizza(total, total2, total3);
        display("The total number of boxes for super hungry pizza, hungry and classic pizza is: " + totalNumber);

        display("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");

        System.out.println();
        display("=======================================================================================");

        int total4 = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        int answer1 = PizzaSnacks.totalNumberOfSlicesLeftForLargePizza(total4);
        System.out.print("The total number of slices that would be left for the super hungry pizza is: ");
        System.out.println(answer1);

        int total5 = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        int answer2 = PizzaSnacks.totalNumberOfSlicesLeftForMediumPizza(total5);
        System.out.print("The total number of slices that would be left for the hungry pizza is: ");
        System.out.println(answer2);

        int total6 = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        int answer3 = PizzaSnacks.totalNumberOfSlicesLeftForSmallPizza(total6);
        System.out.print("The total number of pizza slices that would be left for classic pizza is: ");
        System.out.println(answer3);

        System.out.print("The total number of pizza slices left for super hungry pizza, hungry and classic pizza is: ");
        System.out.println(PizzaSnacks.totalNumberOfSlicesForLargeMediumAndSmall(answer1, answer2, answer3));

        display(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        System.out.println();
        int total7 = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        int amount = PizzaSnacks.totalPriceForLargePizza(total7);
        System.out.print("The amount for the super hungry pizza is: ");
        System.out.println(amount);

        int total8 = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        int amount2 = PizzaSnacks.totalPriceForMediumPizza(total8);
        System.out.print("The amount for the hungry pizza is: ");
        System.out.println(amount2);

        int total9 = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        int amount3 = PizzaSnacks.totalPriceForSmallPizza(total9);

        System.out.print("The amount for the classic pizza is: ");
        System.out.println(amount3);

        System.out.print("The total amount is: ");
        System.out.println(PizzaSnacks.totalPriceForLargeMediumAndSmallPizza(amount, amount2, amount3));

        display(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>><<<<");


    }

    public static void display(String input){
        System.out.println(input);
    }
}
