package interview.practice.Java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringByWords {
    public static void main(String[] args) {
        String str = "Hello World";
        String reverseStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverseStr);
    }
}

