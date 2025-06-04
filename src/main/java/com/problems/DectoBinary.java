
package com.problems;

/**
 * convert Decimal number to binary number.
 * 
 * @author Ahmed Mansour
 */
public class DectoBinary {

       private int number;
       private String StringSetBinary="";
       private String numberAsBinary="";
       private int[] binaryNum = new int[16];
       
       public void setNumber(int number)
       {
           this.number=number;
       }

    public int getNumber() {
        return number;
    }
       
       public void getBinay()
       {
            while (number>0) 
           {
               StringSetBinary += number %2;
               number = number /2;
           }

           for(int i =0 ; i< StringSetBinary.length();i++)
           {
               numberAsBinary = StringSetBinary.charAt(i) + numberAsBinary;
           }

           System.out.println(numberAsBinary);  
       }
       
       
       public void getBinary(int x)
       {
            int i = 0;
            while (x > 0) 
            {
                // storing remainder in binary array
                binaryNum[i] = x % 2;
                x = x / 2;
                i++;
            }


            // printing binary array in reverse order
            for (int j = i - 1; j >= 0; j--)
                System.out.print(binaryNum[j]);
       }
       
        

    
}
