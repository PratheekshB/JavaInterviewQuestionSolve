package interview.practice.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class PrintCharecterCount {
    public static void main (String [] args){
        String str ="Hello world this is java";
        Map<Character, Integer>  freq = new HashMap<>();
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : freq.entrySet()){
            if(entry.getValue() > 0){
                System.out.println(entry.getKey() + " appears " + entry.getValue() +" times ");
            }
        }
    }
}
