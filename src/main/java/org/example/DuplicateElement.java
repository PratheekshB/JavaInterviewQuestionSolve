package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElement {
    public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream) {
        Set<T> items = new HashSet<>();

        return stream
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        Stream<Integer> stream
                = Stream.of(59, 69, 59);
        System.out.println(findDuplicateInStream(stream));
    }
}
