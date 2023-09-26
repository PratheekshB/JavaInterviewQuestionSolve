package interview.practice.BasicProgramming;

public class StringOperations {
    public static void main(String[] args) {

        // String Concatenation by + (String concatenation) operator
        String s = "Pratheeksh" + " Bhandary";
        System.out.println(s);

        //String Concatenation by concat() method
        String s1 = "Pratheeksh ";
        String s2 = "Bhandary";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        //String concatenation using StringBuilder class
        StringBuilder str1 = new StringBuilder("Pratheeksh");
        StringBuilder str = str1.append(" Bhandary");
        System.out.println(str);
    }
}
