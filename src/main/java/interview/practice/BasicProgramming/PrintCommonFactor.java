package interview.practice.BasicProgramming;

public class PrintCommonFactor {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Common factor of " + a + " & " + b + " are:");
        int minNumber = Math.min(a, b);
        for (int i = 1; i <= minNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
            }
        }
    }
}
