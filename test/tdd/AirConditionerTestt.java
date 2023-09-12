package tdd;

import chapter2.AirConditions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTestt {

//    @Test

    // public void temperatureTest() {

    // AirConditioner panasonic = new AirConditioner();

    // given

    // int acTemperature = 16;

    // when

    //   int temperature = panasonic.getTemperature();

    // assert

    // int degree = panasonic.getTemperature();

    // assertEquals(16, panasonic.getTemperature());

    // }

    @Test
    public void temperatureBeyond30() {

        AirConditions lifeIsGood = new AirConditions();

        // given
        int temperature = 40;

        int temperatureNumber = 10;

        // when

        int temperatureBeyond30 = lifeIsGood.temperature();

        // check

        assertEquals(30, lifeIsGood.temperature());

      //  public void lowerTemperature() {

            AirConditions lifeIsFun = new AirConditions();

            //given

            double temperatureBelow = 18;
            //when

            //  double temperatureBelow = lifeIsFun.belowTemperature();
            // assert
            assertEquals(16, lifeIsFun.belowTemperature());
        }
    }

