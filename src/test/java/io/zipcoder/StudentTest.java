package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    String firstName = "Frankie";
    String lastName = "Rodriguez";
    Double[] examScores = {100.0, 95.0, 123.0, 96.0};
    Student student = new Student(firstName, lastName, examScores);


    @Test
    public void getExamScoresTest1() {
        String actual = student.getExamScores();
        String expected = "Exam 1 ->  100.0\n" +
                "Exam 2 ->  95.0\n" +
                "Exam 3 ->  123.0\n" +
                "Exam 4 ->  96.0\n";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getExamScoresTest2() {
        String actual = student.getExamScores();
        Assert.assertFalse(actual.equals(""));
    }

    @Test
    public void addExamScoreTest1() {
        Double[] examScores = {100.0};
        student.addExamScore(examScores);
        String actual = student.getExamScores();
        String expected = "Exam 1 ->  100.0\n" +
                "Exam 2 ->  95.0\n" +
                "Exam 3 ->  123.0\n" +
                "Exam 4 ->  96.0\n" +
                "Exam 5 ->  100.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest2() {
        Double[] examScores = {100.0, 84.94, 43.0};
        student.addExamScore(examScores);
        String actual = student.getExamScores();
        String expected = "Exam 1 ->  100.0\n" +
                "Exam 2 ->  95.0\n" +
                "Exam 3 ->  123.0\n" +
                "Exam 4 ->  96.0\n" +
                "Exam 5 ->  100.0\n" +
                "Exam 6 ->  84.94\n" +
                "Exam 7 ->  43.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest1() {
        student.setExamScore(1, 150.0);
        String actual = student.getExamScores();
        String expected = "Exam 1 ->  150.0\n" +
                "Exam 2 ->  95.0\n" +
                "Exam 3 ->  123.0\n" +
                "Exam 4 ->  96.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest2() {
        Student student = new Student(firstName, lastName, examScores);
        student.setExamScore(1, 192.0);
        String actual = student.getExamScores();
        String expected = "Exam 1 ->  192.0\n" +
                "Exam 2 ->  95.0\n" +
                "Exam 3 ->  123.0\n" +
                "Exam 4 ->  96.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest1() {
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.getAverageExamScore();
        String expected = "125.0";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest2() {
        String actual = student.getAverageExamScore();
        String expected = "103.5";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest1() {
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);
        String actual = student.toString();
        String expected = "Student Name: Frankie Rodriguez\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  100.0\n" +
                "Exam 2 ->  150.0\n" +
                "Exam 3 ->  250.0\n" +
                "Exam 4 ->  0.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest2() {
        String actual = student.toString();
        String expected = "Student Name: Frankie Rodriguez\n" +
                "> Average Score: 103.5\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  100.0\n" +
                "Exam 2 ->  95.0\n" +
                "Exam 3 ->  123.0\n" +
                "Exam 4 ->  96.0\n";
        Assert.assertEquals(expected, actual);
    }
}