package by.teachmeskills.homework9.exceptions.obligatorytask.service;

import by.teachmeskills.homework9.exceptions.obligatorytask.entities.Document;
import by.teachmeskills.homework9.exceptions.obligatorytask.exceptions.Exception1a2b;
import by.teachmeskills.homework9.exceptions.obligatorytask.exceptions.Exception555;
import by.teachmeskills.homework9.exceptions.obligatorytask.exceptions.ExceptionAbc;

public class DocumentsCheck {
    public void checkExceptionAbc(Document document) throws ExceptionAbc {
        if (!document.getNumberOfDocument().contains("abc"))
            throw new ExceptionAbc();
    }

    public void checkException555(Document document) throws Exception555 {
        if (!document.getNumberOfDocument().startsWith("555"))
            throw new Exception555();
    }

    public void checkException1a2b(Document document) throws Exception1a2b {
        if (!document.getNumberOfDocument().endsWith("1a2b"))
            throw new Exception1a2b();
    }
}
