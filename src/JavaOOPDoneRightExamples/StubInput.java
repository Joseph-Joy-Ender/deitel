package JavaOOPDoneRightExamples;

public class StubInput implements Input{
    private final String stubValue;


    public StubInput(String stubValue) {
        this.stubValue = stubValue;
    }

    public String fetch() {
        return stubValue;
    }

}
