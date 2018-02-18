package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getAverageExamScoreTest(){
        // Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students ={s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        double actualAverageExamScore = classroom.getAverageExamScore();
        double expectedAverageExamScore = 125.00;

        // Then
        System.out.println(classroom.getAverageExamScore());
        Assert.assertEquals(actualAverageExamScore, expectedAverageExamScore, 0.1);


    }
    @Test
    public void addStudentTest() {
        // : Given
        int maxNumberofStudents=1;
        Double[] examScores = {100.0, 150.0, 250.0};
        Student student = new Student("Tom", "Fantana", examScores);
        Student[] students=new Student[maxNumberofStudents];
        Classroom classroom=new Classroom(students);

        // When
        classroom.addStudent(student);
        String expectedAddedStudent = "[Student Name: Tom Fantana\n> Average Score: 166.67\n> Exam Scores:\nExam 1 -> 100.0\nExam 2 -> 150.0\nExam 3 -> 250.0]";

        String actualAddedStudent = Arrays.toString(classroom.getStudents());

        // Then
        Assert.assertEquals(expectedAddedStudent, actualAddedStudent);
    }

    @Test
    public void removeStudentTest(){
        // : Given
        Double[] examScores1 = {100.0, 150.0, 250.0};
        Double[] examScores2 ={100.0, 50.0, 25.0};
        Student student1 = new Student("Tom", "Fantana", examScores1);
        Student student2 = new Student("Bob", "Smith", examScores2);
        Student[] students={student1, student2};
        Classroom classroom=new Classroom(students);

        // When
        classroom.removeStudent("Bob", "Smith");
        String expectedRemoveStudent = "[Student Name: Tom Fantana\n> Average Score: 166.67\n> Exam Scores:\nExam 1 -> 100.0\nExam 2 -> 150.0\nExam 3 -> 250.0, null]";
        String actualRemoveStudent = Arrays.toString(classroom.getStudents());

        // Then
        //System.out.println(classroom.getStudent(0));
        Assert.assertEquals(expectedRemoveStudent, actualRemoveStudent);

    }
}
