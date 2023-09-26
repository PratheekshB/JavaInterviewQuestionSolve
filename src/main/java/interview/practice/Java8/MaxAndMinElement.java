package interview.practice.Java8;

import java.util.List;
import java.util.stream.Stream;

public class MaxAndMinElement  {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 2, 9, 1, 7, 3);
        List<Integer> streamList =stream.toList();

        Integer max = streamList.stream().max(Integer::compareTo).orElse(null);
        Integer min = streamList.stream().min(Integer::compareTo).orElse(null);

        System.out.println("Maximum:" + max);
        System.out.println("Minimum:" + min);
    }
}
