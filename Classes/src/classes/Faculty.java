

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
import java.util.ArrayList;

public class Faculty extends Employee {
    private ArrayList<Course> courses;
    
    public Faculty(String name, int id, double payRate )
    {
        super(name, id, payRate);
        courses = new ArrayList<Course>();
    }
    
    public void addCourse(Course course)
    {
        if ( course != null )
        {
            courses.add(course);
        }
    }
    
    public String toString()
    {
        StringBuilder output =  new StringBuilder();
        output.append( super.toString() + "\n");
        for ( Course c : courses )
        {
            output.append( c.toString() + "\n");
        }
        return output.toString();
    }
}
