package interview.practice.DataStructure;

import java.util.Stack;

public class LimitCharacterOccurrence {
    public static void main(String[] args) {
        String s = "aababbccdccc";
        int limit1 = 1;

        Stack <Character> stack =new  Stack <Character>();
         StringBuilder res= new StringBuilder();
        int count=0;

        for(int i=0;i<s.length();i++){
            if(stack.empty()){
                stack.push(s.charAt(i));
                count++;
            }else if(count<limit1 && stack.peek().equals(s.charAt(i))){
                stack.push(s.charAt(i));
                count++;
            }else if(stack.peek().equals(s.charAt(i))){
                continue;
            }else{
                while(!stack.empty()){
                    res.append(stack.peek());
                    stack.pop();

                }
                stack.push(s.charAt(i));
                count=1;
            }
        }
        while(!stack.empty()){
            res.append(stack.peek());
            stack.pop();

        }
        System.out.println(res);
    }
}

