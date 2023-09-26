package org.example;
import java.util.HashMap;
public class HashMapMain{
    public static void main (String[] args){
        HashMap <String,Integer> map = new HashMap<>();
        map.put("vishal",10);
        map.put("vaibhav",20);
        map.put("sachin",30);

        System.out.println("Size of Map"+ map.size());
        System.out.println(map);
        if(map.containsKey("visha"));
        {
            Integer a = map.get("vishal");
            System.out.println("Value for key " + "vishal is " + a);
        }
    }

}