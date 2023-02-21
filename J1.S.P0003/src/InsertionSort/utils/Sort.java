package InsertionSort.utils;

/**
 *
 * @author duykhanh
 */
public class Sort {
    public static void insertionSort(int[] array) {
        int current;
        int j;
        for (int i = 1; i < array.length; i++) {
            current = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
