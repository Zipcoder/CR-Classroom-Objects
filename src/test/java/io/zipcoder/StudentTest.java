package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        String expected ="Exam Scores:\n" +
                " \tExam 1 -> 100.0\n" +
                " \tExam 2 -> 95.0\n" +
                " \tExam 3 -> 123.0\n" +
                " \tExam 4 -> 96.0\n";
        // When
        String actual = student.getExamScores();

        // Then
        Assert.assertEquals(expected, actual);
    }

}