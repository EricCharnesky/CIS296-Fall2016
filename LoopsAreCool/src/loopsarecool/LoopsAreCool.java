/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsarecool;

/**
 *
 * @author echarnes
 */
public class LoopsAreCool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfTimes = 10;
        int currentCount = 0;
        
        while(currentCount < numberOfTimes )
        {
            System.out.println(currentCount);
            currentCount++;
        }
        
        do
        {
            System.out.println(currentCount);
            currentCount--;
        } while ( currentCount > numberOfTimes );
        
        for ( int count = 0; count < numberOfTimes; count++ )
        {
            System.out.println(count);
            count++;
        }
        
        for ( int row = 0; row < numberOfTimes && row != 7; row++ )
        {
            for ( int collum = 0; collum <= row; collum++ )
            {
                 System.out.print("*");
            }
            System.out.println("");
        }
        
        
        if ( 10 == 10 || 10 == 9 )
        {
             System.out.println("10 does not equal 9 but I run anway!");
        }
    }
    
}
