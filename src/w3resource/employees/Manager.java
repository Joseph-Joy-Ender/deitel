package w3resource.employees;

public class Manager extends Employee{
    private int numberOfSub;
    public Manager(String name, String address, double salary, String jobTitle, int numberOfSub) {
        super(name, address, salary, jobTitle);
        this.numberOfSub = numberOfSub;
    }

    public int getNumberOfSub() {
        return numberOfSub;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Manager " + getName() + ": Excellent";
    }

    public void manageProject(){
        System.out.println("Manager " + getName() + " is managing a project.");
    }
}
