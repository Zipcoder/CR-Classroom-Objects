package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testGetNotFirstName() {
        String first = "Lyon";
        String last = "Hunter";
        Double[] scores = { 100.0, 95.0, 123.0, 96.0 };

        Student leonHunter = new Student(first, last, scores);

        String actual = leonHunter.getFirstName();
        Assert.assertNotEquals("first", actual);

    }

    @Test
    public void testGetFirstName() {
        String first = "Lyon";
        String last = "Hunter";
        Double[] scores = { 100.0, 95.0, 123.0, 96.0 };

        Student leonHunter = new Student(first, last, scores);

        String actual = leonHunter.getFirstName();
        //System.out.println(actual);
        Assert.assertEquals("Lyon", actual);

    }

    @Test
    public void testSetNotFirstName() {
        String first = "Lyon";
        String last = "Hunter";
        Double[] scores = {100.0, 95.0, 123.0, 96.0};

        Student leonHunter = new Student(first, last, scores);
        leonHunter.setFirstName("Leon");

        String actual = leonHunter.firstName;
        Assert.assertNotEquals("Lyon", actual);

    }

    @Test
    public void testSetFirstName() {
        String first = "Lyon";
        String last = "Hunter";
        Double[] scores = { 100.0, 95.0, 123.0, 96.0 };

        Student leonHunter = new Student(first, last, scores);
        leonHunter.setFirstName("Leon");

        String actual = leonHunter.firstName;
        //System.out.println(actual);
        Assert.assertEquals("Leon", actual);

    }

}