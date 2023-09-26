package interview.practice.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class DeskCombination {
    public static void main (String [] args){
        int totalDesks = 6;
        int occupiedDesk = 4;
        List<int[]> combinations = generateCombination(totalDesks,occupiedDesk);
        for (int[] combination : combinations ){
            System.out.println("[" + combination[0] + "," +combination[1]+ "]");
        }
    }
    public static List<int[]>generateCombination(int totalDesks, int occupiedDesk){
        List<int[]> combinations = new ArrayList<>();
        for (int i = 1; i<=totalDesks;i++){
            if(i!=occupiedDesk){
                for(int j = i+1; j<= totalDesks; j++){
                    if(j!= occupiedDesk && (j-i==1 || j-i ==2)){
                        combinations.add(new int[]{i,j});
                    }
                }
            }
        }return  combinations;
    }
}
