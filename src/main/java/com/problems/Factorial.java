
package com.problems;

/**
 * get Factorial number by two ways -1-recursion  -2- by iteration (for)
 * @author Ahmed Mansour
 */
public class Factorial {
    
    public static void factorial(int factNumber)
    {
        int factorialResult=1;
        for(int i = 2 ; i <= factNumber ; i++)
        {
            factorialResult *=i;
        }
        System.out.println("Factorial of "+ factNumber +" is = "+factorialResult);
    }
    
    public static int factorialByRecursion(int number)
    {

        // single line to find factorial
        return (number == 1 || number == 0) ? 1 : number * factorialByRecursion(number - 1);
    }
    
}
