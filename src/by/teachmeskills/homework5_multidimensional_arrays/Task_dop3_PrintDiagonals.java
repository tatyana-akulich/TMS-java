package by.teachmeskills.homework5_multidimensional_arrays;

import java.util.Arrays;

public class Task_dop3_PrintDiagonals {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("\n\t Diagonals");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j || j == array.length - 1 - i) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
