package Utils;

public class SearchUtils {
    /**
     * 
     * This method prints the search result to the console.
     * 
     * @param indexSearch  The index of the searched number in the array. If the
     *                     number is not found, this value will be -1.
     * @param numberSearch The number that is being searched for in the array.
     *                     The method checks if the index of the searched number is
     *                     equal to -1. If it is, then the method prints "Not found"
     *                     along with the number that was searched. If the index is
     *                     not equal to -1, then the method prints "Found" along
     *                     with the number that was searched, and the index at which
     *                     the number was found.
     */
    public static void printResult(int indexSearch, int numberSearch) {
        System.out.println(indexSearch == -1 ? "Not found " + numberSearch
                : "Found " + numberSearch + " at index: " + indexSearch);
    }
}
