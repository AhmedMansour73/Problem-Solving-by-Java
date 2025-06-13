
package StringSolving;

/** 
 * Reverse String by more than one way
 * @author Ahmed Mansour
 */
public class Reverse {
    
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    
    
    public void reverseByIterating(String str)
    {
        this.string = str;
        StringBuilder stringReverse = new StringBuilder();
//        String result = "";
        for (int i = string.length()-1 ; i > -1 ; i--) {
            stringReverse.append(string.charAt(i));  
        }
        System.out.println(stringReverse);
    }
    
}
