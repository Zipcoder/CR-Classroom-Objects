package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testGetFirstName(){
        Student s = new Student("Bob", "Bobert", null);
        String expected = "Bob";
        String actual = s.getFirstName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetFirstName(){
        Student s = new Student(null, null, null);
        s.setFirstName("Bob");
        Assert.assertTrue(s.setFirstName("Bob"), s.getFirstName());
    }
    @Test
    public void testGetLastName(){
        Student s = new Student("Bob", "Bobert", null);
        String expected = "Bobert";
        String actual = s.getLastName();
        Assert.assertEquals(expected, actual);
    }



}