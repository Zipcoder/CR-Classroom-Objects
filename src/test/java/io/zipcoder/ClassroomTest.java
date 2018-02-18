package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getAverageExamScoreTest() {
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student studentOne = new Student("student", "one", s1Scores);
        Student studentTwo = new Student("student", "two", s2Scores);

        Student[] students = {studentOne, studentTwo};
        Classroom classroom = new Classroom(students);

        double actual = classroom.getAverageExamScore();
        double expected = 125.0;
    }

    @Test
    public void addStudentTest() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] studentOneScores = {125.0, 75.0, 95.0};
        Student studentOne = new Student("Aurna", "Drayke", studentOneScores);

        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(studentOne);
        Student[] postEnrollment = classroom.getStudents();

        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        
    }
}
