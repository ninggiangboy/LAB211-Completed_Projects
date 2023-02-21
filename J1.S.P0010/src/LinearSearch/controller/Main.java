package LinearSearch.controller;

import LinearSearch.utils.Array;
import LinearSearch.utils.Search;
import LinearSearch.view.Inputted;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        int sizeArray = Inputted.inputInt("Enter number of array: ", 0, Integer.MAX_VALUE);
        int[] array = new int[sizeArray];
        int searchNumber = Inputted.inputInt("Enter search value: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        Array.generateRandomInt(array, -10, 90);
        Array.printArray("The array", array);
        int indexSearched = Search.linearSearch(array, searchNumber);
        Search.printResult(indexSearched, searchNumber);
    }
}
