package interview.practice.DataStructure;
    import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class FlattenArray {
        public static void main(String[] args) throws Exception {
            Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};

            Integer[] flattenedArray = flatten(array);

            System.out.println(Arrays.toString(flattenedArray));
        }

        public static Integer[] flatten(Object[] inputArray) throws Exception {
            List<Integer> result = new ArrayList<>();
            flattenHelper(inputArray, result);
            return result.toArray(new Integer[0]);
        }

        private static void flattenHelper(Object[] inputArray, List<Integer> result) {
            for (Object element : inputArray) {
                if (element instanceof Object[]) {
                    flattenHelper((Object[]) element, result);  // Recursively flatten the nested array
                } else if (element instanceof Integer) {
                    result.add((Integer) element);  // Add the integer element to the result
                } else {
                    throw new IllegalArgumentException("Unsupported element type");
                }
            }
        }
    }
