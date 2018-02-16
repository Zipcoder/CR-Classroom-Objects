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
        Assert.assertEquals(jeff.getTotalExams(), 0);
    }

    @Test
    public void constructorWithTwoArgumentsTest(){
        jeff = new Student("jeff", "bridges");
        Assert.assertEquals("jeff", jeff.getFirstName());
    }

}