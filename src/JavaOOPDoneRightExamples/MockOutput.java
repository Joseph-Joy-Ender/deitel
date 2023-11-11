package JavaOOPDoneRightExamples;

public class MockOutput implements Output{
    private String actual;

    public void display(String toDisplay) {
        this.actual = toDisplay;
    }

    public String getActual() {
        return actual;
    }
}
