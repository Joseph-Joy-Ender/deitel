package chapter7;

public class DeckOfCardTest {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();

        for (int i = 1; i <= 4 ; i++) {
            System.out.printf("%-19s", deckOfCards.dealCard());

           // if (i % 4 == 0) System.out.println();

        }
    }
}
