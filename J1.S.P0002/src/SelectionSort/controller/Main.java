package SelectionSort.controller;

import SelectionSort.utils.Array;
import SelectionSort.utils.Sort;
import SelectionSort.view.Inputted;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        int arrNumber = Inputted.inputInt("Enter number of array: ", 0, Integer.MAX_VALUE);
        int[] array = new int[arrNumber];
        Array.generateRandomInt(array, -10, 90);
        Array.printArray("Unsorted array", array);
        Sort.selectionSort(array);
        Array.printArray("Sorted array", array);
    }
}
