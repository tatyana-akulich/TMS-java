package by.teachmeskills.homework7.classesandinterfaces.accountingsystem;

import java.util.Date;

public class ContractWithEmployee extends Document {
    private String employeeName;
    private Date endOfContract;

    public ContractWithEmployee(Date dateOfDocument, String numberOfDocument, String employeeName, Date endOfContract) {
        super(dateOfDocument, numberOfDocument);
        this.employeeName = employeeName;
        this.endOfContract = endOfContract;
    }

    public ContractWithEmployee() {
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Date getEndOfContract() {
        return endOfContract;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Employee name is " + employeeName);
        System.out.println("Date of end of contract is " + endOfContract);
    }
}
