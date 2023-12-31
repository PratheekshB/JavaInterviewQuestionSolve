package interview.practice.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main
{
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
        List<int[]> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i += splitSize) {
            int length = Math.min(splitSize, array.length - i);
            int[] subArray = Arrays.copyOfRange(array, i, i + length);
            resultList.add(subArray);
        }

        return resultList;
    }
}
