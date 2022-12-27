package by.teachmeskills.homework4_simple_array;

import java.util.Arrays;

public class Task4_2Arrays {
    public static void main(String[] args) {
        int[] array1 = {5, 2839, 9, 0, -19};
        int[] array2 = {7, 4895, 5, -938, 4};
        int sumForArray1 = 0;
        int sumForArray2 = 0;
        for (int i = 0; i < 5; i++) {
            sumForArray1 += array1[i];
            sumForArray2 += array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int average1 = sumForArray1 / 5;
        int average2 = sumForArray2 / 5;

        System.out.println(average1 > average2 ? "Average of the first array is more" : (average1 == average2 ? "Averages are equal" : "Average of the second array is more"));

    }
}
