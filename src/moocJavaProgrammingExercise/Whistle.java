package moocJavaProgrammingExercise;

public record Whistle(String sound) {

    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");


        System.out.println(duckWhistle.sound());
        System.out.println(roosterWhistle.sound());


    }
}
