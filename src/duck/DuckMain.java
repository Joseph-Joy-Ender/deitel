package duck;

public class DuckMain {
    public static void main(String[] args) {
        JetFly jetFly = new JetFly();

        SimpleFly simpleFly = new SimpleFly();

        NoQuack noQuack = new NoQuack();

        SilentQuack silentQuack = new SilentQuack();

        Duck duck = new Duck(simpleFly, silentQuack);
        Duck duck1 = new Duck(jetFly, noQuack);
       duck1.setFly(simpleFly);
        duck1.flyable();
        duck1.quackable();

        duck.flyable();
        duck.quackable();

    }


}
