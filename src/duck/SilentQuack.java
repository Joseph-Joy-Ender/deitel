package duck;

public class SilentQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("I quack silently and without noise");
    }
}
