package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    //private String firstName;
    //private String lastName;
    //private ArrayList<Double> examScores;

    Student testStudent;

    @Before
    public void setPersonUp(){

        Double[] testScores = {98.0, 92.0, 96.0};
        testStudent = new Student("Joe", "Hendricks", testScores);

    }

    @Test
    public void SetFirstNameTest() {
        // Given
        String expected = "Bob";

        // When
        testStudent.setFirstName(expected);
        String actual = testStudent.getFirstName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SetLastNameTest() {
        // Given
        String expected = "Clooney";

        // When
        testStudent.setLastName(expected);
        String actual = testStudent.getLastName();

        // Then
        Assert.assertEquals(expected, actual);
    }
    /*
    @Test
    public void TestScoreTest() {
        // Given
        Student student = new Student();
        double expected = 0.0;

        // When
        //student.setLastName(expected);
        double actual = student.getTestScore();

        // Then
        Assert.assertEquals(expected, actual, .01);
    }
    */

    @Test
    public void GetNumberOfExamsTakenTest() {
        // Given
        int expected = 3;

        // When
        int actual = testStudent.getNumberOfExamsTaken();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetExamScoresTest() {
        // Given
        String expected = "Exam Scores:\n\t\tExam 1 -> 98.0\n\t\tExam 2 -> 92.0\n\t\tExam 3 -> 96.0\n";

        // When
        String actual = testStudent.getExamScores();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest() {
        // Given
        double examScore = 98.0;
        testStudent.addExamScore(examScore);

        // When
        double expected = 4;
        double actual = testStudent.getNumberOfExamsTaken();

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void GetAverageExamScoreTest() {
        // Given
        double expected = 95.0;

        // When
        double actual = testStudent.getAverageExamScore();

        // Then
        Assert.assertEquals(expected, actual, .01);
        }

    @Test
    public void toStringTest() {
        // Given
        String expected = "Student Name: Joe Hendricks\n" +
                "> Average Score: 95.0\n" +
                "> Exam Scores:\n" +
                "\t\tExam 1 -> 98.0\n" +
                "\t\tExam 2 -> 92.0\n" +
                "\t\tExam 3 -> 96.0\n";

        // When
        String actual = testStudent.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
    }



