package JavaOOPDoneRightExamples;

public class TextUtility {
    public static void main(String[] args) {
        Input input = new KeyboardInput();
        Output output = new ConsoleOutput();

        new TextConversion(input, output).showInputInUpperCase();
    }
}
