package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getStudents() {
        // : Given
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100.0, 150.0 ));
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList( 225.0, 25.0 ));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        Student[] output = classroom.getStudents();

        // Then
        System.out.println(output);
    }

    @Test
    public void getAverageExamScoreTest() {
        // : Given
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100.0, 150.0));
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(225.0, 25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);
        Double expected = 125.0;

        // When
        Double actual = classroom.getAverageExamScore();

        // Then
        Assert.assertEquals(expected, actual);
        System.out.print(actual);
    }

    @Test
    public void addStudentTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double>  s2Scores = new ArrayList<Double>(Arrays.asList(100.0, 150.0, 225.0, 25.0));
        Student s2 = new Student("Leon", "Hunter", s2Scores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(s2);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }
}
