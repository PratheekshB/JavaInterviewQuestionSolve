package interview.practice.Java8;

import java.util.*;

public class IntegerOperation {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();

        System.out.println("Duplicated elements are:");
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);

        System.out.println("Unique elements are:");
        myList.stream().distinct().toList()
                .forEach(System.out::println);

        System.out.println("Sorted the element in Ascending orders are:");
        myList.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Sorted the element in Descending orders are:");
        myList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        System.out.println("Even numbers in the List  are:");
        myList.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        long count = myList.size();
        System.out.println("Total Count is " + count);

        int sum = myList.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum of all numbers in the list is: " + sum);
    }
}

