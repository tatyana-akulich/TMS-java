package by.teachmeskills.homework10.strings.obligatorytask;

/*
Основное задание
        1. Написать программу со следующим функционалом:
        На вход передать строку (будем считать, что это номер документа). Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
        Вывести на экран в одну строку два первых блока по 4 цифры.
        Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
        Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
        Проверить начинается ли номер документа с последовательности 555.
        Проверить заканчивается ли номер документа на последовательность 1a2b.
        Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.
*/

import java.util.Scanner;

public class StringsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Enter string in the next format: xxxx-yyy-xxxx-yyy-xyxy (x is a number and y - a letter)");
        //EXAMPLE OF STRING  5554-dgf-1111-abc-1a2b
        while (true) {
            string = scanner.nextLine();
            if (string.equalsIgnoreCase("EXIT")) {
                System.exit(0);
            } else if (!string.matches("\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-(\\d[a-zA-Z]){2}")) {
                System.out.println("Line doesn't pass the format xxxx-yyy-xxxx-yyy-xyxy (x is a number and y - a letter). " +
                        "Try again or print EXIT to exit");
            } else break;
        }
        Methods.print2BlocksOf4Elements(string);
        Methods.changeLettersToStars(string);
        Methods.printLetterInLowerCase(string);
        Methods.printLettersInUpperCase(string);
        System.out.println(Methods.contentsAbc(string));
        System.out.println(Methods.startsWith555(string));
        System.out.println(Methods.endsWith1a2b(string));
    }
}
