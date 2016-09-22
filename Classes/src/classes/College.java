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

import java.util.Random;

public class College {
    public static void main(String[] args)
    {
        
        Random rand = new Random();
        
        Student student1 = new Student(rand.nextInt(100), "Bob Jones", "123 Main St.", "CIS");
        System.out.println("Student ID: " + student1.getID() );
        changeName(student1);
        Student student2 = new Student(rand.nextInt(100));
        System.out.println("Student ID: " + student2.getID() );
        student2.setName("Bob Jones");
        student2.setAddress("123 Main St.");
        student2.setMajor("CIS");
        System.out.println( "Student1 == Student2: " + student1.equals( student2) );
        student1 = student2;
        System.out.println("Student 1: " + student1.toString());
        System.out.println("Student 2: " + student2.toString());
        student1.setMajor("Art");
        System.out.println("Student 1: " + student1.toString());
        System.out.println("Student 2: " + student2.toString());
        Student student3 = new Student();
        System.out.println("Student ID: " + student3.getID() );
        System.out.println(student3.toString());
        Faculty faculty = new Faculty("Eric", rand.nextInt(100), 10.0);
        student1.addCourse( new Course("Java", 296, 3, faculty ) );
        System.out.println("Student 1: " + student1.toString());
        
        Person people[] = new Person[100];
        
        people[0] = student1;
        people[1] = faculty;
        people[2] = new Employee("Josh", 100, 75);
        
        System.out.println(((Person)people[0]).toString());
        System.out.println(people[1].toString());
        System.out.println(people[2].toString());
        
        System.out.println( "Student1 == Student2: " + student1.equals( student2) );
            
        
        
    }
    
    public static void changeName( Student student )
    {
        student.setName("Changed name");
        student  = new Student(-123);
    }
}
