public class NegativeNumberException extends Throwable {
    private static final String message = "Negatives not allowed.";

    public String getMessage() {
        return message;
    }
}
