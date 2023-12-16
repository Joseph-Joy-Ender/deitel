package w3resource.employees;

public class Developer extends Employee{
    private String programmingLang;
    public Developer(String name, String address, double salary, String jobTitle, String programmingLang) {
        super(name, address, salary, jobTitle);
        this.programmingLang = programmingLang;
    }

    public String getProgrammingLang() {
        return programmingLang;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Developer " + getName() + ": Good";
    }
    public void writeCode(){
        System.out.println("Developer " + getName() + " is writing code in " + programmingLang);
    }
}
