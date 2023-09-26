package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "Pratheeksh is good Boy";
        // printing frequency
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        // printing duplicate Character
        System.out.println("Duplicate Characters are :");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appers " + entry.getValue() + " times");
            }
        }
    }
}
