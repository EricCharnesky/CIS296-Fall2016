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
    public final int NUMBER_OF_TIMES = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfTimes = 10;
        int currentCount = 0;
        
        whileLoopExample(currentCount, numberOfTimes);
        doLoopExample(currentCount, numberOfTimes);
        forLoopExamples( numberOfTimes );
    }
    
    public static void whileLoopExample(int currentCount, int numberOfTimes )
    {
        while(currentCount < numberOfTimes )
        {
            System.out.println(currentCount);
            currentCount++;
        }
    }
    
    
    public static void doLoopExample(int currentCount, int numberOfTimes)
    {
        do
        {
            System.out.println(currentCount);
            currentCount++;
        } while ( currentCount < numberOfTimes );
    }
    
    public static void forLoopExamples(int numberOfTimes)
    {
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
    }
    
    public static void forLoopExamples( double someDouble )
    {
        
    }
    
    public static void forLoopExamples( double someDouble, int someInt )
    {
        
    }
}
