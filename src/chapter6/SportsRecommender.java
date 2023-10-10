package chapter6;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class SportsRecommender {

    @NotNull
    @Contract(pure = true)
    public static String sportRecommender(int celsius) {
        String result;
        if (celsius >= 20 && celsius <= 30){
            result = "It's a lovely weather for sports today";
        } else if (celsius >= 10 && celsius <= 40) {
            result = "It's a reasonable weather for sports today";
        }else {
            result = "Please exercise with care today, watch out for the weather";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(sportRecommender(76));
    }
}
