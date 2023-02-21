package BinarySearch;

/**
 *
 * @author duykhanh
 */
public class Search {
    public static int binarySearch(int[] array, int x) {
        if (Sort.checkSort(array) != 1) {
            System.out.println("Can't use Binary Search algorithm with unsorted array");
            return -1;
        }
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == x) {
                return mid;
            } else if (array[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void printResult(int indexSearch, int numberSearch) {
        System.out.println(indexSearch == -1 ? "Not found " + numberSearch
                : "Found " + numberSearch + " at index: " + indexSearch);
    }
}
