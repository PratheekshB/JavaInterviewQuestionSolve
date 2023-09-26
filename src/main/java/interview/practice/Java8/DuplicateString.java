package interview.practice.Java8;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {
    public static void main(String[] args) {
        String str = " Hello World";
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        System.out.println(" Duplicate characters  are:");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}

