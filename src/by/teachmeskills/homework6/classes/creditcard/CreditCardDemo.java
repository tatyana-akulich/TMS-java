package by.teachmeskills.homework6.classes.creditcard;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard first = new CreditCard(101010101010101010L, 20000);
        CreditCard second = new CreditCard(30201090485068304L);
        CreditCard third = new CreditCard(301010101010101010L, 2000);
        first.addMoney(20000);
        second.addMoney(1000);
        third.withdrawMoney(1000);
        first.printInfo();
        second.printInfo();
        third.printInfo();
    }
}
