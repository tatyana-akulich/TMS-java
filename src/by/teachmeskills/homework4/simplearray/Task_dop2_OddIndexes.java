package by.teachmeskills.homework4.simplearray;

import java.util.Arrays;
import java.util.Random;

public class Task_dop2_OddIndexes {
    public static void main(String[] args) {
        int[] initialArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            initialArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(initialArray));

        for (int i = 1; i < 10; i += 2) {
            initialArray[i] = 0;
        }

        System.out.println(Arrays.toString(initialArray));
    }
}
