package chibuzorAssignment.LogisticsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryServicesTest {

    @Test
   public void testThatWagesIs8200WhenSuccessfulDeliveryIs20(){
        int successfulDelivery = 20;
        assertEquals(8200, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }

    @Test
    public void testThatRiderWagesIs15600WhenRiderDeliveriesIs53(){
        int successfulDelivery = 53;
        assertEquals(15_600, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }

    @Test
    public void testThatRiderCannotGetWagesWhenNegativeDeliveryIsMade(){
        int successfulDelivery = -3;
        assertEquals(0, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }

    @Test
    public void testThatWhenRidersDeliveryIs69RiderGetsWagesOf22250(){
        int successfulDelivery = 69;
        assertEquals(22_250, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }

    @Test
    public void testThatWhenRiderDeliveryIs70RidersWagesIs40000(){
        int successfulDelivery = 70;
        assertEquals(40_000, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }

    @Test
    public void testThatWhenRiderDelivers80TimesWagesIs45000(){
        int successfulDelivery = 80;
        assertEquals(45_000, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }

    @Test
    public void testThatWhenRiderDeliversAllParcelsWagesIs55_000(){
        int successfulDelivery = 100;
        assertEquals(55_000, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }

    @Test
    void testThatWhenRiderDeliversJustOneParcelWagesIs5_160(){
        int successfulDelivery = 1;
        assertEquals(5_160, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }

    @Test
    void testThatRiderCannotDeliverMoreThan100Parcels(){
        int successfulDelivery = 101;
        assertEquals(0, DeliveryServices.calculateRiderPayment(successfulDelivery));
    }
}