package Company.Exception;

public class NoMatchIdException extends RuntimeException {
    public NoMatchIdException() {
    }

    public NoMatchIdException(String message) {
        super(message);
    }
}

