package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

public class StudentTest {

    private Student student;
    private Student studentTest;
    private String firstName;
    private String lastName;
    private ArrayList<Double> testScores;
    private int numberOfExamsTaken;

    @Before
    public void setup(){
        studentTest = new Student(firstName, lastName, testScores);

    }

    @Test
    public void testSetFirstName(){
        //Given
        String expectedFirstName = "Leon";
        //When
        studentTest.setFirstName(expectedFirstName);
        //Actual
        String actual = studentTest.getFirstName();
        Assert.assertEquals(expectedFirstName, actual);

    }

    @Test
    public void testSetLastName(){
        //Given
        String expectedLastName = "Brown";
        //When
        studentTest.setLastName(expectedLastName);
        //Actual
        String actual = studentTest.getLastName();
        Assert.assertEquals(expectedLastName, actual);

    }

    @Test
    public void testGetExamScores(){
        //Given
        String firstName = "Leon";
        String lastName = "Brown";
        ArrayList<Double> testScores= new ArrayList<Double>();
        studentTest = new Student("Leon", "Brown", testScores);
        testScores.add(100.00);
        testScores.add(75.00);
        testScores.add(110.0);
        //When
        // "\n" is used to generate new line and \t\ is for horizontal tab
        String expected = "Exam Scores:\n\t\tExam 1 -> 100.0\n\t\tExam 2 -> 75.00\n\t\tExam 3 -> 110.00\n";

        //Actual
        String actual = studentTest.getExamScores();
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void setNumberOfExamsTaken(){
//        //Given
//        testScores.add(100.00);
//        testScores.add(75.00);
//        testScores.add(110.0);
//        testScores.add(45.00);
//        Integer expected = 4;
//        //When
//        studentTest.setNumberOfExamsTaken(expected);
//        //Actual
//        Integer actual = studentTest.getNumberOfExamsTaken();
//        Assert.assertEquals(expected, actual);
//    }


//
//    @Test
//    public void getExamScores(){
//        //Given
//        String expectedFirstName = "Leon";
//        String expectedLastName = "Brown";
//        Double[] examScores = { 100.00, 75.00, 110.00, 45.00 };
//        Student student = new Student(expectedFirstName, expectedLastName, testScores);
//
//        //When
//        String output = student.getExamScores();
//
//        //Then
//        System.out.println(output);
//        Assert.assertEquals(expectedFirstName, expectedLastName, examScores);
//
//    }


}