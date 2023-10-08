package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportsRecommenderTest {

    @Test
    public void testThatAMessageIsDisplayedWhenCelsiusIsInputted(){
        assertEquals("It's a lovely weather for sports today!", SportsRecommender.sportRecommender(26));
    }
    @Test
    public void testThatAnotherMessageIsDisplayedIfALowerCelsiusIsInputted(){
        assertEquals("It's a reasonable weather for sports today", SportsRecommender.sportRecommender(40));
    }
@Test
    public void testThatMessageIsDisplayed(){
        assertEquals("Please exercise with care today, watch out for the weather!", SportsRecommender.sportRecommender(1));
}
}