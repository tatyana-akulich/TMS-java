package by.teachmeskills.homework11.collections.exceptions;

public class SizeExceededException extends RuntimeException {
    private static final String MESSAGE = "EXCEPTION: Operation failed. Box is already full.";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
