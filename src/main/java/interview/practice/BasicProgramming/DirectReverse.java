package interview.practice.BasicProgramming;

public class DirectReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        for (int i = str.length(); i > 0; --i) {
            System.out.print(str.charAt(i - 1));
        }
    }
}
//        String reverse = reverse(str);
//        System.out.println(reverse);
//    }
//
//    public static String reverse(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
//}
