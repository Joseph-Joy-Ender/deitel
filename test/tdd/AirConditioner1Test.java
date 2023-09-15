package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditioner1Test {

    AirConditioner1 airConditioner1 = new AirConditioner1();

    @BeforeEach
    void setUp() {
        airConditioner1 = new AirConditioner1();
    }

    @Test
    void AirConditionerIsOn(){
        // given
        airConditioner1.isOn();
        // when
        boolean actual = airConditioner1.getIsOn();
        // check
        assertTrue(actual);
    }

    @Test
    void AirConditionerIsOff(){
        // given
        airConditioner1.isOff();
        // when
        boolean actual = airConditioner1.getIsOn();
        //assert
        assertFalse(actual);

    }
    @Test
    void increasedTemperature(){
        // given
        airConditioner1.increaseTemperature();
        // when
        int temperature = airConditioner1.increaseTemperature();
        //assert
        assertEquals( temperature, 17);
    }

    @Test
    void decreaseTemperature(){
        // given
        airConditioner1.decreasedTemperature();
        // when
        int temperatures = airConditioner1.decreasedTemperature();
        //check
        assertEquals(temperatures, 15);
    }

    @Test
    void temperatureBeyond30(){
        //given
        airConditioner1.beyond30();
        // when
        int temperatureBeyond30 = airConditioner1.beyond30();
        //assert
        assertEquals(temperatureBeyond30, 30);
    }

    @Test
    void temperatureBelow16(){
        // given
        airConditioner1.below16();
        // when
        int temperatureBelow16 = airConditioner1.below16();
        //check
        assertEquals(temperatureBelow16, 16);
    }



}