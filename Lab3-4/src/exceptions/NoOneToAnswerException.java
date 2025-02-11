package exceptions;

public class NoOneToAnswerException extends Exception {
    public NoOneToAnswerException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "NoOneToAnswerException: " + super.getMessage();
    }
}
