package Banking.exception;

public class InvalidAmount extends RuntimeException{

    public InvalidAmount(String message) {
        super(message);
    }
}
