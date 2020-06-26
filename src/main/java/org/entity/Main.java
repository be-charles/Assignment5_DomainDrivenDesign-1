package org.entity;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Student junaidMartin = new Student.StudentBuilder().setFirstName("Junaid").setLastName("Martin").setStudNum(216178606).createStudent();
    }
}
