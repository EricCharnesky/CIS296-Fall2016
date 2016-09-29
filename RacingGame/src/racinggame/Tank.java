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
public class Tank implements IVehicle {

    @Override
    public String getName() {
        return "TANK";
    }

    @Override
    public String getMake() {
        return "TANK";
    }

    @Override
    public String getModel() {
        return "SMASH!";
    }

    @Override
    public double getQuarterMileTime() {
        return 60.0;
    }
    
    public String toString()
    {
        return "TANK SMASH!";
    }
}
