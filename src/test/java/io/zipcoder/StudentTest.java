package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;



public class StudentTest {

    @Test
    public void getExamScoresTest(){
        //Given
        String firstName = "Joe";
        String lastName = "Schmo";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        //When
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.getExamScores();
        //Then
        String expected = "Exam Scores:\n" + "Exam 1: 100.0\n"+ "Exam 2: 95.0\n" + "Exam 3: 123.0\n" + "Exam 4: 96.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest(){
        String firstName = "Joe";
        String lastName = "Schmo";
        Double[] examScores = { };

        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(100.0);

        String actual = student.getExamScores();
        String expected = "Exam Scores:\n" + "Exam 1: 100.0\n";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest(){
        String firstName = "Joe";
        String lastName = "Schmo";
        Double[] examScores = {100.0};

        Student student = new Student(firstName, lastName, examScores);
        student.setExamScore(0, 150.0);

        String actual = student.getExamScores();
        String expected = "Exam Scores:\n" + "Exam 1: 150.0\n";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAverageExamScoreTest(){

    }


}