package interview.practice.BasicProgramming;

public class PrintCommonFactor {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Common factor of " + a + " & " + b + " are:");
        int minNumber = Math.min(a, b);
        for (int factor = 1; factor <= minNumber; factor++) {
            if (a % factor == 0 && b % factor == 0) {
                System.out.println(factor);
            }
        }
    }
}
