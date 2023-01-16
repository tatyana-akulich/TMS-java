package by.teachmeskills.homework9.exceptions.obligatorytask;

import by.teachmeskills.homework9.exceptions.obligatorytask.entities.ContractForGoodsSupply;
import by.teachmeskills.homework9.exceptions.obligatorytask.entities.ContractWithEmployee;
import by.teachmeskills.homework9.exceptions.obligatorytask.entities.Document;
import by.teachmeskills.homework9.exceptions.obligatorytask.entities.FinancialInvoice;
import by.teachmeskills.homework9.exceptions.obligatorytask.exceptions.Exception1a2b;
import by.teachmeskills.homework9.exceptions.obligatorytask.exceptions.Exception555;
import by.teachmeskills.homework9.exceptions.obligatorytask.exceptions.ExceptionAbc;
import by.teachmeskills.homework9.exceptions.obligatorytask.service.DocumentsCheck;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ExceptionsDemo {
    public static void main(String[] args) {
        Document contractForGoodsSupply = new ContractForGoodsSupply(
                new Date(), "555382abc", "Book", 100);
        Document contractWithEmployee = new ContractWithEmployee(
                (new GregorianCalendar(2022, Calendar.DECEMBER, 25).getTime()), "555153-A",
                "Aleksandr Ivanov", new GregorianCalendar(2023, Calendar.APRIL, 25).getTime());
        Document financialInvoice = new FinancialInvoice(
                new GregorianCalendar(2022, Calendar.AUGUST, 25).getTime(), "abc2531a2b",
                19, 384.03);

        try {
            DocumentsCheck exceptionsRealization = new DocumentsCheck();
            exceptionsRealization.checkException1a2b(financialInvoice);
            exceptionsRealization.checkException555(contractForGoodsSupply);
            exceptionsRealization.checkExceptionAbc(contractWithEmployee);

        } catch (Exception1a2b | Exception555 | ExceptionAbc e) {
            System.out.println(e.getMessage());
        }
    }
}
