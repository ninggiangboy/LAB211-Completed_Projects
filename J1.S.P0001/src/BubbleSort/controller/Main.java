package BubbleSort.controller;

import BubbleSort.utils.Array;
import BubbleSort.utils.Sort;
import BubbleSort.view.Inputted;

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
        Sort.bubbleSort(array);
        Array.printArray("Sorted array", array);
    }
}
