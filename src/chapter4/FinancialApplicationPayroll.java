package chapter4;

public class FinancialApplicationPayroll {

    private static String name;

    private static double payRate;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        FinancialApplicationPayroll.name = name;
    }


    public static double getPayRate() {
        return payRate;
    }

    public static void setPayRate(double payRate) {
        FinancialApplicationPayroll.payRate = payRate;
    }


}
