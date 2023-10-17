package programizPro.methodQuestions;

public class UseSameMethodTwice {

    public static void printNumbers(){
        System.out.println(5);
        System.out.println(100);
    }

    public static void main(String[] args) {
        printNumbers();
        printNumbers();
    }
}
