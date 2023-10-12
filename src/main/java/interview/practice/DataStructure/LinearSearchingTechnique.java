package interview.practice.DataStructure;

public class LinearSearchingTechnique {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToFind = 3;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                index = i;
                break;
            }
        }
        System.out.println("index of the element is: " + index);
    }
}
