package by.teachmeskills.homework5.multidimensionalarrays;

import java.util.Arrays;
import java.util.Random;

public class Task_dop1_MatrixMultiplication {
    public static void main(String[] args) {
        int length = 3;
        int[][] first = new int[length][length];
        int[][] second = new int[length][length];
        int[][] result = new int[length][length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                first[i][j] = random.nextInt(5);
                second[i][j] = random.nextInt(5);
            }
        }

        System.out.println("First array");
        for (int[] ints : first) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("\nSecond array");
        for (int[] ints : second) {
            System.out.println(Arrays.toString(ints));
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    result[i][j] += (first[i][k] * second[k][j]);
                }
            }
        }

        System.out.println("\nResult of multiplication");
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
