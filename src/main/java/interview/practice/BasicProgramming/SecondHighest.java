package interview.practice.BasicProgramming;

public class SecondHighest {
public static void main(String [] args){
    int[] array = {1,2,3,3,4,4,5,5};
    int max = Integer.MIN_VALUE;
    int secMax =Integer.MIN_VALUE;

    for(int num :array){
        if(num > max){
            secMax = max;
            max = num;
        }else if(num > secMax && num != max){
            secMax = num;
        }
    }
    if(secMax != Integer.MIN_VALUE){
        System.out.println("The Second Highest Element in the array is: "+secMax);
    }else {
        System.out.println("No Seond Element");
    }
}
}
