
package com.problems;
import java.util.ArrayList; 
/**
 * Remove element from Array
 * array fixed make remove by Shifting
 * 
 * @author Ahmed Mansour
 */
public class RemoveElementFromArray {
    
    public static void removeElements(int[] arr, int number) 
    { 
        // Move all other elements to beginning 
        
        ArrayList<Integer> result =new ArrayList<Integer>();
        for(int i = 0 ; i<arr.length ; i++)
        {
            if( arr[i] != number)
                result.add(arr[i]);
        }
        System.out.println(result);
    } 

    
}
