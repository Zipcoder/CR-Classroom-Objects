package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void setFirstNameTest() {
        // Given
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        // When
        joeFen.setFirstName(firstName);
        String actual = joeFen.getFirstName();

        // Then
        Assert.assertEquals(firstName, actual);
    }

    @Test
    public void setLastNameTest() {
        // Given
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
        // Given
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        // When
        String actual = joeFen.getExamScores();

        System.out.println(actual);
    }
    @Test
    public void getNumberOfExamsTakenTest() {
        // Given
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        // When
        int actual = joeFen.getNumberofExamsTaken();

        System.out.println(actual);
    }

    @Test
    public void addExamScoreTest() {
        // Given
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {};
        Student joeFen = new Student(firstName, lastName, examScores);

        // When
        joeFen.addExamScore(100.0);
        String actual = joeFen.getExamScores();
        // Then
        System.out.println(actual);
    }

    @Test
    public void setExamScoreTest() {
        // Given
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        // When
        joeFen.setExamScore(1, 100.0);
        String actual = joeFen.getExamScores();
        // Then
        System.out.println(actual);
    }

    @Test
    public void getAverageExamScoreTest() {
        // Given
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student joeFen = new Student(firstName, lastName, examScores);

        // When
        double actual = joeFen.getAverageExamScore();
        // Then
        System.out.println(actual);
    }

    @Test
    public void toStringTest() {
        // Given
        String firstName = "Joe";
        String lastName = "Fen";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student joeFen = new Student(firstName, lastName, examScores);

        // When
        String actual = joeFen.toString(); 
        // Then
        System.out.println(actual);
    }
}
