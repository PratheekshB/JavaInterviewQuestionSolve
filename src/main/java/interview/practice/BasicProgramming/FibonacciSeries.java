package interview.practice.BasicProgramming;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the no of terms :");
//        int n = input.nextInt();
//        input.close();
        int n = 20;
        int a = 0;
        int b = 1;
        System.out.println("fibonacci Series upto " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

}
