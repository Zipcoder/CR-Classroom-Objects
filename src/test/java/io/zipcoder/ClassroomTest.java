package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void ClassroomMaxStudentsTest() {

        int maxNumberOfStudents = 25;
        Classroom testClassroom = new Classroom(maxNumberOfStudents);

        int expected = 25;
        int actual = testClassroom.getStudents().length;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void ClassroomStudentsArrayTest() {
        Double[] testScores1 = {88.0, 75.0, 91.0};
        Double[] testScores2 = {55.0, 77.0, 82.0};
        Student student1 = new Student("Bobby", "Rickit", testScores1);
        Student student2 = new Student("Sarah", "Jones", testScores2);

        Student[] testStudents = {student1, student2};
        Classroom testClassroom = new Classroom(testStudents);

        int expected = 2;
        int actual = testClassroom.getStudents().length;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ClassroomNullaryTest() {
        Classroom testClassroom = new Classroom();

        int expected = 30;
        int actual = testClassroom.getStudents().length;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsTest() {
        Double[] testScores1 = {88.0, 75.0, 91.0};
        Student student1 = new Student("Bobby", "Rickit", testScores1);

        Student[] testStudents = {student1};
        Classroom testClassroom = new Classroom(testStudents);


        Student[] expected = testStudents;
        Student[] actual = testClassroom.getStudents();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest() {
        Double[] s1Scores = {100.0, 90.00};
        Double[] s2Scores = {97.00, 88.00};

        Student s1 = new Student("Ben", "Jeeves", s1Scores);
        Student s2 = new Student("Billy", "Blanks", s2Scores);

        Student[] students = {s1, s2};
        Classroom testClassroom = new Classroom(students);

        double expected = 94.0;
        double actual = testClassroom.getAverageExamScores();

        Assert.assertEquals(expected, actual, .01);

    }

    @Test
    public void addStudentTest() {

        //Given
        int maxNumberofStudents = 1;
        Classroom testClassroom = new Classroom(maxNumberofStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student1 = new Student("Charles", "Bean", examScores);

        //When
        testClassroom.addStudent(student1);

        //Then
        String expected = "[Student Name: Charles Bean\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores:\n" +
                "\t\tExam 1 -> 100.0\n" +
                "\t\tExam 2 -> 150.0\n" +
                "\t\tExam 3 -> 250.0\n" +
                "\t\tExam 4 -> 0.0\n" +
                "]";
        String actual = Arrays.toString(testClassroom.getStudents());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStudentTest(){
        //Given
        int maxNumberofStudents = 3;
        Classroom testClassroom = new Classroom(maxNumberofStudents);
        Double[] examScores1 = {100.0, 150.0, 250.0};
        Double[] examScores2 = {100.0, 150.0, 250.0};
        Double[] examScores3 = {100.0, 150.0, 250.0};
        Student student1 = new Student("Charles", "Bean", examScores1);
        Student student2 = new Student("Vince", "Price", examScores2);
        Student student3 = new Student("Kidman", "Stevens", examScores3);

        testClassroom.addStudent(student1);
        testClassroom.addStudent(student2);
        testClassroom.addStudent(student3);
        testClassroom.removeStudent("Charles", "Bean");
        testClassroom.sortArrayIfNull();

        String expected = "[Student Name: Vince Price\n" +
                "> Average Score: 167.0\n" +
                "> Exam Scores:\n" +
                "\t\tExam 1 -> 100.0\n" +
                "\t\tExam 2 -> 150.0\n" +
                "\t\tExam 3 -> 250.0\n" +
                ", Student Name: Kidman Stevens\n" +
                "> Average Score: 167.0\n" +
                "> Exam Scores:\n" +
                "\t\tExam 1 -> 100.0\n" +
                "\t\tExam 2 -> 150.0\n" +
                "\t\tExam 3 -> 250.0\n" +
                ", null]";
        String actual = Arrays.toString(testClassroom.getStudents());

        Assert.assertEquals(expected, actual);
        }
    }

