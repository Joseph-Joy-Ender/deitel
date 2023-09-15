package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AirConditionTest {
    AirConditions airConditioner = new AirConditions();

    @BeforeEach
    void setUp() {
        airConditioner = new AirConditions();
    }

    @Test
    void setTemperature() {
    }

    @Test
    void getTemperature() {
    }

    @Test
    void DecreaseTemperature() {
        airConditioner.decreaseTemperature();
        int actual = airConditioner.getTemperature();
        assertEquals(16, actual);
    }

    @Test
    void increaseTemperature() {
        airConditioner.increaseTemperature();
        int actual = airConditioner.getTemperature();
    assertEquals(17, actual );
    }
}