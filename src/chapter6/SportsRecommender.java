package chapter6;

public class SportsRecommender {

    public static String sportRecommender(int celsius) {
        if (celsius > 20 && celsius <= 30){
           return display( "It's a lovely weather for sports today!");
        } else if (celsius > 10 && celsius <= 40) {
          return   display("It's a reasonable weather for sports today");
        }else {
            return display("Please exercise with care today, watch out for the weather!");
        }
    }

    public static String display(String input){
        System.out.println(input);
        return input;
    }
}
