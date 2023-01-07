package by.teachmeskills.homework7.classesandinterfaces.accountingsystem;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RegisterDemo {
    public static void main(String[] args) {
        Register register = new Register();
        ContractForGoodsSupply contractForGoodsSupply = new ContractForGoodsSupply(
                new Date(), "382", "Book", 100);
        register.saveDocument(contractForGoodsSupply);
        register.printDocumentInfo(contractForGoodsSupply);
        ContractWithEmployee contractWithEmployee = new ContractWithEmployee(
                (new GregorianCalendar(2022, Calendar.DECEMBER, 25).getTime()), "153-A",
                "Aleksandr Ivanov", new GregorianCalendar(2023, Calendar.APRIL, 25).getTime());
        register.saveDocument(contractWithEmployee);
        register.printDocumentInfo(contractWithEmployee);
        FinancialInvoice financialInvoice = new FinancialInvoice(
                new GregorianCalendar(2022, Calendar.AUGUST, 25).getTime(), "253",
                19, 384.03);
        register.saveDocument(financialInvoice);
        register.printDocumentInfo(financialInvoice);
    }
}
