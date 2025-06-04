/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Write a function to check whether two given strings are anagrams of each other or not. 
//An anagram of a string is another string that contains the same characters, only the order of characters can be different.
//
//For example, “abcd” and “dabc” are an anagram of each other.
package StringSolving;
import java.util.Arrays;

/**
 * Check if two Strings are Anagrams of each other
 * An anagram of a string is another string that contains the same characters,
 * only the order of characters can be different.
 * 
 * @author Ahmed Mansour
 */
public class Anagram {
    
    public static boolean isAnagram(String str1 , String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        char[] s1Array = str1.toCharArray();
        char[] s2Array = str2.toCharArray();
 
        // If length of both strings is not
        // same, then they cannot be anagram
        if ( s1Array.length != s2Array.length)
            return false;
 
        // Sort both strings
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
 
        // Compare sorted strings
        for (int i = 0; i <  s1Array.length; i++)
            if (s1Array[i] != s2Array[i])
                return false;
 
        return true;
    }
    
}
