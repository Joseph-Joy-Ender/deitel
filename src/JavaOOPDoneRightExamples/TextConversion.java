package JavaOOPDoneRightExamples;

public class TextConversion {

    private final Input input;
    private final Output output;

    public TextConversion(final Input input, final Output output) {
        this.input = input;
        this.output = output;
    }
    public void showInputInUpperCase() {
        String inputText = input.fetch();
        String upperCaseText = inputText.toUpperCase();
        output.display(upperCaseText);

    }
}
