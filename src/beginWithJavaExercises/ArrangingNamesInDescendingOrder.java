package beginWithJavaExercises;

import java.util.Scanner;

public class ArrangingNamesInDescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1, name2, name3;

        System.out.println("Enter first name: ");
        name1 = scanner.next();
        scanner.nextLine();

        System.out.println("Enter second name: ");
        name2 = scanner.next();
        scanner.nextLine();

        System.out.println("enter third name: ");
        name3 = scanner.next();
        scanner.nextLine();

        if (name1.compareTo(name2) > 0 && name1.compareTo(name3) > 0){
            System.out.println(name1);
            if (name2.compareTo(name3) > 0){
                System.out.println(name2);
                System.out.println(name3);
            }else {
                System.out.println(name3);
                System.out.println(name2);
            }
        }
        else if (name2.compareTo(name1) > 0 && name2.compareTo(name3) > 0) {
            System.out.println(name2);
           if (name1.compareTo(name3) > 0){
               System.out.println(name1);
               System.out.println(name3);
           }else {
               System.out.println(name3);
               System.out.println(name2);
           }
        }
        else {
            System.out.println(name3);
            if (name1.compareTo(name2) > 0){
                System.out.println(name1);
                System.out.println(name2);
            }
            else {
                System.out.println(name2);
                System.out.println(name1);
            }
        }
    }
}
