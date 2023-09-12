package chapter3;

public class AirConditionerr {
    private int initialTemperature = 16;
    private boolean isOn;
  //  private int temperature;


    public void isOn() {
        this.isOn = !isOn;
    }

    public boolean turnOn() {
        return true;
    }

    public void isOff() {
        this.isOn = isOn;
    }

    public boolean turnOff() {
        return isOn;
    }

    public void increaseTemperature() {
        initialTemperature = initialTemperature + 1;
    }

    public int temperature() {
        return initialTemperature;
    }

    public void decreasedTemperature() {
       // if (initialTemperature > 16) {
         //   temperature = initialTemperature - 1;
            initialTemperature = initialTemperature - 1;
        //}
    }

    public int beyondTemperature() {
        if (initialTemperature > 30) {
            // System.out.println(30);
           // return 30;
        }
           // return this.initialTemperature;
            return initialTemperature = 30;
        }


    public int below16() {
        if(initialTemperature < 16){
            System.out.println(16);
        }
        return this.initialTemperature;
        }
    }


