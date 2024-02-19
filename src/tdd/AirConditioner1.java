package tdd;

public class AirConditioner1 {
    boolean isOn = false;
    boolean isOff = false;
    public int initialTemperature = 21;


    public void isOn() {
        isOn = true;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public boolean getIsOff() {
        return isOff;
    }

    public void isOff() {
        isOff = false;
    }


    public int getTemperature() {
        return initialTemperature;
    }

    public int increaseTemperature() {
        return initialTemperature += 1;
    }

    public int decreasedTemperature() {
        return initialTemperature -= 1;
    }

    public String beyond30() {
        if (initialTemperature >= 30){
            initialTemperature = 30;
        }
            return "Temperature is still 30";
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