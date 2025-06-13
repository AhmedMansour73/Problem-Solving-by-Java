
package com.problems;

import java.util.ArrayList;

/**
 * Remove duplicated elements rom array
 * @author Ahmed Mansour
 */
public class RemoveDuplicates {
    
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    
    
    public  void removeDup(int[] arr)
    {
        this.arr = arr;
        ArrayList<Integer> arrayNotHavaDuplicates = new ArrayList<>();
        
        if(arr.length == 1)
            System.out.println(arr[0]);
        else{
            for (int i = 0; i < arr.length ; i++) {
                if( !arrayNotHavaDuplicates.contains(arr[i]) )
                    arrayNotHavaDuplicates.add(arr[i]); 
            }
            System.out.println(arrayNotHavaDuplicates);
        }
        
    }
    
}
