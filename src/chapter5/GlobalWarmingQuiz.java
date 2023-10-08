package chapter5;
import java.util.Scanner;

public class GlobalWarmingQuiz {
    static int score = 0;
        public static void question1(){
            Scanner scanner = new Scanner(System.in);
            display("1. What is global warming?");
            display("""
                    (A) The earth is getting warmer
                    (B) The earth is getting colder
                    (C) The earth temperature is just right
                    (D) All of the above
                    """);
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("A")) {
                score++;
            }
        }

        public static void question2(){
            Scanner scanner = new Scanner(System.in);
            display("2. What is the safest and least harmful way of making electricity?");
            display("""
                    (A) Solar panels
                    (B) Burning coal
                    (C) Nuclear power
                    (D) None of the above
                    """);
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("A")){
                score++;
            }
        }

        public static void question3(){
            Scanner scanner = new Scanner(System.in);
            display("3. Which is the most polluting form of transportation?");
            display("""
                    (A) Buses
                    (B) Cars
                    (C) Planes
                    (D) Trains
                    """);
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("C")){
                score++;
            }
        }

        public static void question4(){
            Scanner scanner = new Scanner(System.in);
            display("4. What is the most environmentally- friendly form of transport?");
            display("""
                    (A) Buses
                    (B) Cars
                    (C) Trains
                    (D) Bicycles
                    """);
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("D")){
                score++;
            }
        }
        public static void question5(){
            Scanner scanner = new Scanner(System.in);
            display("5. Which of the following is not a negative effect of global warming?");
            display("""
                    (A) Larger fish population
                    (B) Few infectious diseases
                    (C) Species extinctions
                    (D) Loss of coastal areas
                    """);
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("A")){
                score++;
            }
        }

        public static void question6(){
            Scanner scanner = new Scanner(System.in);
            display("6. The country that lets off the most Carbon Dioxide is?");
            display("""
                    (A) China
                    (B) United States
                    (C) Nigeria
                    (D) Ghana
                    """);
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("A")){
                score++;
            }
        }

        public static void question7(){
            Scanner scanner = new Scanner(System.in);
            display("7. What percentage of carbon dioxide that goes into the air is absolved by the ocean?");
            display("""
                    (A) 40%
                    (B) 35%
                    (C) 70%
                    (D) 50%
                    """);
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("D")){
                score++;
            }
        }

        public static void question8(){
            Scanner scanner = new Scanner(System.in);
            display("8. Which animal is most likely to become extinct as a direct result of global warming?");
            display("""
                    (A) Polar Bear
                    (B) Elephant
                    (C) Baboon
                    (D) Tiger
                    """);
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("A")){
                score++;
            }
        }

    public static void question9(){
        Scanner scanner = new Scanner(System.in);
        display("9. The global warming that is happening now is...");
        display("""
                A. A natural cycle of the earth's climate
                B. Mostly caused by human activity
                C. Caused by the damaged ozone layer
                D. All of the above
                """);
        String answer = scanner.nextLine().toUpperCase();
        if (answer.equals("B")){
            score++;
        }
    }


    public static void question10(){
        Scanner scanner = new Scanner(System.in);
        display("10. Which of the following isa fossil fuel ?");
        display("""
                A. Hydrogen
                B. Biofuel
                C. Wind Power
                D. Petroleum
                E. Wood
                """);
        String answer = scanner.nextLine().toUpperCase();
        if (answer.equals("D")){
            score++;
        }
    }
        public static void result(){
           if (score == 10){
               display("Excellent!!");
               display("The sky is your limit");
           } else if (score == 9) {
               display("Brilliant");
           } else if (score == 8) {
               display("Very good");
           } else if (score == 7) {
               display("Good");
           } else if (score == 6) {
               display("You did well");
           } else if (score == 5) {
               display("You did well but you can try better");
           } else {
               display("Time to brush up on your knowledge of global warming");
           }
        }
        public static String display(String input){
            System.out.println(input);
            return input;
        }
    public static void main(String[] args) {
           question1();
           question2();
           question3();
           question4();
           question5();
           question6();
           question7();
           question8();
           question9();
           question10();
           result();




    }
}
