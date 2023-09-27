package interview.practice.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class IndiesUsingHashMap {
    public int[] twoSum(int[] num, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int secondNum = target - num[i];
            if (indices.containsKey(secondNum)) {
                return new int[]{
                        indices.get(secondNum), i
                };
            }
            indices.put(num[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        int[] num = {2, 10, 7, 20};
        int target = 9;
        IndiesUsingHashMap solution = new IndiesUsingHashMap();

        try {
            int[] result = solution.twoSum(num, target);
            System.out.println("Indices : [" + result[0] + "," + result[1] + "]");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
