package tdd;

import chapter3.AirConditionerr;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTester {
     AirConditionerr airconditioner = new AirConditionerr();

    @BeforeEach
     void setUp () { airconditioner = new AirConditionerr();}

      @Test
    void testThatTemperatureIsOn(){
        //given
          airconditioner.isOn();
          //when
          boolean actual = airconditioner.turnOn();
          //check
          assertTrue(actual);
      }
      @Test
    void testThatTemperatureIsOff(){
        //given
          airconditioner.isOff();
          //when
          boolean actual = airconditioner.turnOff();
          //check
          assertFalse(actual);
      }
      @Test
    void testThatTemperatureIsIncreased(){
        //given
          airconditioner.increaseTemperature();
          //when
          int increaseTemperature = airconditioner.temperature();
          //check
          assertEquals(increaseTemperature, 17);
         // assertEquals(temperature, 18);
      }
      @Test
    void testThatTemperatureIsDecreased(){
        //given
          airconditioner.decreasedTemperature();
          //when
          int decreasedTemperature = airconditioner.temperature();
          //check
          assertEquals(decreasedTemperature, 15);
      }
      @Test
    void testThatTemperatureCantGoBeyond30() {
          //given my ac is on
          //temperature is on 16
          int i;
          for (i = 16; i < 30; i++) {

              airconditioner.beyondTemperature();
          }
           System.out.println(i);
          //when
          int temperatureBeyond30 = airconditioner.temperature();
          //check
          assertEquals(temperatureBeyond30, 30);
      }
      @Test
    void testThatTemperatureCantGoBelow16(){
        // given that my ac is on
          airconditioner.below16();
          //when
          int temperatureBelow16 = airconditioner.temperature();
          //check
          assertEquals(temperatureBelow16, 16);
      }
    }

