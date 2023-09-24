package moocJavaProgrammingExercise;

public class Whistle {

    private String sound;

    public Whistle(String sound) {
        this.sound = sound;
    }

    public String sound(){

        return sound;
    }

    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");


        System.out.println(duckWhistle.sound());
        System.out.println(roosterWhistle.sound());




    }
}
