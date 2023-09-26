package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfLines
{
    public static void main(String[] args)
    {
        String s = "This is a String";

        List<String> listOfLines = s.lines().collect(Collectors.toList());
        System.out.print(listOfLines);
    }
}