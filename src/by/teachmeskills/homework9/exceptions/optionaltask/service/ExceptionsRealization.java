package by.teachmeskills.homework9.exceptions.optionaltask.service;

import by.teachmeskills.homework9.exceptions.optionaltask.exceptions.WrongLoginException;
import by.teachmeskills.homework9.exceptions.optionaltask.exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionsRealization {
    public static boolean checkCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.indexOf(' ') >= 0) {
            throw new WrongLoginException("Invalid login");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmation are not equal");
        }

        String regex = ".*\\d+.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (password.length() >= 20 || password.indexOf(' ') >= 0 || !matcher.matches()) {
            throw new WrongPasswordException("Invalid password");
        }
        return true;
    }
}
