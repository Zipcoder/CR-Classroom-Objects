package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentTest {

    @Test
    public void TestStudentConstructor(){

        Student someStudent = new Student("Bilbo", "Baggins", null);

        String expectedName = "Bilbo";
        String expectedLastName = "Baggins";

        String actualName = someStudent.getFirstName();
        String actualLastName = someStudent.getLastName();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedLastName,actualLastName);
    }
    @Test
    public void TestStudentName(){
        Student someStudent = new Student (null,null,null);

        someStudent.setFirstName("Bilbo");
        someStudent.setLastName("Baggins");

        String expectedName = "Bilbo";
        String expectedLastName = "Baggins";

        String actualName = someStudent.getFirstName();
        String actualLastName = someStudent.getLastName();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedLastName,actualLastName);
    }
    @Test
    public void TestGetExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        List<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(1.3);
        String output = student.getExamScores();

        System.out.println(output);
    }

    @Test
    public void setExamScores() {
        String firstName = "Leon";
        String lastName = "Hunter";
        List<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(1.3);
        student.addExamScore(99.);
        String output = student.getExamScores();

        System.out.println(output);
    }

    @Test
    public void testToString() {
        String firstName = "Leon";
        String lastName = "Hunter";
        List<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(1.3);
        student.addExamScore(99.);

        System.out.println(student.toString());
    }
}