package by.teachmeskills.homework9.exceptions.obligatorytask.exceptions;

public class Exception1a2b extends Exception {
    public static final String MESSAGE = "Number doesn't end with \"1a2b\"";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
