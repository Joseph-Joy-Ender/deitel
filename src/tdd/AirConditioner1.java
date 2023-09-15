package tdd;

public class AirConditioner1 {
    boolean isOn = false;
    boolean isOff = false;
    public int initialTemperature = 16;


    public void isOn() {
        isOn = true;
       // System.out.println("It is on");
    }

    public boolean getIsOn() {
        return isOn;
    }

    public boolean getIsOff() {
        return isOff;
    }

    public void isOff() {
        isOff = false;
       // System.out.println("It is off");
    }


    public int getTemperature() {
        return initialTemperature;
    }

    public int increaseTemperature() {
        return initialTemperature + 1;
    }

    public int decreasedTemperature() {
        if (initialTemperature < 16) ;
        initialTemperature = 16;
        return 15;
    }

    public int beyond30() {
        int result = 30;
        if (initialTemperature > 30)
            System.out.print("Temperature is still 30");
        return result;
    }

    public int below16() {
        int result = 16;
        if(initialTemperature < 16)
            System.out.println("Temperature is still 16");
        return result;
    }

    public boolean turnOn() {
        return isOn;
    }

    public boolean turnOff() {
        return isOn = false;
    }
}