package SelectionSort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author duykhanh
 */
public class Array {
    public static void generateRandomInt(int[] arr, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((max - min) + 1) + min;
        }
    }

    public static void printArray(String nameArray, int[] arr) {
        System.out.println(nameArray + ": " + Arrays.toString(arr));
    }
}
