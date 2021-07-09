package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getFirstNameTest(){
        //given
        String givenFirstName = "Sean";
        String givenLastName = "John";
        Double[] examScores = {82.0, 81.0, 68.5};
        Student student = new Student(givenFirstName, givenLastName, examScores);

        //when
        String actualFirstName = student.getFirstName();

        //then
        Assert.assertEquals(givenFirstName, actualFirstName);
    }

    @Test
    public void setFirstNameTest(){
        //given
        String givenFirstName = "Sean";
        String givenLastName = "John";
        Double[] examScores = {82.0, 81.0, 68.5};
        Student student = new Student(givenFirstName, givenLastName, examScores);
        String expected = "Jamie";

        //when
        student.setFirstName(expected);
        String actualFirstName = student.getFirstName();

        //then
        Assert.assertEquals(expected, actualFirstName);
    }
    @Test
    public void getLastNameTest(){
        //given
        String givenFirstName = "Sean";
        String givenLastName = "John";
        Double[] examScores = {82.0, 81.0, 68.5};
        Student student = new Student(givenFirstName, givenLastName, examScores);

        //when
        String actualLastName = student.getLastName();

        //then
        Assert.assertEquals(givenLastName, actualLastName);
    }

    @Test
    public void setLastNameTest(){
        //given
        String givenFirstName = "Sean";
        String givenLastName = "John";
        Double[] examScores = {82.0, 81.0, 68.5};
        Student student = new Student(givenFirstName, givenLastName, examScores);
        String expected = "Lewis";

        //when
        student.setLastName(expected);
        String actualLastName = student.getLastName();

        //then
        Assert.assertEquals(expected, actualLastName);
    }

}