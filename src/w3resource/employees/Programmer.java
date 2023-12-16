package w3resource.employees;

public class Programmer extends Developer{

    public Programmer(String name, String address, double salary,  String programmingLang) {
        super(name, address, salary, "Programmer", programmingLang);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.12;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for programmer " + getName() + ": Excellent";
    }

    public void debugCode(){
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLang());
    }
}
