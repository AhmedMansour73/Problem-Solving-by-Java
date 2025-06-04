
package StringSolving;

/**
 * reverse string 
 * A string is called a palindrome if the reverse of the string is the same as the original one.
 * 
 * @author Ahmed Mansouur
 */
public class Palindrome {
    public static void reversed(String str)
    {
        str = str.toLowerCase();
        String reverseString = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            reverseString += str.charAt(i);
        }
        
        if(str.equals(reverseString))
            System.out.println(str+ " is a palindrome.");
        else
            System.out.println(str+ "is not a palindrome.");
         
    }
    
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        
        str.toLowerCase();
        int i = 0, j = str.length() - 1;

        // Compare characters while i < j
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;      
            }
            i++;
            j--;
        }
        return true;
    }
}
