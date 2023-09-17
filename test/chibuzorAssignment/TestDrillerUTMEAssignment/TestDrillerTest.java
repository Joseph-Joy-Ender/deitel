package chibuzorAssignment.TestDrillerUTMEAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerTest {

    @Test
    void testThatWhenIPurchase1CopiesIPay2000() {
        int copies = 1;
        assertEquals(2000, TestDriller.testDriller(copies));
    }

    @Test
    public void testThatWhenIPurchased10CopiesIPay1600(){
        int copies = 10;
        assertEquals(1600, TestDriller.testDriller(copies));
    }
   @Test
   void testThatWhenIPurchase100CopiesIPay1200(){
        int copies = 100;
        assertEquals(1200, TestDriller.testDriller(copies));
   }
   @Test
    void testThatIPurchaseMoreThan500IPay1000(){
        int copies = 510;
        assertEquals(1000, TestDriller.testDriller(copies));
   }
}