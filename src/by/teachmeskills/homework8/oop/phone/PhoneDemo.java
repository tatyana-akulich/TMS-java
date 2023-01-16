package by.teachmeskills.homework8.oop.phone;

import java.util.Random;

public class PhoneDemo {
    public static void main(String[] args) {
        Random random = new Random(1000000);
        Phone phone1 = new Phone(String.valueOf(random.nextInt(10000000)), "D35-10");
        System.out.println(phone1);
        Phone phone2 = new Phone();
        System.out.println(phone2);
        Phone phone3 = new Phone(String.valueOf(random.nextInt(10000000)), "A21", 215);
        System.out.println(phone3);
        phone1.receiveCall("Tatyana");
        phone2.receiveCall("Victoria");
        phone3.receiveCall("Anastasia");
        phone1.receiveCall("Dmitry", String.valueOf(random.nextInt(10000000)));
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.sendMessage(String.valueOf(random.nextInt(10000000)), String.valueOf(random.nextInt(10000000)), String.valueOf(random.nextInt(10000000)));
    }
}
