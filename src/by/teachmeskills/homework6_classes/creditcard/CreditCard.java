package by.teachmeskills.homework6_classes.creditcard;

/*
1. CreditCard
        ●	Создать класс CreditCard c полями:
        ●	номер счета
        ●	текущая сумма на счету
        ●	Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
        ●	Добавьте метод, который позволяет снимать с карточки некоторую
        сумму.
        ●	Добавьте метод, который выводит текущую информацию о карточке.
        ●	Написать программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма

        Тестовый сценарий для проверки:
        ●	Положите деньги на первые две карточки и снимите с третьей.
        ●	Выведите на экран текущее состояние всех трех карточек.*/

import java.util.Random;

public class CreditCard {
    private long accountNumber;
    private int balance;

    public CreditCard(long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public CreditCard(long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void addMoney(int sum) {
        balance += sum;
    }

    public void withdrawMoney(int sum) {
        if (sum <= balance) {
            balance -= sum;
        } else {
            System.out.println("Operation is impossible. There is not enough money on the account");
        }
    }

    public void printInfo() {
        System.out.println("Account number is " + accountNumber + "; current balance is " + balance);
    }
}
