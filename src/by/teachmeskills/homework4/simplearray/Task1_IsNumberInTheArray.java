package by.teachmeskills.homework4.simplearray;

import java.util.Scanner;

public class Task1_IsNumberInTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for search in the array");
        int numberForSearch = scanner.nextInt();
        int[] integers = {5, 0, 7, 12, 31, 867, 173, -74, -36};
        boolean isNumberInArray = false;
        for (int integer : integers) {
            if (numberForSearch == integer) {
                isNumberInArray = true;
                break;
            }
        }
        System.out.println(isNumberInArray ? numberForSearch + " is an element of the array" : numberForSearch + " is NOT an element of the array");
    }
}
