package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    AirConditioner airConditioner = new AirConditioner();

    @BeforeEach
    void setUp() {
        airConditioner = new AirConditioner();
    }

    @Test
    void AirConditionerIsOn(){
        // given
        airConditioner.isOn();
        // when
        boolean actual = airConditioner.getIsOn();
        // check
        assertTrue(actual);
    }

    @Test
    void AirConditionerIsOff(){
        // given
        airConditioner.isOff();
        // when
        boolean actual = airConditioner.getIsOn();
        //assert
        assertFalse(actual);

    }
    @Test
    void increasedTemperature(){
        // given
        airConditioner.increaseTempertaure();
        // when
        int temperature = airConditioner.increaseTempertaure();
        //assert
        assertEquals( temperature, 17);
    }

    @Test
    void decreaseTemperature(){
        // given
        airConditioner.decreasedTemperature();
        // when
        int temperatures = airConditioner.decreasedTemperature();
        //check
        assertEquals(temperatures, 15);
    }

    @Test
    void temperatureBeyond30(){
        //given
        airConditioner.beyond30();
        // when
        int temperatureBeyond30 = airConditioner.beyond30();
        //assert
        assertEquals(temperatureBeyond30, 30);
    }

    @Test
    void temperatureBelow16(){
        // given
        airConditioner.below16();
        // when
        int temperatureBelow16 = airConditioner.below16();
        //check
        assertEquals(temperatureBelow16, 16);
    }



}