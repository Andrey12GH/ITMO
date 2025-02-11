package exceptions;

public class TooManyQuestionsException extends RuntimeException {
    public TooManyQuestionsException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "TooManyQuestionsException: " + super.getMessage();
    }
}
