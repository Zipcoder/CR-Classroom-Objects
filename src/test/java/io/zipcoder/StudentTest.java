package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getFirstNameTest(){
        ArrayList<Double> exams = new ArrayList<>();
        Student testStudent = new Student("Amy", "gill", exams);

        String expected = "Amy";
        String actual = testStudent.getFirstName();
        Assert.assertEquals(expected, actual);

    }




}