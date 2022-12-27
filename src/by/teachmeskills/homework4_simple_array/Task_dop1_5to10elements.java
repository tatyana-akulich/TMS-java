package by.teachmeskills.homework4_simple_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_dop1_5to10elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("Enter length of array > 5 && <= 10");
        } while (!scanner.hasNextInt() || (length = scanner.nextInt()) <= 5 || length > 10);

        int[] initialArray = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            initialArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(initialArray));

        int counterOfEvenElements = 0;
        for (int element : initialArray) {
            if (element % 2 == 0) {
                counterOfEvenElements++;
            }
        }

        if (counterOfEvenElements == 0) {
            System.out.println("There are no even numbers in the array");
        } else {
            int[] arrayOfEven = new int[counterOfEvenElements];
            for (int i = 0, j = 0; i < length; i++) {
                if (initialArray[i] % 2 == 0) {
                    arrayOfEven[j] = initialArray[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(arrayOfEven));
        }
    }
}
