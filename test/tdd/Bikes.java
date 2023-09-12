package tdd;

public class Bikes {

    private boolean isOn;
    private int gear;
    private int speed;
    private boolean drive;
    public void toggleOn() {
        isOn = !isOn;
    }
    public boolean getIsOn(){
        return isOn;
    }

    public void accelerate() {
        if (isOn){
            if(speed >= 41){
                gear = 4;
                speed += 4;
            }
            if(speed >= 31 && speed <= 40){
                gear = 3;
                speed += 3;
            }
            if(speed >= 21 && speed <= 30){
                gear = 2;
                speed += 2;
            }
            if (speed >= 0 && speed <= 20) {
                gear = 1;
                speed++;
            }

        }
    }

    public void toggleDrive() {
       if (isOn){
           if (drive) {
               drive = false;
               gear = 0;
           } else {
               drive = true;
               gear = 0;
           }
       }
    }

    public boolean getDrive() {
        return drive;
    }
    public int getGear(){
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {
        if (speed <= 0){
            speed = 0;
            gear = 1;
        }
        if (speed > 0 && speed <= 20) {
            gear = 1;
            speed--;
        }
        if (speed <= 21 && speed <= 30) {
            gear = 2;
            speed -= 2;
        }
        if (speed <= 31 && speed <= 40){
            gear = 3;
            speed -= 3;
        }
        if (speed >= 41){
            gear = 4;
            speed -= 4;
        }
    }
}