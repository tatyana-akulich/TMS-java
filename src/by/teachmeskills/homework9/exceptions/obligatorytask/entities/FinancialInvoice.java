package by.teachmeskills.homework9.exceptions.obligatorytask.entities;

import java.util.Date;

public class FinancialInvoice extends Document {
    private int departmentCode;
    private double sumForMonth;

    public FinancialInvoice(Date dateOfDocument, String numberOfDocument, int departmentCode, double sumForMonth) {
        super(dateOfDocument, numberOfDocument);
        this.departmentCode = departmentCode;
        this.sumForMonth = sumForMonth;
    }

    public FinancialInvoice() {
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public double getSumForMonth() {
        return sumForMonth;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Department code is " + departmentCode);
        System.out.println("Sum of the month is " + sumForMonth);
    }
}
