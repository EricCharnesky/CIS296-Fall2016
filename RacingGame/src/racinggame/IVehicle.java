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
public interface IVehicle {
    public abstract String getName();
    public abstract String getMake();
    public abstract String getModel();
    public abstract String toString();
    public abstract double getQuarterMileTime();
}
