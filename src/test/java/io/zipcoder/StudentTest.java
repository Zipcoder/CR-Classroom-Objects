package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
//        Student someStudent = new Student (null,null,null);
//
//        Double score = 10.6;
//        someStudent.addExamScore(20.);
//        someStudent.setExamScores(0,score);
//
//        Double expected = 10.6;
//        Double actual = someStudent.getExamScores();
//
//
//    }


}