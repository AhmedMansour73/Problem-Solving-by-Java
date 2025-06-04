
package com.problems;

/**
 * make left rotate for array by number of items
 * @author Ahmed Mansour
 */
public class LeftRotate {
    public static void rotate(int[] arr ,int numberOfItems)
    {
        int[] arrRotate =new int[arr.length];
        
        for(int i =0 ; i< arr.length ;i++)
        {
            arrRotate[i]=arr[numberOfItems];
            numberOfItems++;
            if(numberOfItems==arr.length)
                numberOfItems=0;
        }
        // print Array
        for(int i =0 ; i< arr.length ;i++)
        {
            System.out.print(arrRotate[i]+ " ");
        }
        System.out.println();
    }
    
}
