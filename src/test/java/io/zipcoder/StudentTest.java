package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class StudentTest {
    String firstName = "Frankie";
    String lastName = "Rodriguez";


    @Test
    public void getExamScoresTestPos(){

        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.getExamScores();
        Assert.assertTrue(actual.length() > 0);
    }

    @Test
    public void getExamScoresTestNeg(){

        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.getExamScores();
        Assert.assertFalse(actual.equals(""));
    }

    @Test
    public void addExamScoreTestPos(){
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.addExamScore(examScores);
        Assert.assertTrue(actual.length() > 0);
    }

    @Test
    public void addExamScoreTestNeg(){
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.addExamScore(examScores);
        Assert.assertFalse(actual.length() == 0);
    }

    @Test
    public void setExamScoreTestPos(){
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.setExamScore(1, 150.0);
        Assert.assertTrue(!actual.equals(examScores));
    }

    @Test
    public void setExamScoreTestNeg(){
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.setExamScore(1, 150.0);
        Assert.assertFalse(actual.equals(examScores));
    }

    @Test
    public void getAverageExamScoreTestPos(){
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.getAverageExamScore();
        Assert.assertTrue(actual.length() > 0);
    }

    @Test
    public void getAverageExamScoreTestNeg(){
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.getAverageExamScore();
        Assert.assertFalse(actual.length() == 0);
    }

    @Test
    public void toStringTestPos(){
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.toString();
        Assert.assertTrue(actual.length() > 0);
    }

    @Test
    public void toStringTestNeg(){
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.toString();
        Assert.assertFalse(actual.length() == 0);
    }
}