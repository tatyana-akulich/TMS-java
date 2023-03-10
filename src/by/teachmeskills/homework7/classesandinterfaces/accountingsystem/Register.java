package by.teachmeskills.homework7.classesandinterfaces.accountingsystem;

public class Register {
    private static final int REGISTER_LENGTH = 10;
    private Document[] listOfDocuments = new Document[REGISTER_LENGTH];
    private int indexInArray = 0;

    public void saveDocument(Document document) {
        if (indexInArray < REGISTER_LENGTH) {
            listOfDocuments[indexInArray] = document;
            indexInArray++;
        } else {
            System.out.println("Register is full");
        }
    }

    public void printDocumentInfo(Document document) {
        document.printInfo();
    }
}
