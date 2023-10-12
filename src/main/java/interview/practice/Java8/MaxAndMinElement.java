package interview.practice.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MaxAndMinElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 7, 3);

        Integer max = list.stream().max(Integer::compareTo).orElse(null);
        Integer min = list.stream().min(Integer::compareTo).orElse(null);

        System.out.println("Maximum:" + max);
        System.out.println("Minimum:" + min);
    }
}
