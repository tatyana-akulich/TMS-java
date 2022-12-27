package by.teachmeskills.homework6_classes.creditcard;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard first = new CreditCard(101010101010101010L, 20000);
        CreditCard second = new CreditCard(201010101010101010L, 10000);
        CreditCard third = new CreditCard(301010101010101010L, 2000);
        first.addMoney(20000);
        second.addMoney(1000);
        third.withdrawMoney(1000);
        first.printInfo();
        second.printInfo();
        third.printInfo();
    }
}
