package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ClassroomTest {

//    @Test
//    public void TestGetAverageExamScore() {
//        // : Given
//        List<Double> s1Scores = new ArrayList<>();
//        List<Double> s2Scores = new ArrayList<>();
//
//
//        Student s1 = new Student("student", "one", s1Scores);
//        s1Scores.add(100.);
//        s1Scores.add(150.);
//        s1.addExamScore(100.);
////        { 100.0, 150.0 };
//        Student s2 = new Student("student", "two", s2Scores);
//        s2Scores.add(225.);
//        s2Scores.add(25.);
////        { 225.0, 25.0 };
//
//
//        Student[] students = new Student[2];
//        students[0] = s1;
//        students[1] = s2;
//        Classroom classroom = new Classroom(students);
//
//        // When
//        double output = classroom.getAverageExamScore();
//
//        // Then
//        System.out.println(output);
//    }
    @Test
        public void TestClassroom() {
        Classroom classroom = new Classroom(20);
        Integer expected = 20;
        Integer actual = classroom.students.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
        public void TestGetAverageExamScore() {
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one",s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

}
