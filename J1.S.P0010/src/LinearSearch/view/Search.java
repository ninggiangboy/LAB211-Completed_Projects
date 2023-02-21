package LinearSearch;

/**
 *
 * @author duykhanh
 */
public class Search {
    public static int linearSearch(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void printResult(int indexSearch, int numberSearch) {

        System.out.println(indexSearch == -1 ? "Not found " + numberSearch
                : "Found " + numberSearch + " at index: " + indexSearch);
    }
}
