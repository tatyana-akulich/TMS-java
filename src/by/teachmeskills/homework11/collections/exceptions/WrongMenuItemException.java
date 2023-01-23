package by.teachmeskills.homework11.collections.exceptions;

public class WrongMenuItemException extends RuntimeException {
    private final static String MESSAGE = "EXCEPTION: There is no such menu item";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
