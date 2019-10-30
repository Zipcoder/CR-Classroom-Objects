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


//    @Test
//    public void SetExamScore(){
//        String firstName = "Bilbo";
//        String lastName = "Baggins";
//        Double[] testScores= { 100.0, 95.0, 123.0, 96.0};
//        List<Double> examScores = new ArrayList<>();
//        Student someStudent = new Student(firstName, lastName, testScores);
//
//        examScores = Arrays.asList(examScores);
//        System.out.println();
//
//    //        Assert.assertEquals(expected, actual);
//    }

//    @Test
//    public void TestGetExamScores(){
//        Student someStudent = new Student("Bilbo","Baggins",null);
////        someStudent.examScores.add(0.0);
////        System.out.println(someStudent.examScores.size());
//        someStudent.addExamScore(0.);
//        someStudent.addExamScore(1.0);
//        someStudent.addExamScore(500.);
//        System.out.println(someStudent.egetExamScores());
//    }

    @Test
    public void TestAddExamScore(){
        Student someStudent = new Student("Bilbo", "Baggins",null);
        someStudent.addExamScore(13.);
        someStudent.setExamScores(1,13.);
        Double expected = 13.;

        System.out.println(someStudent.getExamScores());
//        Assert.assertEquals(expected, actual);
    }
}