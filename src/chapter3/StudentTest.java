package chapter3;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        student.setAddress(address);

        System.out.print("Enter your age: ");
        String age  = scanner.nextLine();
        student.setAge(age);


        System.out.println("Name of student is: " + student.getName());
        System.out.println("Address of student is: " + student.getAddress());
        System.out.println("Age of student is: " + student.getAge());
    }

}
