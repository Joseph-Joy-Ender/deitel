package chapter8;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString(){
        return String.format("FirstName: %s \nLastName: %s \nHired: %s  \nBirthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
