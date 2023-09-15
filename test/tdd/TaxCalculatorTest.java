package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaxCalculatorTest {

    private final TaxCalculator taxCollector = new TaxCalculator();

    @Test
    public void testThatTaxCollectorExist(){
        assertNotNull(taxCollector);
    }

    @Test
    void testThatUserCanEnterName(){
        taxCollector.setName("Joseph");
        String actual = "Joseph";
        assertEquals(actual, taxCollector.getName());
    }

    @Test
    void testThatCitizensAreThree(){
        taxCollector.setCitizens(3);
        assertEquals(3, taxCollector.getCitizens());
    }

    @Test
    void testThatCitizensHaveEarnings(){
        taxCollector.setEarnings(30_000);
        assertEquals(30_000, taxCollector.getEarnings());
    }

    @Test
    void testThatEarningCannotBeLessThan0(){
        taxCollector.setEarnings(-9);
        assertEquals(0, taxCollector.getEarnings() );
    }

    @Test
    void testCitizensTaxRate(){
        taxCollector.setEarnings(30_000);
        taxCollector.calculateTaxRate();
        assertEquals(4500, taxCollector.calculateTaxRate());
    }

    @Test
    void testForCitizensThatEarnMoreThan30_000(){
        taxCollector.setEarnings(50_000);
        taxCollector.calculateTaxRate();
        assertEquals(10_000, taxCollector.calculateTaxRate());
    }
}
