package tdd;

import chapter4dietelExercise.SalesCommissionCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesCommissionCalculatorTest {

    private final SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();

    @Test
    public void testThatSalesCommissionCalculatorExist(){
        assertNotNull(salesCommissionCalculator);
    }

    @Test
    void testForItemsSoldForLastWeek(){
        salesCommissionCalculator.setPriceForItemSold(5000);
        assertEquals(5000, salesCommissionCalculator.getPriceForItemSold());
    }

    @Test
    void testThatCalculatorHasCommission(){
        salesCommissionCalculator.setPriceForItemSold(5000);
        salesCommissionCalculator.calculateCommission();
        assertEquals(450, salesCommissionCalculator.calculateCommission());
    }

    @Test
    void testThatSalesPersonHasTotalAverage(){
        salesCommissionCalculator.setPriceForItemSold(5000);
        salesCommissionCalculator.calculateCommission();
        salesCommissionCalculator.calculateTotalWage();
        assertEquals(650, salesCommissionCalculator.calculateTotalWage());
    }

    @Test
    void testThatUserCantEnterNegativePrice(){
        salesCommissionCalculator.setPriceForItemSold(-9);
        assertEquals(0, salesCommissionCalculator.getPriceForItemSold());
    }
}
