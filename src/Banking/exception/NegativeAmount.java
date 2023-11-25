package Banking.exception;

public class NegativeAmount extends RuntimeException {
    public NegativeAmount(String message) {
        super(message);
    }
}
