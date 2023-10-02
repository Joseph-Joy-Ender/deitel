package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksTest {
    @Test
    void elements() {
        int number = 12345;
        assertEquals("[1, 2, 3, 4, 5]", WeekendSnacks.returningAListOfDigits(number));
    }

    @Test
    public void testThatElementsCanAdd(){
        int number = 2342;
        assertEquals("[2, 3, 4, 2]", WeekendSnacks.returningAListOfDigits(number));
    }

    @Test
    public void element(){
        int number = 54321;
        assertEquals("[5, 4, 3, 2, 1]", WeekendSnacks.returningAListOfDigits(number));
    }

    @Test
    public void testForNegative(){
        int number = -34521;
        assertEquals("[3, 4, 5, 2, 1]", WeekendSnacks.returningAListOfDigits(number));
    }

}

