package chibuzorAssignment.LogisticsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryLogisticsTest {


    @Test
    public void testThatTheRightWagesIsBeingPaid(){
        int parcelAmount = 80;
        int basePay = DeliveryLogistics.calculateRidePay(parcelAmount);
        assertEquals(45000, basePay);
    }


}