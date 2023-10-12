package interview.practice.DataStructure;

import java.util.Arrays;

public class BinarySearchingTechnique {
    public static void main(String [] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToFind = 3;
        int index = Arrays.binarySearch(array, elementToFind);
        if (index < 0) {
            System.out.println("The element was not found in the array");
        } else {
            System.out.println("The index of the element in the array is " + index);
        }
    }
}

