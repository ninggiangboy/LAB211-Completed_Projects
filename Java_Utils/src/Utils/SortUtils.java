package Utils;

public class SortUtils {
    /**
     * 
     * This method checks if the given integer array is sorted in increasing or
     * decreasing order, or not sorted at all.
     * 
     * @param arr the integer array to be checked
     * @return 0 if the array is not sorted, 1 if the array is sorted in increasing
     *         order, and 2 if the array is sorted in decreasing order.
     */
    public static int checkSort(int[] arr) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                isIncreasing = false;
            if (arr[i] < arr[i + 1])
                isDecreasing = false;
            if (!isIncreasing && !isDecreasing)
                return 0;
        }
        if (isIncreasing)
            return 1;
        else
            return 2;
    }
}
