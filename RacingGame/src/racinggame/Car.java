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
public class Car implements IVehicle {

    private String name;
    private String make;
    private String model;
    private double quarterMileTime;
    
    public Car( String name, String make, String model, double quarterMileTime )
    {
        this.name = name;
        this.make = make;
        this.model = model;
        this.quarterMileTime = quarterMileTime;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getQuarterMileTime() {
        return quarterMileTime;
    }
    
    public String toString()
    {
        return name + " " + make + " " + model;
    }
    
}
