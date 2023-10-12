package interview.practice.DataStructure;
public class LimitCharecter {
    public static void main(String[] args) {
        String str = "aababbccdccc";
        int limit = 1;
        String result = limitString(str, limit);
        System.out.println(result);
    }

    private static String limitString(String str, int limit) {
        int i = 0;
        int j = 0;
        StringBuilder newStr = new StringBuilder();
        int n = str.length();
        int count = 0;
        while (j < n) {
            if (i == j) {
                newStr.append(str.charAt(j));
                count += 1;
                j += 1;
            } else {
                if(str.charAt(i) == str.charAt(j)){
                    count += 1;
                    if(count <= limit){
                        newStr.append(str.charAt(j));
                    }else {
                        while (j < n && str.charAt(i) == str.charAt(j++)) ;
                    }
                    j += 1;
                }else{
                    count = 0;
                    i = j;
                }
            }
        }
        return newStr.toString();
    }
}