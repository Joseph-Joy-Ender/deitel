package chibuzorAssignment.LogisticsAssignment;

public class DeliveryLogistics {

    public static final int BasePAY = 5000;

    private static int decideParcelAmount(int deliveryNumber){

        if (deliveryNumber < 1 || deliveryNumber > 100)
            throw new IllegalArgumentException("Amount must be between 1 and 100");

        if (deliveryNumber < 50) return 160;
        if (deliveryNumber <= 59) return 200;
        if (deliveryNumber <= 69) return 250;
        return 500;

    }

    public static int calculateRidePay (int deliveryNumber){
        int parcelAmount = decideParcelAmount(deliveryNumber);
        return (deliveryNumber * parcelAmount) + BasePAY;
    }
}
