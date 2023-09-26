package interview.practice.Java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString2 {
    public static void main(String [] args){
        String str = "Pratheeksh Bhandary";
        str = str.toLowerCase();

        Map<Character,Long> charCount= str.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Duplicate characters are: ");
        charCount.forEach((character,count)-> {
            if(count > 1) {
                System.out.println(character + " appears " +count+" times ");
            }
        });




    }
}
