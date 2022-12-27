package by.teachmeskills.homework5_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][][] array = {{{1, 0, 5}, {5, 7, 9}}, {{3, 8, 0}, {4, 11, 146}}, {{7, 147, -59}, {10, -48, 273}}};
        Scanner scanner = new Scanner(System.in);
        int addNumber = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    array[i][j][k] += addNumber;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
