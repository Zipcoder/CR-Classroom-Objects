package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClassroomTestTest {

//    Classroom testClass;
//    Student student;

   @Before





    @Test

   public void maxStudentsConstructorTest() {
       int maxNumberOfStudents = 20;
       Classroom testClassroom = new Classroom(maxNumberOfStudents);
       int expected = 20;
       int actual = testClassroom.students.length;

       Assert.assertEquals(expected, actual);

   }
   @Test

   public void studentsArrayConstructorTest () {
       Double[] testScores = {98.0, 54.0, 100.0};
       Student student1 = new Student("Clark", "Griswald", testScores);

       Student[] testStudents = {student1};
       Classroom testClassroom = new Classroom(testStudents);

       int expected = 1;
       int actual = testClassroom.students.length;

       Assert.assertEquals(expected, actual);

   }

    @Test

    public void clasroomDefaultConstructorTest() {

        Classroom testClassroom = new Classroom();
        int expected = 30;
        int actual = testClassroom.students.length;

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void getStudentTest() {
        Double[] testScores = {98.0, 54.0, 40.0};
        Student student1 = new Student("Clark", "Griswald", testScores);

        Student[] testStudents = {student1};
        Classroom testClassroom = new Classroom(testStudents);

        Student[] expected = testStudents;
        Student[] actual = testClassroom.getStudents();

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void getAverageExamScoreTest() {
        Double[] testScores = {98.0, 54.0, 40.0};
        Student student1 = new Student("Clark", "Griswald", testScores);
        Double[] testScores1 = {93.0, 74.0, 90.0};
        Student student2 = new Student("Rusty", "Nails", testScores1);

        Student[] testStudents = {student1, student2};
        Classroom testClassroom = new Classroom(testStudents);

        Double expected = 75.0;
        Double actual = testClassroom.getAverageExamScores();
        Assert.assertEquals(expected, actual,.1);
   }


//    @Test
//
//    public void getStudentTest() {
//        Double[] testScores = {98.0, 54.0, 40.0};
//        Student student1 = new Student("Clark", "Griswald", testScores);
//
//        Student[] testStudents = {student1};
//        Classroom testClassroom = new Classroom(testStudents);
//
//        String expected = "[Student Name: Clark Griswald\n> Average Score: 84.0\n> Exam Scores:\n\tExam 1 -> 98.0\n\tExam 2 -> 54.0\n\tExam 3 -> 100.0]";
//        String actual = testClassroom.getStudents();
//
//        Assert.assertEquals(expected, actual);
//
//    }




}