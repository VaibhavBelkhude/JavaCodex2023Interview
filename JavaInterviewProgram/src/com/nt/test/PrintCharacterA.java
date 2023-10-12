package com.nt.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintCharacterA {
    public static void main(String[] args) {
        String s1 = "aaabbbccaaa";
        
       List<String>sr= Arrays.stream(s1.split(""))
        //.distinct()
        .collect(Collectors.toList());
     System.out.println(sr);   
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                System.out.print("a");
            }
        }
        //System.out.println(sr);   
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'b') {
                System.out.print("b");
            }
        }
    }
}
