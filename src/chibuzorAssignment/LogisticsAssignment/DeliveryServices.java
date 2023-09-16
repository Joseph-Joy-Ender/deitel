package chibuzorAssignment.LogisticsAssignment;

public class DeliveryServices {
    
    public static int BasePay = 5000;
    
    public static int calculateRiderPayment(int successfulDelivery){
        if (successfulDelivery >= 0 && successfulDelivery < 50){
            return (successfulDelivery * 160) + BasePay;
        } else if (successfulDelivery > 50 && successfulDelivery <= 59 ) {
            return (successfulDelivery * 200) + BasePay;
        } else if (successfulDelivery > 60 && successfulDelivery <= 69) {
            return (successfulDelivery * 250) + BasePay;
        } else if (successfulDelivery >= 70 && successfulDelivery <= 100) {
            return (successfulDelivery * 500) + BasePay;
        } else {
            return 0;
        }

     //   return successfulDelivery;
    }
}
