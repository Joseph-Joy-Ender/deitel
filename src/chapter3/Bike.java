package chapter3;

public class Bike {
    private String name;
    private boolean isOn;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}