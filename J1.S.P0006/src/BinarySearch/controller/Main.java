package BinarySearch.controller;

import BinarySearch.utils.Array;
import BinarySearch.utils.Search;
import BinarySearch.utils.Sort;
import BinarySearch.view.Inputted;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        int sizeArray = Inputted.inputInt("Enter number of array: ", 0, Integer.MAX_VALUE);
        int[] array = new int[sizeArray];
        int searchNumber = Inputted.inputInt("Enter search value: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        Array.generateRandomInt(array, -10, 10);
        Sort.bubbleSort(array);
        Array.printArray("Sorted array", array);
        int indexSearched = Search.binarySearch(array, searchNumber);
        Search.printResult(indexSearched, searchNumber);
    }
}
