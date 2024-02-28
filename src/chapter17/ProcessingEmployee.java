package chapter17;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProcessingEmployee {
    public static void main(String[] args) {
        List<Employee> list = getEmployees();

        System.out.println("Complete Employee list: ");
        list.forEach(System.out::println);

        Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
        System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary: %n");
        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
        System.out.printf("%nFirst employee who earns $4000-$6000: %n%s%n",
        list.stream()
                .filter(fourToSixThousand)
                .findFirst()
                .get());
    }

    @NotNull
    private static List<Employee> getEmployees() {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 10000, "Facilitator"),
                new Employee("Matthew", "Blue", 7000, "Teacher"),
                new Employee("James", "Yellow", 8000, "Government"),
                new Employee("Luke", "Purple", 9000, "Lawyer"),
                new Employee("Joseph", "Black", 5000, "Sales"),
                new Employee("Wendy", "White", 5000, "Marketing")
        };

        return Arrays.asList(employees);
    }
}
