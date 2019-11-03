package io.zipcoder;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {









    @Test
    public void getAverageExamScore() {
        int maxNumOfStudents = 2;
        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        Double expected = 125.0;

        // When
        Double output = classroom.getAverageExamScore();

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void addStudentTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student s1 = new Student("Leon", "Hunter", examScores);

        String expected = " ===========================\n" +
                " []\n" +
                " ===========================\n" +
                " [Student Name: Leon Hunter\n" +
                " > Average Score: 125\n" +
                " > Exam Scores:\n" +
                "     Exam 1 -> 100\n" +
                "     Exam 2 -> 150\n" +
                "     Exam 3 -> 250\n" +
                "     Exam 4 -> 0";

        // When
        ArrayList<Student> preEnrollment = classroom.getStudents();
        classroom.addStudent(s1);
        ArrayList<Student> postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = preEnrollment.toString();
        String postEnrollmentAsString = postEnrollment.toString();

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }










}
