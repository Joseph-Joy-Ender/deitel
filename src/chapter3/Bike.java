package chapter3;

public class Bike {
    private boolean isOn;
    private int speed;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void accelerate() {
//        this.speed += gear;
        if (speed >= 0 && speed <= 20) {
            this.speed += 1;
        } else if (speed > 20 && speed <= 30) {
            this.speed += 2;
        } else if (speed > 30 && speed <= 40) {
            this.speed += 3;
        } else if (speed > 40) {
            this.speed += 4;
        }
    }

    public void deccelerate() {
        if (speed >= 0 && speed <= 20) {
            this.speed -= 1;
        } else if (speed > 20 && speed <= 30) {
            this.speed -= 2;
        } else if (speed > 30 && speed <= 40) {
            this.speed -= 3;
        } else if (speed > 40) {
            this.speed -= 4;
        }
    }
}
