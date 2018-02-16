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
        Integer[] testScores = {100, 90, 75};
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
        Integer[] testScores = {100, 90, 75};
        jeff = new Student("jeff", "bridges", testScores);
        jeff.setTotalExams(5);
        Assert.assertEquals(5, jeff.getTotalExams());
    }


    @Test
    public void getTotalExamsTest(){
        Integer[] testScores = {100, 90, 75};
        jeff = new Student("jeff", "bridges", testScores);
        Assert.assertEquals(3, jeff.getTotalExams());
    }

    @Test
    public void printExamScoresTest(){
        Integer[] testScores = {100, 90, 75};
        jeff = new Student("jeff", "bridges", testScores);
        String expected = "Test Scores: \nTest 1 -> 100\nTest 2 -> 90\nTest 3 -> 75\n";
        Assert.assertEquals(expected, jeff.printExamScores());
    }

    @Test
    public void takeExamTest(){
        jeff = new Student("jeff", "bridges", 1);
        jeff.takeExam(100);
        String expected = "Test Scores: \nTest 1 -> 100\n";
        Assert.assertEquals(expected, jeff.printExamScores());
    }

}