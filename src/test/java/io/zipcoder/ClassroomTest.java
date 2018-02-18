package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ClassroomTest {
    Double[] s1Scores = {100.0, 150.0};
    Double[] s2Scores = {225.0, 25.0};
    Double[] s4Scores = {10.0, 153.0};
    Double[] s5Scores = {22.0, 256.0};

    Student s1 = new Student("Frankie", "Rodriguez", s1Scores);
    Student s2 = new Student("DT", "Walker", s2Scores);
    Student s4 = new Student("Zoe", "Hardy", s4Scores);
    Student s5 = new Student("Julie", "Rivera", s5Scores);

    Student[] students = {s1, s2, s4, s5};
    Classroom classroom = new Classroom(students);


    @Test
    public void getStudentsTest() {
        String actual = "";
        for (Student entry : classroom.getStudents()) {
            actual += entry.toString();
        }
        String expected = "Student Name: Frankie Rodriguez\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  100.0\n" +
                "Exam 2 ->  150.0\n" +
                "Student Name: DT Walker\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  225.0\n" +
                "Exam 2 ->  25.0\n" +
                "Student Name: Zoe Hardy\n" +
                "> Average Score: 81.5\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  10.0\n" +
                "Exam 2 ->  153.0\n" +
                "Student Name: Julie Rivera\n" +
                "> Average Score: 139.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  22.0\n" +
                "Exam 2 ->  256.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest1() {
        String actual = classroom.getAverageExamScore();
        String expected = "470.5";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest2() {
        String actual = classroom.getAverageExamScore();
        String expected = "0";
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void addStudentTest1() {
        Double[] s3Scores = {54.0, 9.0, 200.0};
        Student s3 = new Student("Steve", "Harvey", s3Scores);
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(s3);
        Student[] postEnrollment = classroom.getStudents();
        Assert.assertNotEquals(preEnrollment, postEnrollment);

    }

    @Test
    public void addStudentTest2() {
        Double[] s3Scores = {54.0, 9.0, 200.0};
        Student s3 = new Student("Steve", "Harvey", s3Scores);
        boolean result = classroom.addStudent(s3);
        Assert.assertTrue(result);

    }

    @Test
    public void removeStudentTest1() {
        Student[] preEnrollment = classroom.getStudents();
        classroom.removeStudent("Frankie", "Rodriguez");
        Student[] postEnrollment = classroom.getStudents();
        Assert.assertNotEquals(preEnrollment, postEnrollment);
    }

    @Test
    public void removeStudentTest2() {
        boolean result = classroom.removeStudent("Frankie", "Rodriguez");
        Assert.assertTrue(result);
    }

    @Test
    public void getStudentByScoreTest() {
        String actual = "";
        Student[] result = classroom.getStudentsByScore();
        for (Student entry : result) {
            actual += entry.toString();
        }
        String expected = "Student Name: Julie Rivera\n" +
                "> Average Score: 139.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  22.0\n" +
                "Exam 2 ->  256.0\n" +
                "Student Name: Frankie Rodriguez\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  100.0\n" +
                "Exam 2 ->  150.0\n" +
                "Student Name: DT Walker\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  225.0\n" +
                "Exam 2 ->  25.0\n" +
                "Student Name: Zoe Hardy\n" +
                "> Average Score: 81.5\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  10.0\n" +
                "Exam 2 ->  153.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGradeBookTest() {
        //A couple of adds
        Double[] s3Scores = {54.0, 9.0, 200.0};
        Double[] s6Scores = {100.0, 100.0, 99.0};
        Double[] s7Scores = {250.0, 100.5};
        Student s3 = new Student("Steve", "Harvey", s3Scores);
        Student s6 = new Student("John", "Doe", s6Scores);
        Student s7 = new Student("JarJar", "Binks", s7Scores);
        classroom.addStudent(s3);
        classroom.addStudent(s6);
        classroom.addStudent(s7);

        //real test
        TreeMap<String, ArrayList<String>> gradeBook = classroom.getGradeBook();
        StringBuilder gradeBookToString = new StringBuilder();
        for(Map.Entry<String, ArrayList<String>> entry : gradeBook.entrySet()){
            for (String name : entry.getValue()){
                gradeBookToString.append(String.format("%-15s :%s\n", name, entry.getKey()));
            }
        }
        String expected = "JarJar Binks    :A\n" +
                "Julie Rivera    :A\n" +
                "Frankie Rodriguez :B\n" +
                "DT Walker       :B\n" +
                "John Doe        :C\n" +
                "Steve Harvey    :D\n" +
                "Zoe Hardy       :D\n";
        Assert.assertEquals(expected, gradeBookToString.toString());
    }
}
