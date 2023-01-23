package by.teachmeskills.homework11.collections.exceptions;

public class EmptyBoxException extends RuntimeException {
    private final String MESSAGE = "EXCEPTION: Invalid operation with EMPTY box";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
