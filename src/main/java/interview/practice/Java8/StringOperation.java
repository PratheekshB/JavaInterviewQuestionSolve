package interview.practice.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringOperation {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "grapes");
        List<Integer> wordLength = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println("word length are :" + wordLength);

        System.out.println("Sorted words are:");
        words.stream().sorted().collect(Collectors.toList());
        words.forEach(System.out::println);

        Optional<String> found = words.stream().filter(word -> word.startsWith("b")).findFirst();
        System.out.println("Found words are: " + found);
    }
}
