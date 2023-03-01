package Utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {
    /**
     * Generates random integers between the specified minimum and maximum values
     * and stores them in the given array.
     *
     * @param arr the array to store the generated random integers in.
     * @param min the minimum value of the range of possible random integers
     *            (inclusive).
     * @param max the maximum value of the range of possible random integers
     *            (inclusive).
     *
     * @throws IllegalArgumentException if the given array is null or has a length
     *                                  of 0, or if the minimum value is greater
     *                                  than the maximum value.
     */
    public static void generateRandomElement(int[] arr, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((max - min) + 1) + min;
        }
    }

    /**
     * Prints the contents of the given array to the console in a formatted string.
     *
     * @param nameArray the name of the array being printed.
     * @param arr       the array to be printed.
     *
     * @throws IllegalArgumentException if the given array is null.
     */
    public static void printArray(String nameArray, int[] arr) {
        System.out.println(nameArray + ": " + Arrays.toString(arr));
    }
}
