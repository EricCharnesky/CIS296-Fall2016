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
public class Student extends Person {
    private int id;
    private String address;
    private String major;
    private Course[] courses;
    private int numberOfCourses;
    
    public Student()
    {
        this( -1 );
    }
    
    public Student( int id )
    {
        this( id, "", "", "Undecided");
    }
    
    public Student( int id, String name, String address, String major )
    {
        super(name);
        this.id = id;
        setAddress(address);
        setMajor(major);
        setupCourseArray();
        numberOfCourses = 0;
    }
    
    public void addCourse(Course course )
    {
        if ( course != null )
        {
            courses[numberOfCourses] = course;
            numberOfCourses++;
        }
    }
    
  
    
    public int getID()
    {
        return id;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress( String a )
    {
        address = a;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    public void setMajor( String m)
    {
        major = m;
    }
    
    public String toString()
    {
        StringBuilder output = new StringBuilder();
        
        output.append( "ID: " + id + " Name: " + getName() + " Major: " + major + "\n" );
        
        for ( int index = 0; index < numberOfCourses; index++ )
        {
            output.append(courses[index].toString() + "\n");
        }
        
        output.append( "Credits Completed: " + creditsCompleted() );
        return output.toString();
    }
    
    public int creditsCompleted()
    {
        int creditsCompleted = 0;
        for ( Course c : courses )
        {
            if ( c != null )
            {
                creditsCompleted += c.getCredit();
            }
        }
        return creditsCompleted;
    }
    
    private void setupCourseArray()
    {
        courses = new Course[40];
    }
    
    public boolean equals( Object o )
    {
        if ( o instanceof Student )
        {
            Student other = (Student)o;
            return ( other.getName() == getName() && 
                    other.getMajor() == major && 
                    other.getID() == id );
        }
        else
        {
            return false;
        }
    }
}
