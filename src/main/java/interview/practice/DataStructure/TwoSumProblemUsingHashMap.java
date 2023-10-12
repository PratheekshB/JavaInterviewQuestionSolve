package interview.practice.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblemUsingHashMap {
    public static void main(String[] args) {
        int[] num = {2, 10, 7, 20};
        int target = 9;

            int[] result = twoSum(num, target);
            System.out.println("Indices : [" + result[0] + "," + result[1] + "]");

    }

    public static int[] twoSum(int[] num, int target) {
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

    //Naive Solution or Bruteforce Solution
    public static class TwoSumProblemUsingForLoop {

        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }

            throw new IllegalArgumentException("No two sum solution");
        }

        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = twoSum(nums, target);
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }

}
