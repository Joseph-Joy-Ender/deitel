package MyDiary;

public class EntryIsLockedException extends RuntimeException {
    public EntryIsLockedException(String message) {
        super(message);
    }
}
