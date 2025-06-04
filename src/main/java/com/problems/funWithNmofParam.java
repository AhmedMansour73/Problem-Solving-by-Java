
package com.problems;

/**
 * make a function with dynamic parameter
 * @author Ahmed Mansour
 */
public class funWithNmofParam {
    
     public static void avrageOfInt(int... nums)
    {
        double sum=0;
        for(int number : nums)
        {
            sum += number;
        }
        System.out.println("avrage of nmbers is : " + (sum/nums.length));
    }
    
    // this metod get 2 parameter at least
    public static void avrageOfDouble(double num1, double num2 ,double... nums)
    {
        double sum= num1 + num2;
        for(double number : nums)
        {
            sum += number;
        }
        System.out.println("avrage of nmbers is : " + sum/(2+nums.length));
    }
    
}
