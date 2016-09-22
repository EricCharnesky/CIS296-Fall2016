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
public class Course {
    private String name;
    private int number;
    private int credits;
    private Faculty instructor;
    
    public Course( String name, int number, int credits, Faculty instructor )
    {
        this.name = name;
        this.number = number;
        this.credits = credits;
        this.instructor = instructor;
    }
    
    public void setFaculty( Faculty instructor )
    {
        this.instructor = instructor;
    }
    
    public Faculty getInstructor()
    {
        return instructor;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public int getCredit()
    {
        return credits;
    }
    
    public String toString()
    {
        return "Name: " + name + " Number: " + number + " Credits: " + credits
            + " Instructor: " + instructor.toString();
        
    }
}
