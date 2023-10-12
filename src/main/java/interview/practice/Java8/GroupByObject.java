package interview.practice.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class  GroupByObject {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 3, 4, 2, 5);
        Map<Integer, List<Integer>> groupByRepeating =
                list.stream()
                        .collect(Collectors.groupingBy(n -> n, Collectors.toList()));
        groupByRepeating.forEach((key, value) -> {
            System.out.println("Number " + key + " appears " + value.size() + " times: " + value);
        });
    }
}
