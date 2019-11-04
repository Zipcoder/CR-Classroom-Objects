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

    @Test
    public void testGetNotLastName() {
        String first = "Leon";
        String last = "Hynter";
        Double[] scores = { 100.0, 95.0, 123.0, 96.0 };

        Student leonHunter = new Student(first, last, scores);

        String actual = leonHunter.getLastName();
        Assert.assertNotEquals("last", actual);

    }

    @Test
    public void testGetLastName() {
        String first = "Leon";
        String last = "Hunter";
        Double[] scores = { 100.0, 95.0, 123.0, 96.0 };

        Student leonHunter = new Student(first, last, scores);

        String actual = leonHunter.getLastName();
        //System.out.println(actual);
        Assert.assertEquals("Hunter", actual);

    }

    @Test
    public void testSetNotLastName() {
        String first = "Leon";
        String last = "Hynter";
        Double[] scores = {100.0, 95.0, 123.0, 96.0};

        Student leonHunter = new Student(first, last, scores);
        leonHunter.setLastName("Hunter");

        String actual = leonHunter.firstName;
        Assert.assertNotEquals("Hynter", actual);

    }

    @Test
    public void testSetLastName() {
        String first = "Lyon";
        String last = "Hynter";
        Double[] scores = { 100.0, 95.0, 123.0, 96.0 };

        Student leonHunter = new Student(first, last, scores);
        leonHunter.setFirstName("Hunter");

        String actual = leonHunter.firstName;
        //System.out.println(actual);
        Assert.assertEquals("Hunter", actual);

    }

}