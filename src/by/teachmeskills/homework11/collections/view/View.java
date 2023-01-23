package by.teachmeskills.homework11.collections.view;

import by.teachmeskills.homework11.collections.entity.Sphere;
import by.teachmeskills.homework11.collections.exceptions.WrongMenuItemException;

import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);
    private boolean isMenuItemRight;

    public void printMessage(String string) {
        System.out.println(string);
    }

    public int getPositiveInt() {
        int number;
        do {
            printMessage("Enter POSITIVE size for box");
        } while ((number = scanner.nextInt()) <= 0);
        return number;
    }

    private void printSpheres(List<Sphere> sphereList) {
        int counter = 1;
        for (Sphere element : sphereList) {
            System.out.printf("%d - name: %s size: %.2f \n", counter, element.getId(), element.getSize());
            counter++;
        }
    }

    public int chooseSpheres(List<Sphere> sphereList) {
        printSpheres(sphereList);
        System.out.printf("%d - enter new sphere\n", sphereList.size() + 1);
        int number = -1;
        isMenuItemRight = false;
        while (!isMenuItemRight) {
            try {
                number = scanner.nextInt();
                if (number > sphereList.size() + 1) {
                    throw new WrongMenuItemException();
                } else {
                    isMenuItemRight = true;
                }
            } catch (WrongMenuItemException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }
        return number;
    }

    public int getCommand() {
        printMessage("Choose number of operation:\n" +
                "0 - print contents of the box\n" +
                "1 - add sphere to the box\n" +
                "2 - delete sphere from box\n" +
                "3 - count spheres in the box\n" +
                "4 - count general size of all spheres\n" +
                "5 - clear box\n" +
                "6 - check if definite sphere is in the box\n" +
                "7 - print sizes of all boxes\n" +
                "8 - sort spheres in the box by size\n" +
                "9 - exit\n");
        int chosenNumber = -1;
        isMenuItemRight = false;
        while (!isMenuItemRight) {
            try {
                chosenNumber = scanner.nextInt();
                if (!String.valueOf(chosenNumber).matches("[0-9]")) {
                    throw new WrongMenuItemException();
                } else {
                    isMenuItemRight = true;
                }
            } catch (WrongMenuItemException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }
        return chosenNumber;
    }
}
