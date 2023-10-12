package chapter4;

public class FinancialApplicationPayroll {

    private static String name;

    private static double payRate;

    public static int getNumberOfHours() {
        return numberOfHours;
    }

    public static void setNumberOfHours(int numberOfHours) {
        FinancialApplicationPayroll.numberOfHours = Math.max(numberOfHours, 0);
    }

    public static double getGrossPay() {
        return grossPay;
    }

    public static void setGrossPay(double grossPay) {
        FinancialApplicationPayroll.grossPay = getNumberOfHours() * getPayRate();
    }

    private static int numberOfHours;

    private static double grossPay;

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
