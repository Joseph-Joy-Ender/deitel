package chapter3;

import org.jetbrains.annotations.NotNull;

public record Clock(int hour, int minute, int second) {

    public Clock(int hour, int minute, int second) {
        if (hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if (minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
        if (second > 59) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

   public String toString() {
        return "Hour" + ": " + hour + "\tMinute" + ": " + minute + "\tSecond" + ": " + second;

   }

}

