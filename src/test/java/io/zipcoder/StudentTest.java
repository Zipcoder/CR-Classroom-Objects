package io.zipcoder;


import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    Student stinkyPete;

    @Before
    public void setup(){
        String studentFirstName = "Stinky";
        String studentLastName = "Pete";
        Double[] studentTestScores = {45.67, 92.34, 100.00};
        stinkyPete = new Student(studentFirstName, studentLastName, studentTestScores);
    }

    @Test
    public void firstNameTest() {
        //Given

        //When
        String expectedFirstName = stinkyPete.getFirstName();
        String expectedLastName = stinkyPete.getLastName();


    }


}