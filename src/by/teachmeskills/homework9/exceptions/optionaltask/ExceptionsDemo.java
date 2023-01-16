package by.teachmeskills.homework9.exceptions.optionaltask;

import by.teachmeskills.homework9.exceptions.optionaltask.exceptions.WrongLoginException;
import by.teachmeskills.homework9.exceptions.optionaltask.exceptions.WrongPasswordException;
import by.teachmeskills.homework9.exceptions.optionaltask.service.CredentialsControl;

public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            System.out.println(CredentialsControl.checkCredentials("11111 11111111111", "vb12", "vb12"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(CredentialsControl.checkCredentials("1111111111111111", "vb", "vb12"));
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(CredentialsControl.checkCredentials("1111111111111111", "vbvb", "vbvb"));
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}
