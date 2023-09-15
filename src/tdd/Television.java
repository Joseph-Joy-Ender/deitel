package tdd;

public class Television {
    private boolean turnOn;
    private int initialVolume = 12;


    public void powerOn() {
        turnOn = !turnOn;
    }
    public boolean getTurnOn(){
        return turnOn;
    }

    public void increasedVolume() {
        initialVolume += 1;
    }
    public int getInitialVolume(){
        return initialVolume;
    }
}
