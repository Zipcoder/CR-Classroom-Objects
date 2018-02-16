package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;



public class StudentTest {
    Student student;

    @Before

    public void setStudent() {
        Double[] testScores = {89.5, 100.0, 93.5};
         student = new Student("Luke", "Williams", testScores);
    }



    @Test
    public void firstNameTest() {
        // Given
        //Student student = new Student();
        String expected = "Luke";

        // When
        student.setFirstName(expected);
        String actual = student.getFirstName();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void lastNameTest() {
        // Given
        //Student student = new Student();
        String expected = "Williams";

        // When
        student.setLastName(expected);
        String actual = student.getLastName();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTestScoreTest() {
        // Given
        //Student student = new Student();
        double expected = 0;

        // When
        //student.addExamScore(expected);
        double actual = student.getTestScore();

        // Then
        Assert.assertEquals(expected, actual, .1);

}

@Test
    public void getNumberOfExamsTakenTest() {
    // Given
    //Student student = new Student();
    int expected = 3;

    // When
    //student.addExamScore(expected);
    int actual = student.getNumberOfExamsTaken();

    // Then
    Assert.assertEquals(expected, actual);


}

    @Test
    public void getExamScoresTest() {
        // Given
        //Student student = new Student();
        String expected = "Exam Scores:\n\tExam 1 -> 89.5\n\tExam 2 -> 100.0\n\tExam 3 -> 93.5";

        // When
        //student.addExamScore(expected);
        String actual = student.getExamScores();

        // Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void addExamScoreTest() {
        // Given
        //Student student = new Student();
        double expected = 0;

        // When
        //student.addExamScore(expected);
        double actual = student.addExamScore(0.0);

        // Then
        Assert.assertEquals(expected, actual, .1);


    }

//    @Test
//    public void setExamScore() {
//        // Given
//        //Student student = new Student();
//        int expected = 1;
//        Double next = 97.3;
//
//        // When
//        //student.addExamScore(expected);
//        actual = student.setExamScore(1, 97.3);
//
//        // Then
//        Assert.assertEquals(expected, actual);
//
//
//    }

}
