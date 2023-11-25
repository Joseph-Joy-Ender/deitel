package chapter8;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(6, 1, 2003);
        Date hire = new Date(7, 3, 2023);
        Employee employee = new Employee("Joy", "Joseph", birth, hire);
        System.out.println(employee);
    }
}
