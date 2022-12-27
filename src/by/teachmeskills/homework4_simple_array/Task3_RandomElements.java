package by.teachmeskills.homework4_simple_array;

import java.util.Arrays;
import java.util.Scanner;

public class Task3_RandomElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array (positive integer)");
        int length = scanner.nextInt();
        double[] array = new double[length];

        for (int i = 0; i < length; i++) {
            array[i] = Math.random() * length;
        }

        Arrays.sort(array);

        double averageValue = 0;

        for (int i = 0; i < length; i++) {
            averageValue += array[i];
        }

        System.out.println("Maximum value is " + array[length - 1]);
        System.out.println("Minimum value is " + array[0]);
        System.out.println("Average value is " + averageValue / length);
    }
}
