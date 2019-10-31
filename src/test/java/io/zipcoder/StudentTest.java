package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void testConstructor() {
        // Given
        String expectedFirstName = "David";
        String expectedLastName = "Trombello";
       ArrayList<Double> expectedScores = new ArrayList<Double>(Arrays.asList(67D, 98D));

        // When
        Student testStudent = new Student (expectedFirstName, expectedLastName, expectedScores);

        // Then
        String actualFirstName = testStudent.getFirstName();
        String actualLastName = testStudent.getLastName();
        ArrayList<Double> actualScores = new ArrayList<Double>(Arrays.asList(67D,98D));

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedScores, actualScores);
    }


    @Test
    public void setFirstNameTest() {

            // Given
            ArrayList<Double> expectedScores = new ArrayList<Double>(Arrays.asList(67D, 98D));
            Student testStudent = new Student("Mike", "Doe", expectedScores);
            String expected = "John";

            // When
            testStudent.setFirstName(expected);
            String actual = testStudent.getFirstName();

            // Then
            Assert.assertEquals(expected, actual);
        }

    @Test
    public void getFirstNameTest() {

        // Given
        ArrayList<Double> expectedScores = new ArrayList<Double>(Arrays.asList(67D, 98D));

        Student testStudent = new Student("Mike", "Doe", expectedScores);
        String expected = "John";

        // When
        testStudent.setFirstName(expected);
        String actual = testStudent.getFirstName();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setLastNameTest() {

        // Given
        ArrayList<Double> expectedScores = new ArrayList<Double>(Arrays.asList(67D, 98D));
        Student testStudent = new Student("Mike", "Doe", expectedScores);
        String expected = "Tyson";

        // When
        testStudent.setLastName(expected);
        String actual = testStudent.getLastName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNameTest() {

        // Given
        ArrayList<Double> expectedScores = new ArrayList<Double>(Arrays.asList(67D, 98D));
        Student testStudent = new Student("Mike", "Doe", expectedScores);
        String expected = "Tyson";

        // When
        testStudent.setLastName(expected);
        String actual = testStudent.getLastName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfExamsTakenTest(){
        ArrayList<Double> expectedScores = new ArrayList<>(Arrays.asList(90D, 87D, 99D));
        //Double[] expectedScores = {90D, 87D, 99D};
        Student testStudent = new Student("Mike", "Doe", expectedScores);
        Integer expected = expectedScores.size();
        Integer actual= testStudent.getNumOfExamsTaken();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void printExamScores(){
        ArrayList<Double> actualScores = new ArrayList<>(Arrays.asList(90D, 87D, 99D));
        Student testStudent = new Student("Mike", "Doe", actualScores);
        String actual = testStudent.getExamScores(actualScores);
        String expected =("Exam Scores:\n" + "\tExam 1 -> 90.0\n" + "\tExam 2 -> 87.0\n" + "\tExam 3 -> 99.0\n");
        Assert.assertEquals(expected, actual);
        //System.out.println(actual);
    }

    @Test
    public void addExamScoreTest(){
        ArrayList<Double> actualScores = new ArrayList<>(Arrays.asList(90D, 87D, 99D));
        Student testStudent = new Student("Mike", "Doe", actualScores);
        String actual = testStudent.addExamScore(95D, actualScores);
        String expected =("Exam Scores:\n" + "\tExam 1 -> 90.0\n" + "\tExam 2 -> 87.0\n" + "\tExam 3 -> 99.0\n" + "\tExam 4 -> 95.0\n");
        Assert.assertEquals(expected,actual);
        //System.out.println(actual);
    }

    @Test
    public void setExamScoreTest(){
        ArrayList<Double> actualScores = new ArrayList<>(Arrays.asList(90D, 87D, 99D));
        Student testStudent = new Student("Mike", "Doe", actualScores);
        String actual = testStudent.setExamScore(2, 65D, actualScores);
        String expected =("Exam Scores:\n" + "\tExam 1 -> 90.0\n" + "\tExam 2 -> 65.0\n" + "\tExam 3 -> 99.0\n");
        Assert.assertEquals(expected,actual);
        //System.out.println(actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        ArrayList<Double> actualScores = new ArrayList<>(Arrays.asList(90D, 87D, 99D));
        Student testStudent = new Student("Mike", "Doe", actualScores);
        Double actual = testStudent.getAverageExamScore(actualScores);
        Double expected =92.0;
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }

}