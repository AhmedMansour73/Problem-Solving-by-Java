
package com.problems;

import java.util.ArrayList;

/**
 * removing all occurences of a given element from an array can be done using different approaches
 * @author Ahmed Mansour
 */
public class RemoveAllOccurrences {
    
    private int[] arr;
    private int key;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    
    
    public static void RemoveOccurrences(int[] arr , int key)
    {
        ArrayList<Integer> arrayOccurrences = new ArrayList<>();
      
        for (int i = 0; i < arr.length ; i++) {
            if( key != arr[i] )
                arrayOccurrences.add(arr[i]); 
        }
        System.out.println(arrayOccurrences);
     
    }
}
