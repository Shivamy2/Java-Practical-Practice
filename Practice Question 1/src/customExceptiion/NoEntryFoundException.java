package customExceptiion;

public class NoEntryFoundException extends Exception {
    public NoEntryFoundException(String message) {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return "Try another entry";
    }
}
