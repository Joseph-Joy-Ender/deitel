package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoInsuranceCompanyTest {

    private final AutoInsuranceCompany autoInsuranceCompany = new AutoInsuranceCompany();

    @Test
    public void testThatCompanyExit(){
        assertNotNull(autoInsuranceCompany);
    }

    @Test
    public void testThatCustomersHaveAnAccountNumber(){
        autoInsuranceCompany.setAccountNumber("2166105724");
        assertEquals("2166105724", autoInsuranceCompany.getAccountNumber());
    }

    @Test
    public void testThatCustomersHaveAName(){
        autoInsuranceCompany.setName("Joseph");
        assertEquals("Joseph", autoInsuranceCompany.getName());
    }

    @Test
    public void testThatAutoHasAMakeAndModel(){
        autoInsuranceCompany.makeAndModel("Toyota Camry");
        assertEquals("Toyota Camry", autoInsuranceCompany.getMakeAndModel());
    }

    @Test
    public void testThatAutoInsuranceCompanyHasState(){
        autoInsuranceCompany.state("NJ");
        assertEquals("New Jersey", autoInsuranceCompany.getState());
    }
    @Test
    public void testThatAutoInsuranceCompanyHasStateException(){
        assertThrows(RuntimeException.class, () -> autoInsuranceCompany.state("BJ"));

    }
    @Test
    public void testThatWhenUserEnterAWrongInputAnErrorMessageIsDisplayed(){


    }


}