package interview.practice.BasicProgramming;


public class Palindrome {
    public static void main(String [] args) {
        String str = "Malayalam";
        if(isPalindrome(str)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is Not Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
       str = str.toLowerCase();
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
