package arraysSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaSnacksTest {

    @Test
    void testForTotalSlicesOfPizzaForPeopleTakingLargePizza() {
        int people = 15;
       int expected = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(people);
       assertEquals(60, expected);
    }

    @Test
    void testForTotalSlicesOfPizzaForPeopleTakingMediumPizza(){
        int people = 4;
        int actual = PizzaSnacks.totalNumberOfSlicesForHungryPeople(people);
        assertEquals(8, actual);
    }

    @Test
    void testForTotalNumberOfPeopleTakingClassicPizza(){
        int noOfPeople = 10;
        int actual = PizzaSnacks.totalNumberOfSlicesForClassicPeople(noOfPeople);
        assertEquals(10, actual);
    }


    @Test
    public void testForTotalNumberOfSlicesOfLargeMediumAndSmall(){
        int superHungry = 12;
        int hungry = 20;
        int classic = 4;
        assertEquals(92, PizzaSnacks.totalNumberOfSlicesOfLargeMediumAndSmallPizza(superHungry,hungry,classic));

    }

    @Test
    public void testForPriceForLargePizza() {
        int type = 10;
        assertEquals(5000, PizzaSnacks.pricesOfLargeMediumAndSmallPizza(type));
    }

    @Test
    public void testForPriceOfMediumPizza(){
        int type = 6;
        assertEquals(3000, PizzaSnacks.pricesOfLargeMediumAndSmallPizza(type));
    }

    @Test
    public void testForPriceOfSmallPizza(){
        int type = 4;
        assertEquals(2000, PizzaSnacks.pricesOfLargeMediumAndSmallPizza(type));
    }

    @Test
    void testForTotalNumberOfBoxOfLargePizza() {
        int superHungry = 12;
        int total = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        assertEquals(5, PizzaSnacks.totalNumberOfBoxesForLargePizza(total));
    }

    @Test
    void testForTotalNumberOfBoxOfMediumPizza() {
        int hungry = 20;
        int total = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        assertEquals(7, PizzaSnacks.totalNumberOfBoxesOfMediumPizza(total));
    }

    @Test
    void testForTotalNumberOfBoxOfSmallPizza() {
        int classic = 4;
        int total = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        assertEquals(1, PizzaSnacks.totalNumberOfBoxesOfSmallPizza(total));

    }

    @Test
    void testForTotalNumberOfLargeMediumAndSmallPizza() {
        int superHungry = 12;
        int hungry = 20;
        int classic = 4;
        int total1 = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        int total2 = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        int total3 = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        assertEquals(13, PizzaSnacks.totalNumberOfBoxesForLargeMediumAndSmallPizza(total1, total2, total3));

    }

    @Test
    void testForLargePizzaRemainder() {
        int superHungry = 12;
        int total = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        int answer = PizzaSnacks.totalNumberOfSlicesLeftForLargePizza(total);
        assertEquals(2, answer);

    }

    @Test
    void testForMediumSizeRemainder() {
        int hungry = 20;
        int total = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        int answer = PizzaSnacks.totalNumberOfSlicesLeftForMediumPizza(total);
        assertEquals(2, answer);
    }

    @Test
    void testForSmallPizzaRemainder() {
        int classic = 4;
        int total = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        int answer = PizzaSnacks.totalNumberOfSlicesLeftForSmallPizza(total);
        assertEquals(0, answer);
    }


    @Test
    void testForTotalNumberOfSlicesLeftForBothLargeMediumAndSmall() {
        int superHungry = 12;
        int total1 = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        int answer1 = PizzaSnacks.totalNumberOfSlicesLeftForLargePizza(total1);

        int hungry = 20;
        int total2 = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        int answer2 = PizzaSnacks.totalNumberOfSlicesLeftForMediumPizza(total2);

        int classic = 4;
        int total3 = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        int answer3 = PizzaSnacks.totalNumberOfSlicesLeftForSmallPizza(total3);

        int answer = PizzaSnacks.totalNumberOfSlicesForLargeMediumAndSmall(answer1, answer2, answer3);
        assertEquals(4, answer);

    }

    @Test
    void testForAmountToBePaidForLargePizza() {
        int superHungry = 12;
        int total = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        int amount = PizzaSnacks.totalPriceForLargePizza(total);
        assertEquals(25000, amount);

    }

    @Test
    void testForAmountToBePaidForMediumPizzaPurchase() {
        int hungry = 20;
        int total = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        int amount = PizzaSnacks.totalPriceForMediumPizza(total);
        assertEquals(21000, amount);
    }

    @Test
    void testForAmountToPayForSmallPizzaPurchase() {
        int classic = 4;
        int total = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        int amount = PizzaSnacks.totalPriceForSmallPizza(total);
        assertEquals(2000, amount);
    }

    @Test
    void testForTotalAmountForLargeMediumAndSmallPizzaPurchase() {
        int superHungry = 12;
        int total = PizzaSnacks.totalNumberOfSlicesForSuperHungryPeople(superHungry);
        int amount = PizzaSnacks.totalPriceForLargePizza(total);

        int hungry = 20;
        int total2 = PizzaSnacks.totalNumberOfSlicesForHungryPeople(hungry);
        int amount2 = PizzaSnacks.totalPriceForMediumPizza(total2);

        int classic = 4;
        int total3 = PizzaSnacks.totalNumberOfSlicesForClassicPeople(classic);
        int amount3 = PizzaSnacks.totalPriceForSmallPizza(total3);


        int total4 = PizzaSnacks.totalPriceForLargeMediumAndSmallPizza(amount, amount2, amount3);
        assertEquals(48000, total4);
    }
}