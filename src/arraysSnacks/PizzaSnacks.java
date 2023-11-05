package arraysSnacks;

public class PizzaSnacks {
    private static final int LargePizza = 5000;
    private static final int MediumPizza = 3000;
    private static final int SmallPizza = 2000;
    private static final int SuperHungry = 4;
    private static final int Hungry = 2;
    private static final int Classic = 1;
    private static final int big = 10;
    private static final int medium = 6;
    private static final int small = 4;


    public static int totalNumberOfSlicesForSuperHungryPeople(int pieces){
       return pieces * SuperHungry;
   }

   public static int totalNumberOfSlicesForHungryPeople(int noOfPeople) {
       return noOfPeople * Hungry;
   }

    public static int totalNumberOfSlicesForClassicPeople(int noOfPeople) {
       return noOfPeople * Classic;
    }


    public static int pricesOfLargeMediumAndSmallPizza(int type) {
       if (type == big) return LargePizza;
       if (type == medium) return MediumPizza;
       if (type == small) return SmallPizza;
       return type;
    }

    public static int totalNumberOfSlicesOfLargeMediumAndSmallPizza(int superHungryTotal, int hungryTotal, int classicTotal) {
        int superHungry = totalNumberOfSlicesForSuperHungryPeople(superHungryTotal);
       int hungrySum = totalNumberOfSlicesForHungryPeople(hungryTotal);
      int  classic = totalNumberOfSlicesForClassicPeople(classicTotal);
       return superHungry + hungrySum + classic;
   }

   public static int totalNumberOfBoxesForLargePizza(int box) {
       int divide = box / big;
       if (box % big != 0){
           divide += 1;
       }
       return divide;
   }

   public static int totalNumberOfBoxesOfMediumPizza(int box) {
       int divide = box / medium;
       if (box % medium != 0){
           divide += 1;
       }
       return divide;
   }

   public static int totalNumberOfBoxesOfSmallPizza(int box) {
       int divide = box / small;
       if (box % small != 0) divide += 1;
       return divide;
   }

   public static int totalNumberOfBoxesForLargeMediumAndSmallPizza(int box1, int box2, int box3) {
       return totalNumberOfBoxesForLargePizza(box1) + totalNumberOfBoxesOfMediumPizza(box2) + totalNumberOfBoxesOfSmallPizza(box3);
   }

   public static int totalNumberOfSlicesLeftForLargePizza(int numberOfSlicesLeft){
       int answer = big * totalNumberOfBoxesForLargePizza(numberOfSlicesLeft);
       return answer - numberOfSlicesLeft;
   }

   public static int totalNumberOfSlicesLeftForMediumPizza(int numberOfSlicesLeft) {
       int answer = medium * totalNumberOfBoxesOfMediumPizza(numberOfSlicesLeft);
       return answer - numberOfSlicesLeft;
   }

    public static int totalNumberOfSlicesLeftForSmallPizza(int numberOfSlicesLeft) {
        int answer = small * totalNumberOfBoxesOfSmallPizza(numberOfSlicesLeft);
        return answer - numberOfSlicesLeft;
    }

    public static int totalNumberOfSlicesForLargeMediumAndSmall(int total1, int total2, int total3) {
        return total1 + total2 + total3;
    }

    public static int totalPriceForLargePizza(int box) {
        return totalNumberOfBoxesForLargePizza(box) * LargePizza;
    }

    public static int totalPriceForMediumPizza(int box) {
        return totalNumberOfBoxesOfMediumPizza(box) * MediumPizza;
    }

    public static int totalPriceForSmallPizza(int box) {
        return totalNumberOfBoxesOfSmallPizza(box) * SmallPizza;
    }

    public static int totalPriceForLargeMediumAndSmallPizza(int box1, int box2, int box3) {
        return box1 + box2 + box3;
    }
}
