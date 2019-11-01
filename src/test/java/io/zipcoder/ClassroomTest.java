package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ClassroomTest {
    @Test
    public void ConstructorTest1() {

    }

    @Test
    public void ConstructorTest2() {

    }

    @Test
    public void ConstructorTest3() {

    }

    @Test
    public void getStudentsTest() {
        Double[] exams1 = {69.42, 24.45, 100.0, 96.55};
        Double[] exams2 = {75.34, 34.56, 70.43, 95.44};
        Double[] exams3 = {84.39, 98.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Student[] students = {student1, student2, student3};
        Classroom classroom = new Classroom(students);
        Student[] actual = classroom.getStudents();
        Student[] expected = students;

        Assert.assertSame(expected, actual);
    }

    @Test
    public void addStudentTest() {
        Double[] exams = {};
        Student student1 = new Student("Wes", "Jones", exams);
        Student student2 = new Student("Angus", "McMillan", exams);
        Student student3 = new Student("Clayton", "Mirage", exams);
        Student[] students = {student1, student2, student3};
        Classroom classroom = new Classroom(students);
        classroom.addStudent(new Student("John", "Smith", exams));
        Integer actual = classroom.getStudents().length;
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScore() {
        Double[] exams1 = {69.42, 24.45, 100.0, 96.55};
        Double[] exams2 = {75.34, 34.56, 70.43, 95.44};
        Double[] exams3 = {84.39, 98.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Classroom classroom = new Classroom(student1,student2,student3);
        Double actual = classroom.getAverageExamScore();
        Double expected = 66.75;
        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void removeStudent() {
        Double[] exams1 = {69.42, 24.45, 100.0, 96.55};
        Double[] exams2 = {75.34, 34.56, 70.43, 95.44};
        Double[] exams3 = {84.39, 98.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Classroom classroom = new Classroom(student1,student2,student3);
        classroom.removeStudent("Wes", "Jones");

    }

    @Test
    public void getGradeBook() {
        Double[] exams1 = {69.42, 24.45, 100.0, 96.55};
        Double[] exams2 = {75.34, 34.56, 70.43, 95.44};
        Double[] exams3 = {84.39, 98.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Student[] students = {student1,student2,student3};
        Classroom classroom = new Classroom(students);
        classroom.getStudentsByScore();
        Map actual = classroom.getGradeBook();
        Map expected = new HashMap<String, String>();
        expected.put("Wes Jones", "A");
        expected.put("Angus McMillan", "C");
        expected.put("Clayton Mirage", "D");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfStudentsTest1() {
        Classroom classroom = new Classroom();
        int actual = classroom.getNumberOfStudents();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNumberOfStudentsTest2() {
        Double[] exams1 = {69.42, 24.45, 100.0, 96.55};
        Double[] exams2 = {75.34, 34.56, 70.43, 95.44};
        Double[] exams3 = {84.39, 98.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Student[] students = {student1,student2,student3};
        Classroom classroom = new Classroom(students);
        int actual = classroom.getNumberOfStudents();
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsByScoreTest1() {
        Double[] exams1 = {69.42, 74.45, 100.0, 96.55};
        Double[] exams2 = {75.34, 34.56, 50.43, 75.44};
        Double[] exams3 = {84.39, 48.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Student[] students = {student1,student2,student3};
        Classroom classroom = new Classroom(students);
        Student[] actual = classroom.getStudentsByScore();
        for (Student student: actual) {
            student.toString();
        }
    }
    @Test
    public void getStudentsByScoreTest2() {
        Double[] exams1 = {50.0, 50.0, 50.0, 50.0};
        Double[] exams2 = {50.0, 50.0, 50.0, 50.0};
        Double[] exams3 = {84.39, 48.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Student[] students = {student1,student2,student3};
        Classroom classroom = new Classroom(students);
        Student[] sortedStudents = classroom.getStudentsByScore();
        StringBuilder build = new StringBuilder();
        for (Student student: sortedStudents) {
            build.append(student.getFirstName());
        }
        String actual = build.toString();
        String expected = "AngusWesClayton";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getPercentileTest1() {
        Double[] exams1 = {99.42, 98.45, 100.0, 96.55};
        Double[] exams2 = {75.34, 34.56, 50.43, 75.44};
        Double[] exams3 = {84.39, 48.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Student[] students = {student1,student2,student3};
        Classroom classroom = new Classroom(students);
        String actual = classroom.getPercentile(student1);
        String expected = "A";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getPercentileTest2() {
        Double[] exams1 = {99.42, 98.45, 100.0, 96.55};
        Double[] exams2 = {75.34, 34.56, 50.43, 75.44};
        Double[] exams3 = {84.39, 48.54, 32.38, 19.45};
        Student student1 = new Student("Wes", "Jones", exams1);
        Student student2 = new Student("Angus", "McMillan", exams2);
        Student student3 = new Student("Clayton", "Mirage", exams3);
        Student[] students = {student1,student2,student3};
        Classroom classroom = new Classroom(students);
        String actual = classroom.getPercentile(student2);
        String expected = "C";
        Assert.assertEquals(expected, actual);
    }
}
