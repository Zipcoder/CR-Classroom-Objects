package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testGetFirstName() {
        String first = "Lyon";
        String last = "Hunter";
        Double[] scores = { 100.0, 95.0, 123.0, 96.0 };

        Student leonHunter = new Student(first, last, scores);

        String actual = leonHunter.getFirstName();
        System.out.println(actual);
        Assert.assertEquals("Lyon", actual);

    }

}