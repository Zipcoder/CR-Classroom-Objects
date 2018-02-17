package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class StudentTest {

    @Test
    public void setFirstNameTest() {

    Double[] examScores = {95.0, 92.0, 75.0, 80.0};
    Student student = new Student("Brian", "He", examScores);
    String actual = student.getFirstName();
    String expected = "Brian";
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void setLastNameTest() {

    Double[] examScores = {95.0, 92.0, 75.0, 80.0};
    Student student = new Student("Brian", "He", examScores);
    String actual = student.getLastName();
    String expected = "He";
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void getExamsTakenTest() {

    Double[] examScores = {95.0, 92.0, 75.0, 80.0};
    Student student = new Student("Brian", "He", examScores);
    int actual = student.getExamsTaken();
    int expected = 4;
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void getExamScoresTest() {

    Double[] examScores = {95.0, 92.0, 75.0, 80.0};
    Student student = new Student("Brian", "He", examScores);
    String actual = student.getExamScores();
    String expected = ("> Exam Scores:\n\t\tExam 1 -> 95\n\t\tExam 2 -> 92\n\t\tExam 3 -> 75\n\t\tExam 4 -> 80\n");
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void addExamScoreTest() {

    Double[] examScores = {};
    Student student = new Student("Brian", "He", examScores);
    student.addExamScore(100.0);
    String actual = student.getExamScores();
    String expected = "> Exam Scores:\n\t\tExam 1 -> 100\n";
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void setExamScore() {

    Double[] examScores = {95.0, 92.0};
    Student student = new Student("Brian", "He", examScores);
    student.setExamScore(1, 85.0);
    String actual = student.getExamScores();
    String expected = "> Exam Scores:\n\t\tExam 1 -> 95\n\t\tExam 2 -> 85\n";
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest() {

    Double[] examScores = {95.0, 92.0, 75.0, 80.0};
    Student student = new Student("Brian", "He", examScores);
    double actual = student.getAverageExamScore();
    double expected = 85.5;
    Assert.assertEquals(expected, actual, 0.001);

    }

    @Test
    public void overrideToStringTest() {

    Double[] examScores = {95.0, 92.0, 75.0, 80.0};
    Student student = new Student("Brian", "He", examScores);
    String expected = "Student Name: Brian He\n> Average Score: 85\n> Exam Scores:\n\t\tExam 1 -> 95\n\t\tExam 2 -> 92\n\t\tExam 3 -> 75\n\t\tExam 4 -> 80\n";
    String actual = student.toString();
    Assert.assertEquals(expected, actual);
    }
}



