/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3fun;

/**
 *
 * @author echarnes
 */
public class Chapter3Fun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int favoriteNumber = 1;
        
        switch ( favoriteNumber )
        {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                
            case 4:
                System.out.println("4");
                //break;
            default:
                System.out.println("not in the switch");
        }
        
        if ( favoriteNumber == 1)
        {
            System.out.println("1");
        } else if ( favoriteNumber == 2 )
        {
            System.out.println("2");
        }
        else if ( favoriteNumber == 4 )
        {
            System.out.println("4");
        }
        else // same as default in switch
        {
            System.out.println("not in the if else chain");
        }
        
        System.out.println(Math.ceil(2.5));
        
        
        if ( 'A' < 'a' )
        {
            System.out.println("A is smaller");
        }
        else
        {
            System.out.println("A is bigger");
        }
        
        String message = "Welcome to class! Have a seat!";
        System.out.println( message.charAt(0));
        System.out.println(message.length());
        
        System.out.println("Hi " + " Eric!");
        
        
        int someNumber = Integer.parseInt( "123" );
        double someDouble = Double.parseDouble("123.45");
        float someFloat = Float.parseFloat("123.45");
        
        System.out.println(someNumber);
        
        System.out.println(someDouble / 7);
        System.out.printf("Here is a large number: %4.1f\n", someFloat);
    }
 
    
}
