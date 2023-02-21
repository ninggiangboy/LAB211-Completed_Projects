package BinarySearch.utils;

/**
 *
 * @author duykhanh
 */
public class Sort {
    public static void bubbleSort(int[] arr) {
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

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
