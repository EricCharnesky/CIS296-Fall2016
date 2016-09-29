/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racinggame;


import java.util.Random;
/**
 *
 * @author echarnes
 */
public class CarFactory implements IVehicleFactory {
    
    static final String[] MAKES = new String[] { "Ford", "Chevy", "GMC", "Honda" };
    static final String[] MODELS = new String[] { "Escape", "Cruise", "Focus", "Impala" };
    
    @Override
    public IVehicle makeVehicle() {
        Random random = new Random();
        return new Car("somename", 
                MAKES[random.nextInt(MAKES.length)], 
                MODELS[random.nextInt(MAKES.length)],
                random.nextDouble() * 120 );
    }
    
}
