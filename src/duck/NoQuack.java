package duck;

public class NoQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("I dont like to quack!!");
    }
}
