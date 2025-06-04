
package com.problems;

/**
 * et max number in Array 
 * @author Ahmed Mansour
 */
public class LargestNumberArr {
    
    private int[] arr;
    private int maxNumber;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    
    
    public void largest(int[] array)
    {
        this.arr = array;
        maxNumber = array[0];
       for(int i =1 ; i <arr.length ; i++)
       {
           if(arr[i]>maxNumber)
               maxNumber=arr[i];
       }
        System.out.println("Max number is : " +maxNumber); 
    }
    
}
