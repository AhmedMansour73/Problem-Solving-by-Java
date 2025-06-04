
package com.problems;

/**
 * hire you can get all prime number from 1 to N number
 * con you check if number is prime or not 
 * 
 * @author Ahmed Mansour
 */
public class primeNumber {
    
    public static void primeNumber(int end_number)
    {
        for(int i =2 ; i<= end_number; i++)
        {
            if( i == 2 || i == 3 || i == 5 ||i == 7 )
                System.out.print( " "+ i);
            if(i%2 == 0 || i %3 == 0 || i%5 == 0 ||i% 7== 0)
                continue;
            else
                System.out.print(" "+i);
        }
        System.out.println("\nEnd prime number Function !!");
    }

    
    
    public static boolean isPrime(int number)
    {
        if (number%2 == 0 || number %3 == 0 || number%5 == 0 ||number% 7== 0)
            return false;
        else 
            return true;
    }
    
    
    public static boolean numIsPrime(int number)
    {
        if(number <= 1)
        {
            return false;
        }
        if(number == 2)
        {
            return true;
        }
        for(int i =2 ; i <= (int)number/2 + 1 ; i++)
        {
            if(number %  i == 0)
            {
                return false;  
            }
        }

        return true;
    }
    
}
