package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void testGetStudents(){
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] cohort = {s1,s2};
        Classroom testClass = new Classroom(cohort);

        ArrayList<Student> expected = new ArrayList<>(Arrays.asList(cohort));
        ArrayList<Student> actual = testClass.getStudents();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetNotStudents(){
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] cohort = {s1,s2};
        Classroom testClass = new Classroom(cohort);

        Student[] unexpected = {s1,s2};
        ArrayList<Student> actual = testClass.getStudents();

        Assert.assertNotEquals(unexpected,actual);
    }

    @Test
    public void testGetAverageExamScore(){
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] cohort = {s1,s2};
        Classroom testClass = new Classroom(cohort);

        Double expected = 125.0;
        Double actual = testClass.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNotAverageExamScore(){
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 26.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] cohort = {s1,s2};
        Classroom testClass = new Classroom(cohort);

        Double unexpected = 125.0;
        Double actual = testClass.getAverageExamScore();

        Assert.assertNotEquals(unexpected, actual);
    }
}
