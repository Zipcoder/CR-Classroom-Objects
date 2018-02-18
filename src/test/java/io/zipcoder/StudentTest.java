package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void setFirstNameTest() {
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        joeFen.setFirstName(firstName);
        String actual = joeFen.getFirstName();

        Assert.assertEquals(firstName, actual);
    }

    @Test
    public void setLastNameTest() {
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        joeFen.setLastName(lastName);
        String actual = joeFen.getLastName();

        Assert.assertEquals(lastName, actual);
    }

    @Test
    public void getExamScoresTest() {
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        String actual = joeFen.getExamScores();
        String expected = "Exam Scores: \n\t   Exam 1 -> 100\n\t   Exam 2 -> 95\n\t   Exam 3 -> 123\n\t   Exam 4 -> 96\n";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNumberOfExamsTakenTest() {
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        int expectedExams = 4;
        Student joeFen = new Student(firstName, lastName, examScores);

        int actual = joeFen.getNumberofExamsTaken();

        Assert.assertEquals(expectedExams, actual);
    }

    @Test
    public void addExamScoreTest() {
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {50.0, 140.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        joeFen.addExamScore(100.0);
        String actual = joeFen.getExamScores();
        String expected = "Exam Scores: \n\t   Exam 1 -> 50\n\t   Exam 2 -> 140\n\t   Exam 3 -> 100\n";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest() {
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {150.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        joeFen.setExamScore(1, 150.0);
        String actual = joeFen.getExamScores();

        String expected = "Exam Scores: \n\t   Exam 1 -> 150\n";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest() {
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        Double actual = joeFen.getAverageExamScore();
        Double expected = 125.0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student joeFen = new Student(firstName, lastName, examScores);

        String actual = joeFen.toString();
        String expected = "Student Name: Joe Fen\n> Average Score: 125.0\n> Exam Scores: \n\t   Exam 1 -> 100\n\t   Exam 2 -> 150\n\t   Exam 3 -> 250\n\t   Exam 4 -> 0\n";

        Assert.assertEquals(expected, actual);
    }
}
