package io.zipcoder;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class StudentTest {

    Student jeff;

    @Before
    public void setup(){


    }

    @Test
    public void constructorWithArrayTest(){
        Double[] testScores = {100.0, 90.0, 75.0};
        jeff = new Student("jeff", "bridges", testScores);
        Assert.assertEquals(jeff.getFirstName(), "jeff");
    }

    @Test
    public void constructorWithTotalExamsTest(){
        jeff = new Student("jeff", "bridges", 5);
        Assert.assertEquals(jeff.getTotalExams(), 5);
    }

    @Test
    public void constructorWithTwoArgumentsTest(){
        jeff = new Student("jeff", "bridges");
        Assert.assertEquals("jeff", jeff.getFirstName());
    }

    @Test
    public void setTotalExamsTest(){
        Double[] testScores = {100.0, 90.0, 75.0};
        jeff = new Student("jeff", "bridges", testScores);
        jeff.setTotalExams(5);
        Assert.assertEquals(5, jeff.getTotalExams());
    }


    @Test
    public void getTotalExamsTest(){
        Double[] testScores = {100.0, 90.0, 75.0};
        jeff = new Student("jeff", "bridges", testScores);
        Assert.assertEquals(3, jeff.getTotalExams());
    }

    @Test
    public void printExamScoresTest(){
        Double[] testScores = {100.0, 90.0, 75.0};
        jeff = new Student("jeff", "bridges", testScores);
        String expected = "Test Scores: \nTest 1 -> 100.0\nTest 2 -> 90.0\nTest 3 -> 75.0\n";
        Assert.assertEquals(expected, jeff.printExamScores());
    }

    @Test
    public void takeExamTest(){
        jeff = new Student("jeff", "bridges", 1);
        jeff.takeExam(100.0);
        String expected = "Test Scores: \nTest 1 -> 100.0\n";
        Assert.assertEquals(expected, jeff.printExamScores());
    }

    @Test
    public void changeScoreTest(){
        Double[] testScores = {100.0, 90.0, 75.0};
        jeff = new Student("jeff", "bridges", testScores);
        jeff.changeScoreForExam(1, 50.0);
        String expected = "Test Scores: \nTest 1 -> 50.0\nTest 2 -> 90.0\nTest 3 -> 75.0\n";
        Assert.assertEquals(expected, jeff.printExamScores());
    }

    @Test
    public void getAverageTest(){
        Double[] testScores = {100.0, 90.0, 75.0};
        jeff = new Student("jeff", "bridges", testScores);
        Double expected = 88.33;
        Assert.assertEquals(expected, jeff.getAverage(), 0);
    }

}