package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ClassroomTest {

    @Test
    public void testClassroonGetAverageExamScore(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void testClassroomAddStudent(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);

        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void testClassroomRemoveStudent() {
        // : Given
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);

        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);

        Double[] examScores2 = {100.0, 150.0, 250.0, 0.0};
        Student student2 = new Student("Lilian", "Smith", examScores2);

        classroom.addStudent(student);
        classroom.addStudent(student2);

        // When
        Student[] preRemovingStudent = classroom.getStudents();
        String preRemovingAsString = Arrays.toString(preRemovingStudent);
        System.out.println("===========================");
        System.out.println(preRemovingAsString);

        classroom.removeStudent("Leon", "Hunter");

        Student[] afterRemoving = classroom.getStudents();
        String afterRemovigAsString = Arrays.toString(afterRemoving);
        System.out.println("===========================");
        System.out.println(afterRemovigAsString);
    }

    @Test
    public void testClassroomGetStudentByScore(){
        int maxNumberOfStudents = 4;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScoresS1 = {92.0, 150.0, 250.0, 50.0};
        Double[] examScoresS2 = {250.0, 100.0, 100.0, 100.0};
        Double[] examScoresS3 = {92.0, 150.0, 250.0, 50.00};
        Double[] examScoresS4 = {90.0, 120.0, 99.0, 10.0};
        // When
        Student testS1 = new Student("Leon", "Hunter", examScoresS1);
        Student testS2 = new Student("Joe", "Smith", examScoresS2);
        Student testS3 = new Student("Mike", "Jones", examScoresS3);
        Student testS4 = new Student("Bob", "Johnson", examScoresS4);

        classroom.addStudent(testS1);
        classroom.addStudent(testS2);
        classroom.addStudent(testS3);
        classroom.addStudent(testS4);
        Student[] actual = classroom.getStudentByScore(150.0);
        // Then
        Student [] expected = new Student[]{testS1, testS3};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getGradeBook() {
        //Given

        Double[] examScores1 = {99.0, 50.0, 82.0};
        Double[] examScores2 = {100.0, 100.0, 50.0};
        Double[] examScores3 = {92.0, 80.0, 73.0};
        Double[] examScores4 = {100.0, 84.0, 62.0};
        Double[] examScores5 = {60.0, 50.0, 40.0};

        Student student1 = new Student ("Leon", "Hunter", examScores1);
        Student student2 = new Student ("Joe", "Smith", examScores2);
        Student student3 = new Student ("Mike", "Jones", examScores3);
        Student student4 = new Student ("John", "Brown", examScores4);
        Student student5 = new Student ("Tim", "Johnson", examScores5);

        Student[] students = new Student[5];
        Classroom classroom = new Classroom(students);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.addStudent(student4);
        classroom.addStudent(student5);

        //When
        TreeMap<Character, ArrayList<Student>> output = classroom.getGradeBook();
        //Then
        System.out.println(output);
    }


}