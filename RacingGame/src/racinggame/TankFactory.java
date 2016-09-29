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
public class TankFactory implements IVehicleFactory {

    @Override
    public IVehicle makeVehicle() {
        return new Tank();
    }
}
