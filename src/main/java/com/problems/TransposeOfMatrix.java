
package com.problems;

/**
 * Transpose Matrix
 * 
 * @author Ahmed Mansour
 */
public class TransposeOfMatrix {
    
    
    private int[][] arrTwoDimensional ={{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6}};
    private int[][] arrayAfterTrenspose ;

    public int[][] getArrTwoDimensional() {
        return arrTwoDimensional;
    }

    public void setArrTwoDimensional(int[][] arrTwoDimensional) {
        this.arrTwoDimensional = arrTwoDimensional;
    }
        
        
    public void showTranspose()
    {
        arrayAfterTrenspose =new int[arrTwoDimensional[0].length][arrTwoDimensional.length];
        for(int i=0; i<arrTwoDimensional.length ;i++)
        {
            for(int j =0 ; j<arrTwoDimensional[0].length ; j++)
            {
                arrayAfterTrenspose[j][i]= arrTwoDimensional[i][j];

            }

        }

        for(int i=0; i<arrayAfterTrenspose.length ;i++)
        {
            for(int j =0 ; j<arrayAfterTrenspose[0].length ; j++)
            {
                System.out.print(arrayAfterTrenspose[i][j]+ " "); 

            }
            System.out.println("");
        }

    }
        
}
