

package probsolving.probsolving;

// Packages that have code
import com.problems.*;
import StringSolving.*;


import java.util.Arrays;
import java.util.Scanner;
/**
 * main file to run Program 
 * @author Ahmed Mansour
 */
public class Probsolving {

    public static void main(String[] args) {
        
        System.out.println("convert Decimal number to binary number. ");
        DectoBinary object1 = new DectoBinary();
        object1.setNumber(20);
        System.out.println(object1.getNumber());
        object1.getBinay();
        System.out.println("------*************************************-------");
        System.out.println();
        
        System.out.println("Factorial number. ");
        Factorial.factorial(8);
        int factNumber = Factorial.factorialByRecursion(8);
        System.out.println(factNumber);
        System.out.println("------*************************************-------");
        System.out.println();

        System.out.println("Get max number in array. ");
        LargestNumberArr object2 = new LargestNumberArr();
        int [] arr = {1,2,4,6,9};
        object2.largest(arr);
        System.out.println("------*************************************-------");
        System.out.println();
        
        
        System.out.println("Left rotate for array by number of items. ");
        LeftRotate.rotate(arr, 3);
        System.out.println("------*************************************-------");
        System.out.println();
        
        System.out.println("Remov element from array . ");
        RemoveElementFromArray.removeElements(arr, 3);
        System.out.println("------*************************************-------");
        System.out.println();
        
        System.out.println("Transpose Matrix . ");
        TransposeOfMatrix object3 = new TransposeOfMatrix();
         System.out.println("Matrix 1");
        object3.showTranspose();
        int [][] arrTwoDim ={{1,7,5,3},
                             {2,6,1,7},
                             {4,7,9,8},
                             {7,9,2,6},
                             {0,0,9,4}};
        System.out.println("Matrix 2");
        object3.setArrTwoDimensional(arrTwoDim);
        object3.showTranspose();
        System.out.println("------*************************************-------");
        System.out.println();
        
        
        System.out.println("Check if two Strings are Anagrams of each other. ");
        boolean result =Anagram.isAnagram("Ahmed", "adehm");
        System.out.println(result);
        System.out.println("------*************************************-------");
        System.out.println();
        
        
        System.out.println(" Reverse string. ");
        Palindrome.reversed("asddSA");
        boolean result1 =Palindrome.isPalindrome("geeg");
        System.out.println(result1);
        System.out.println("------*************************************-------");
        System.out.println();
        
        
        System.out.println(" Function with dynamic parameter. ");
        funWithNmofParam.avrageOfInt(4,5,6);
        funWithNmofParam.avrageOfDouble(4.2,6.5,4.5,5.6,9.5);
        System.out.println("------*************************************-------");
        System.out.println();
        
        System.out.println(" Prime number from 1 to N number. ");
        primeNumber.primeNumber(105);
        System.out.println(" Check if number is prime or not. ");
        System.out.println(primeNumber.isPrime(48));
        System.out.println(primeNumber.numIsPrime(47));
        System.out.println("------*************************************-------");
        System.out.println();
        
        
        System.out.println(" Remove Duplicates from array. ");
        int[] arrWithduplicate = {1 , 2 , 3 , 4 , 5 , 1 , 2};
        RemoveDuplicates obiect4 = new RemoveDuplicates();
        obiect4.removeDup(arrWithduplicate);
        System.out.println("------*************************************-------");
        System.out.println();
        
        
        System.out.println(" Removing all occurences of a given element from array. ");
        int[] arrOccurrences = {10 , 10 ,20 ,30 ,40,10};
        int key = 10;
        RemoveAllOccurrences obiect5 = new RemoveAllOccurrences();
        obiect5.RemoveOccurrences(arrOccurrences , key);
        System.out.println("------*************************************-------");
        System.out.println();
        
        
        String sss ="ghgk";
       
        System.out.println(" Reverse String. ");
        Reverse revese = new Reverse();
        revese.reverseByIterating(sss);
        System.out.println("------*************************************-------");
        System.out.println();
        
    } 
    
    
}
