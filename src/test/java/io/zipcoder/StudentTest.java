package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getFirstName() {
        Student student = new Student("Wes", "",new Double[2]);
        String actual = student.getFirstName();
        String expected = "Wes";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstName() {
        Student student = new Student("Wes", "", new Double[2]);
        student.setFirstName("Mike");
        String actual = student.getFirstName();
        String expected = "Mike";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastName() {
        Student student = new Student("", "Jones",new Double[2]);
        String actual = student.getLastName();
        String expected = "Jones";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastName() {
        Student student = new Student("", "Wes",new Double[2]);
        student.setLastName("Jones");
        String actual = student.getLastName();
        String expected = "Jones";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfExamsTaken() {
        Student student = new Student("","", new Double[4]);
        Integer actual = student.getNumberOfExamsTaken();
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScores() {
        Double[] examScores = { };
        Student student = new Student("","", examScores);
        student.addExamScore(96.5);
        student.addExamScore(45.44);
        String actual = student.getExamScores();
        String expected = "Exam Scores:\n" +
                "\tExam 1 -> 96.50\n" +
                "\tExam 2 -> 45.44\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScore() {
        Double[] examScores = { };
        Student student = new Student("","", examScores);
        student.addExamScore(96.5);
        student.addExamScore(45.44);
        Integer actual = student.getNumberOfExamsTaken();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScore() {
        Double[] examScores = { };
        Student student = new Student("","", examScores);
        student.addExamScore(96.5);
        student.setExamScore(0,100.0);
        String actual = student.getExamScores();
        String expected = "Exam Scores:\n" +
                "\tExam 1 -> 100.00\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScore() {
        Double[] examScores = { 23.33, 45.23, 67.44, 100.00 };
        Student student = new Student("","", examScores);
        Double actual = student.getAverageExamScore();
        Double expected = 59.00;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        Double[] examScores = { 23.33, 45.23, 67.44, 100.00 };
        Student student = new Student("Wes","Jones", examScores);
        String actual = student.toString();
        String expected = "Student Name: Wes Jones\n" +
                "> Average Exam Score: 59.00\n" +
                "> Exam Scores:\n" +
                "\tExam 1 -> 23.33\n" +
                "\tExam 2 -> 45.23\n" +
                "\tExam 3 -> 67.44\n" +
                "\tExam 4 -> 100.00\n";
        Assert.assertEquals(expected, actual);
    }
}