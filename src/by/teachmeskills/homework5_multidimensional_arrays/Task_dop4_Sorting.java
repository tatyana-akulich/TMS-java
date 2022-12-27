package by.teachmeskills.homework5_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_dop4_Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array dimension \nAmount of lines:");
        int n = scanner.nextInt();
        System.out.println("Amount of columns:");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("Enter element [%d][%d]\n", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

        for (int[] ints : array) {
            Arrays.sort(ints);
        }

        System.out.println("\nSorted array");

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
