package by.teachmeskills.homework5_multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task_dop2_ElementsSum {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();
        int elementsSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int[] ints : array) {
            for (int element : ints) {
                elementsSum += element;
            }
        }
        System.out.println("Sum of elements is " + elementsSum);
    }
}

