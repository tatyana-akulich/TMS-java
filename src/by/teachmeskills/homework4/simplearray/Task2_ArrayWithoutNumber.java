package by.teachmeskills.homework4.simplearray;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_ArrayWithoutNumber {
    public static void main(String[] args) {
        int[] integers = {5, 0, 7, 12, 31, 867, 173, -74, -36, 31, 17, 31};
        int amountOfRepetitions = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for removal");
        int numberForRemoval = scanner.nextInt();
        int lengthOfIntegers = integers.length;

        for (int integer : integers) {
            if (numberForRemoval == integer) {
                amountOfRepetitions++;
            }
        }

        if (amountOfRepetitions == 0) {
            System.out.println(numberForRemoval + " wasn't found in the array");
        } else {
            int[] withoutRemovedElement = new int[lengthOfIntegers - amountOfRepetitions];
            for (int i = 0, j = 0; i < lengthOfIntegers; i++) {
                if (integers[i] != numberForRemoval) {
                    withoutRemovedElement[j] = integers[i];
                    j++;
                }
            }
            System.out.println("Initial array " + Arrays.toString(integers));
            System.out.println("Result array " + Arrays.toString(withoutRemovedElement));
        }
    }
}
