package interview.practice.DataStructure;

import java.util.HashSet;
import java.util.Set;

public class StringPrintWithoutDuplicates {
    public static void main(String[] args) {
        String str = "TarentoTechnologiesTarento";
        Set<Character> characters = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!characters.contains(c)) {
                System.out.print(c);
                characters.add(c);
            }
        }
    }
}
