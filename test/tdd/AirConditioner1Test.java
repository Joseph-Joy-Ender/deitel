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
        // when
        int temperature = airConditioner1.increaseTemperature();
        //assert
        assertEquals(temperature, 22);
        assertEquals(airConditioner1.increaseTemperature(), 23);
        assertEquals(airConditioner1.decreasedTemperature(), 22);
    }

    @Test
    void decreaseTemperature(){
        assertEquals(21, airConditioner1.getTemperature());
        // when
        int temperatures = airConditioner1.decreasedTemperature();
        //check
        assertEquals(temperatures, 20);
        assertEquals(airConditioner1.decreasedTemperature(), 19);
    }

    @Test
    void temperatureBeyond30(){
        assertEquals(21, airConditioner1.getTemperature());
        //assert
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        airConditioner1.increaseTemperature();
        String temperatureBeyond30 = airConditioner1.beyond30();
        assertEquals(temperatureBeyond30, "Temperature is still 30");
    }

    @Test
    void temperatureBelow16(){
        assertEquals(21, airConditioner1.getTemperature());
        airConditioner1.decreasedTemperature();
        airConditioner1.decreasedTemperature();
        airConditioner1.decreasedTemperature();
        airConditioner1.decreasedTemperature();
        airConditioner1.decreasedTemperature();
        airConditioner1.decreasedTemperature();
        // when
        int temperatureBelow16 = airConditioner1.below16();
        //check
        assertEquals(temperatureBelow16, 16);
    }



}