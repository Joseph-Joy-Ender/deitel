package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinancialApplicationPayrollTest {
    

    @Test
    public void testThatEmployeeHasAName(){
        FinancialApplicationPayroll.setName("Joseph");
        assertEquals("Joseph", FinancialApplicationPayroll.getName());

    }

    @Test
    public void testThatTheEmployeeHasNumbersOfHoursWorked(){
        int numberOfHours = -7;
       // assertEquals(0, FinancialApplicationPayroll.getNumberOfHours(numberOfHours));
    }

    @Test
    public void testThatEmployeeHasAnHourlyPay(){
        FinancialApplicationPayroll.setPayRate(9.75);
        assertEquals(9.75, FinancialApplicationPayroll.getPayRate());
    }

    @Test
    public void testThatEmployeeHasGrossPay(){
        double numberOfHours = 10;
        double hourlyPay = 9.75;
        double grossPay = numberOfHours * hourlyPay;
    //    assertEquals(97.5, FinancialApplicationPayroll.grossPay(grossPay));

    }


}