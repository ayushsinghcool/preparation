package org.example.coding.BasicCoding;

import java.util.*;

public class Anagram {
    public static boolean checkAnagram(String str1 , String str2){
        if(str1.length() != str2.length())
            return false;
        int[] count = new int[256];
        for(int i = 0 ; i<str1.length() ; i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i = 0 ; i< count.length ; i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkAnagram("aab","baa"));

    }


}
