package chapter7;

public class CommandLineArgument {
    public static void main(String[] args) {
        String sum = String.valueOf(0);
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
            System.out.println("sum is" + sum);
            System.out.println("Argument " + (i + 1) + ": " + args[i]);

        }
    }
}
