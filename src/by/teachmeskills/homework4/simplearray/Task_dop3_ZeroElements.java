package by.teachmeskills.homework4.simplearray;

import java.util.Arrays;

public class Task_dop3_ZeroElements {
    public static void main(String[] args) {
        int[] array = {74, 0, 13, 0, -47, -273, 8, 0, 56};
        //int[] array = {74, 13, -47, -273, 8, 56};
        int counterOfZeros = 0;
        for (int element : array) {
            if (element == 0) {
                counterOfZeros++;
            }
        }

        if (counterOfZeros == 0) {
            System.out.println("There are no zero elements in the array");
        } else {
            int[] modifiedArray = new int[array.length];
            for (int i = 0, j = counterOfZeros; i < array.length; i++) {
                if (array[i] != 0) {
                    modifiedArray[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(modifiedArray));
        }
    }
}

