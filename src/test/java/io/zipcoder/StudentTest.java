package io.zipcoder;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

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
    public void getFirstNameTest() {
        //Given
        //Student stinkyPete

        //When
        String expected = "Stinky";
        String actual = stinkyPete.getFirstName();

        //Then
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void getLastNameTest() {
        //Given
        //Student stinkyPete

        //When
        String expected = "Pete";
        String actual = stinkyPete.getLastName();

        //Then
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void setFirstNameTest() {
        //Given
        stinkyPete.setFirstName("Smelly");

        //When
        String expected = "Smelly";
        String actual = stinkyPete.getFirstName();

        //Then
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void setLastNameTest() {
        //Given
        stinkyPete.setLastName("Peter");

        //When
        String expected = "Peter";
        String actual = stinkyPete.getLastName();

        //Then
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void getNumberOfExamsTakenTest() {
        //Given
        //Student stinkyPete

        //When
        int expected = 3;
        int actual = stinkyPete.getNumberOfExamsTaken();

        //Then
        //System.out.println(actual);
        Assert.assertTrue(actual == expected);
    }

    @Test
    public void getExamScoresTest(){
        //Given
        //Student stinkyPete

        //When
        String expected = "Exam 1 => 45.67\n" +
                "Exam 2 => 92.34\n" +
                "Exam 3 => 100.0\n";
        String actual = stinkyPete.getExamScores();

        //Then
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void addExamScoreTest() {
        //Given
        stinkyPete.addExamScore(98.45);

        //When
        String expected = "Exam 1 => 45.67\n" +
                "Exam 2 => 92.34\n" +
                "Exam 3 => 100.0\n" +
                "Exam 4 => 98.45\n";
        String actual = stinkyPete.getExamScores();

        //Then
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void setExamScoreTest() {
        //Given
        stinkyPete.setExamScore(0, 98.45);

        //When
        String expected = "Exam 1 => 98.45\n" +
                "Exam 2 => 92.34\n" +
                "Exam 3 => 100.0\n" +
        String actual = stinkyPete.getExamScores();

        //Then
        Assert.assertTrue(actual.equals(expected));
    }


}