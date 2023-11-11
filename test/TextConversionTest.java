import JavaOOPDoneRightExamples.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextConversionTest implements Input, Output {
    private final Input input = this;
    private final Output output = this;
    private String actualOutput;

    // Input interface stub
    public String fetch() {
        return "abcde123";
    }

    // Output interface mock
    public void display(String output) {
        this.actualOutput = output;
    }
    @Test
    public void displayUpperCasedInput(){

        var to = new TextConversion(input, output);

        to.showInputInUpperCase();

        assertEquals(actualOutput, "ABCDE123");
    }

    @Test
    void testDisplayUpperCasedInput() {
        var in = new StubInput("josephjoyender");
        var out = new MockOutput();
        var to = new TextConversion(in, out);

        to.showInputInUpperCase();

        assertEquals(out.getActual(), "JOSEPHJOYENDER");
    }

}
