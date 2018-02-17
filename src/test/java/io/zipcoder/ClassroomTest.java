package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ClassroomTest {

    @Test
    public void addStudentTest() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] student1Scores = { 100.0, 150.0 };
        classroom.addStudent("Brian", "He", student1Scores);
        String actual = classroom.getStudents();
        System.out.println(actual);
        String expected = "[Student Name: Brian He\n> Average Score: 125\n> Exam Scores:\n\t\tExam 1 -> 100\n\t\tExam 2 -> 150\n]";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudentToFullClassRoomTest() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] student1Scores = { 100.0, 150.0 };
        Double[] student2Scores = { 225.0, 25.0 };

        classroom.addStudent("Brian", "He", student1Scores);

        boolean expected = false;
        boolean actual = classroom.addStudent("John", "Smith", student2Scores);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsTest() {
        Classroom classroom = new Classroom(1);

        Double[] student1Scores = { 100.0, 150.0 };

        classroom.addStudent("Brian", "He", student1Scores);

        String actual = classroom.getStudents();
        String expected = "[Student Name: Brian He\n> Average Score: 125\n> Exam Scores:\n\t\tExam 1 -> 100\n\t\tExam 2 -> 150\n]";
        System.out.println(expected);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStudentTest() {
        Classroom classroom = new Classroom(2);

        Double[] student1Scores = { 100.0, 150.0 };
        Double[] student2Scores = { 225.0, 25.0 };

        classroom.addStudent("Brian", "He", student1Scores);
        classroom.addStudent("John", "Smith", student2Scores);

        boolean actual = classroom.removeStudent("Brian", "He");
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStudentThatDoesNotExistTest() {
        Classroom classroom = new Classroom(1);

        Double[] student1Scores = { 100.0, 150.0 };

        classroom.addStudent("Brian", "He", student1Scores);

        boolean actual = classroom.removeStudent("John", "Smith");
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageClassExamScoreTest() {
        Classroom classroom = new Classroom(2);

        Double[] student1Scores = { 100.0, 150.0 };
        Double[] student2Scores = { 225.0, 25.0 };

        classroom.addStudent("Brian", "He", student1Scores);
        classroom.addStudent("John", "Smith", student2Scores);

        double actual = classroom.getAverageClassExamScore();
        double expected = 125.0;

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void listStudentsByScore() {
        Classroom classroom = new Classroom(10);

        Double[] student1Scores = { 100.0, 150.0 };
        Double[] student2Scores = { 225.0, 75.0 };
        Double[] student3Scores = { 95.0, 80.0 };
        Double[] student4Scores = { 65.0, 50.0 };
        Double[] student5Scores = { 225.0, 25.0 };

        classroom.addStudent("Lawrence", "Wu", student5Scores);
        classroom.addStudent("Brian", "He", student1Scores);
        classroom.addStudent("John", "Smith", student2Scores);
        classroom.addStudent("Mitch", "Taylor", student3Scores);
        classroom.addStudent("Anthony", "Kain", student4Scores);


        String actual = classroom.listStudentsByScore();
        String expected = "[Student Name: John Smith\n> Average Score: 150\n> Exam Scores:\n\t\tExam 1 -> 225\n\t\tExam 2 -> 75\n, Student Name: Brian He\n> Average Score: 125\n> Exam Scores:\n\t\tExam 1 -> 100\n\t\tExam 2 -> 150\n, Student Name: Lawrence Wu\n> Average Score: 125\n> Exam Scores:\n\t\tExam 1 -> 225\n\t\tExam 2 -> 25\n, Student Name: Mitch Taylor\n> Average Score: 87\n> Exam Scores:\n\t\tExam 1 -> 95\n\t\tExam 2 -> 80\n, Student Name: Anthony Kain\n> Average Score: 57\n> Exam Scores:\n\t\tExam 1 -> 65\n\t\tExam 2 -> 50\n]";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gradeStudentsTest() {
        Classroom classroom = new Classroom(10);

        Double[] student1Scores = { 100.0, 150.0 };
        Double[] student2Scores = { 225.0, 75.0 };
        Double[] student3Scores = { 95.0, 80.0 };
        Double[] student4Scores = { 65.0, 50.0 };
        Double[] student5Scores = { 225.0, 25.0 };
        Double[] student6Scores = { 100.0, 75.0 };
        Double[] student7Scores = { 125.0, 75.0 };
        Double[] student8Scores = { 130.0, 60.0 };
        Double[] student9Scores = { 85.0, 55.0 };
        Double[] student10Scores = {95.0, 70.0 };

        classroom.addStudent("Brian", "He", student1Scores);
        classroom.addStudent("John", "Smith", student2Scores);
        classroom.addStudent("Mitch", "Taylor", student3Scores);
        classroom.addStudent("Anthony", "Kain", student4Scores);
        classroom.addStudent("Lawrence", "Wu", student5Scores);
        classroom.addStudent("Julie", "Moon", student6Scores);
        classroom.addStudent("John", "Doe", student7Scores);
        classroom.addStudent("James", "Moo", student8Scores);
        classroom.addStudent("Lauren", "Meow", student9Scores);
        classroom.addStudent("Roger", "Federer", student10Scores);

        String actual = classroom.gradeClass();
        String expected = "John Smith : A\nBrian He : B\nLawrence Wu : B\nJohn Doe : C\nJames Moo : C\nJulie Moon : D\nMitch Taylor : D\nRoger Federer : D\nLauren Meow : D\nAnthony Kain : F\n";
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }

}

