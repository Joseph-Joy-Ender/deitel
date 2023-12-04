package duck;

public class Duck {
    private Flyable fly;
    private Quackable quack;

    public Duck(Flyable fly, Quackable quack) {
        this.fly = fly;
        this.quack = quack;
    }

    void flyable(){
        fly.fly();
    }
    void quackable(){
        quack.quack();
    }
    public Flyable getFly() {
        return fly;
    }

    public void setFly(Flyable fly) {
        this.fly = fly;
    }

    public Quackable getQuack() {
        return quack;
    }

    public void setQuack(Quackable quack) {
        this.quack = quack;
    }
}
