package by.teachmeskills.homework7.classesandinterfaces.accountingsystem;

import java.util.Date;

public abstract class Document implements PrintingDocument {
    private Date dateOfDocument;
    private String numberOfDocument;

    public Document(Date dateOfDocument, String numberOfDocument) {
        this.dateOfDocument = dateOfDocument;
        this.numberOfDocument = numberOfDocument;
    }

    public Document() {
    }

    public Date getDateOfDocument() {
        return dateOfDocument;
    }

    public String getNumberOfDocument() {
        return numberOfDocument;
    }

    @Override
    public void printInfo() {
        System.out.println("Date of document is " + dateOfDocument);
        System.out.println("Number of document is " + numberOfDocument);
    }
}
