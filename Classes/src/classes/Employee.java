/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author echarnes
 */
public class Employee extends Person {
    
    private int id;
    private double payRate;
    
    public Employee( String name, int id, double payRate )
    {
        super(name);
        this.id = id;
        this.payRate = payRate;
    }
    
    public String toString()
    {
        return "Name: " + getName() + " ID: " + id + " PayRate: " + payRate;  
    }
}
