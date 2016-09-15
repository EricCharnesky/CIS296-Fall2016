/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author echarnes
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lotsOfIntegers = new int[10];
        double[] someDoubles = { 1.1, 2.2, 3.3 };
        for( int index = 0 ; index < lotsOfIntegers.length ; index++ )
        {
            lotsOfIntegers[index] = index;
        }
        
        for( int index = 0 ; index < lotsOfIntegers.length ; index++ )
        {
            System.out.println(lotsOfIntegers[index]);
        }
        
        for( int index = 0 ; index < someDoubles.length ; index++ )
        {
            System.out.println(someDoubles[index]);
        }
        
        for( int singleInt : lotsOfIntegers )
        {
            System.out.println(singleInt);
        }
        
        int[][] luckyNumbers = new int[10][11];
        
        for ( int row = 0; row < luckyNumbers.length; row++ )
        {
            for ( int col = 0; col < luckyNumbers[row].length; col++ )
            {
                luckyNumbers[row][col] = row + col;
            }
        }
        
        for ( int row = 0; row < luckyNumbers.length; row++ )
        {
            for ( int col = 0; col < luckyNumbers[row].length; col++ )
            {
                System.out.print(luckyNumbers[row][col] + "\t");
            }
            System.out.println("");
        }
    }
    
}
