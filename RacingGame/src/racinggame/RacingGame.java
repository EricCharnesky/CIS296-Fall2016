/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racinggame;

/**
 *
 * @author echarnes
 */
public class RacingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IVehicleFactory vehicleFactory1 = new TankFactory();
        IVehicleFactory vehicleFactory2 = new CarFactory();
        
        IVehicle first = vehicleFactory1.makeVehicle();
        IVehicle second = vehicleFactory2.makeVehicle();
        
        if ( first.getQuarterMileTime() > second.getQuarterMileTime() )
        {
            System.out.println( second.toString() + " beat " + first.toString() );
        }
        else if (first.getQuarterMileTime() < second.getQuarterMileTime())
        {
            System.out.println( first.toString() + " beat " + second.toString() );
        }
        else
        {
            System.out.println( first.toString() + " tied " + second.toString() );
        }
    }
    
}
