package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {


    @Test
    public void testConstructor() {
        //Given
        String expectedFirstName = "Sarah";
        String expectedLastName = "Blanding";
        //When
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(150.0,200.0));
        Student student = new Student("Sarah","Blanding", examScores);
        //Then
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void testGetFirstName() {
        //Given
        String expectedFirstName = "Sarah";
        //When
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(150.0, 200.0));
        Student student = new Student("Sarah","Blanding", examScores);
        //Then
        String actualFirstName = student.getFirstName();

        Assert.assertEquals(expectedFirstName, actualFirstName);
    }

    @Test
    public void testGetLastName() {
        //Given
        String expectedLastName = "Blanding";
        //When
        String firstName = "Sarah";
        String lastName = "Blanding";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(150.0,200.0));
        Student student = new Student(firstName,lastName, examScores);
        //Then
        String actualLastName = student.getLastName();

        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void testGetNumberOfExamsTaken() {
        //Given
        int expectedNumberOfExams = 2;
        //When
        String firstName = "Sarah";
        String lastName = "Blanding";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(150.0,200.0));
        Student student = new Student(firstName,lastName, examScores);
        //Then
        int actualNumberofExams = student.getNumberOfExamsTaken(examScores);

        Assert.assertEquals(expectedNumberOfExams, actualNumberofExams);
    }

    @Test
    public void testGetExamScores() {
        //Given
        String expectedExamScores = "Exam Scores:\n\tExam 1 -> 150\n\tExam 2 -> 200\n\tExam 3 -> 175";
        //When
        String firstName = "Ben";
        String lastName = "Messick";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(150.0, 200.0, 175.0));
        Student student = new Student(firstName,lastName, examScores);
        //Then
        String actualExamScores = student.getExamScores();

        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void testAddExamScores() {
        //Given
        ArrayList<Double> exam = new ArrayList<>();
        Student student = new Student("Sarah", "Messick", exam);
        //When
        student.addExamScore(150.0);
        String output = student.getExamScores();
        //Then
        System.out.println(output);
    }

    @Test
    public void testSetExamScores() {
        //Given
        ArrayList<Double> exam = new ArrayList<>(Arrays.asList(150.0));
        Student student = new Student("Sarah", "Messick", exam);
        String originalTestScore = student.getExamScores();
        //When
        student.setExamScore(1,130.0);
        String changedTestScore = student.getExamScores();
        //Then
        System.out.println(originalTestScore + "\n" + changedTestScore);
    }

    @Test
    public void testGetAverageExamScore() {
        //Given
        int expectedAverage = 100;
        //When
        ArrayList<Double> exam = new ArrayList<>(Arrays.asList(150.0, 100.0, 50.0, 100.0));
        Student student = new Student("Sarah", "Messick", exam);
        //Then
        int actualAverage = student.getAverageExamScore();

        Assert.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void testToString() {
        //Given
        ArrayList<Double> exam = new ArrayList<>(Arrays.asList(150.0, 100.0, 50.0, 100.0));
        Student student = new Student("Sarah", "Messick", exam);
        //When
        String output = student.toString();
        //Then
        System.out.println(output);
    }
}