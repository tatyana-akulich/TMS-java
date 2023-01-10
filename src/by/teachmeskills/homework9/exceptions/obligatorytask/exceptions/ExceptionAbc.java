package by.teachmeskills.homework9.exceptions.obligatorytask.exceptions;

public class ExceptionAbc extends Exception {
    public static final String MESSAGE = "Number doesn't contain \"abc\"";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
