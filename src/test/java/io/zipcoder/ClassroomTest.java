package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class ClassroomTest{
    @Test
    public void getStudents() {

        Double[] testScores = {100.0, 150.0, 250.0, 0.0};
        Student joeFen = new Student("Joe", "Fen", testScores);
        Student[] students = {joeFen};
        Classroom classroom = new Classroom(students);

        String expected = "[Student Name: Joe Fen\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores: \n" +
                "\t   Exam 1 -> 100.0\n" +
                "\t   Exam 2 -> 150.0\n" +
                "\t   Exam 3 -> 250.0\n" +
                "\t   Exam 4 -> 0.0\n]";
        String actual = Arrays.toString(classroom.getStudents());

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getAverageExamScoreTest() {
        Double[] examScoresJoeFen = {100.0, 150.0, 92.0, 0.0};
        Double[] examScoresPaxFen = {100.0, 100.0, 240.0, 50.0};

        Student joeFen = new Student("Joe", "Fen", examScoresJoeFen);
        Student paxFen = new Student("Pax", "Fen", examScoresPaxFen);
        // When
        Student[] students = {joeFen, paxFen};
        Classroom classroom = new Classroom(students);
        // Then
        Double expected = 104.0;
        Double actual = classroom.getAverageExamScore();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudentTest() {

        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student joeFen = new Student("Joe", "Fen", examScores);
        // When
        classroom.addStudent(joeFen);
        // Then
        String expected =
                "[Student Name: Joe Fen\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores: \n" +
                "\t   Exam 1 -> 100.0\n" +
                "\t   Exam 2 -> 150.0\n" +
                "\t   Exam 3 -> 250.0\n" +
                "\t   Exam 4 -> 0.0\n]";
        String actual = Arrays.toString(classroom.getStudents());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStudentTest() {

        int maxNumberOfStudents = 4;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScoresJoe = {92.0, 150.0, 250.0, 0.0};
        Double[] examScoresPax = {250.0, 100.0, 100.0, 150.0};
        Double[] examScoresKay = {0.0, 150.0, 250.0, 50.00};
        Double[] examScoresElisha = {100.0, 120.0, 150.0, 0.0};
        // When
        Student kayFen = new Student("Kay", "Fen", examScoresKay);
        Student JoeFen = new Student("Joe", "Fen", examScoresJoe);
        Student PaxFen = new Student("Pax", "Fen", examScoresPax);
        Student Elisha = new Student("Elisha", "Renz", examScoresElisha);


        classroom.addStudent(kayFen);
        classroom.addStudent(JoeFen);
        classroom.addStudent(PaxFen);
        classroom.addStudent(Elisha);
        classroom.removeStudent("Elisha", "Renz");
        // Then
        String expected = "[Student Name: Kay Fen\n" +
                "> Average Score: 164.0\n" +
                "> Exam Scores:\n" +
                "\t  Exam 1 -> 0.0\n" +
                "\t  Exam 2 -> 150.0\n" +
                "\t  Exam 3 -> 250.0\n" +
                "\t  Exam 4 -> 50.0\n" +
                ", Student Name: Joe Fen\n" +
                "> Average Score: 164.0\n" +
                "> Exam Scores:\n" +
                "\t  Exam 1 -> 92.0\n" +
                "\t  Exam 2 -> 150.0\n" +
                "\t  Exam 3 -> 250.0\n" +
                "\t  Exam 4 -> 0.0\n" +
                ", Student Name: Pax Fen\n" +
                "> Average Score: 164.0\n" +
                "> Exam Scores:\n" +
                "\t  Exam 1 -> 250.0\n" +
                "\t  Exam 2 -> 100.0\n" +
                "\t  Exam 3 -> 100.0\n" +
                "\t  Exam 4 -> 150.0\n" +
                ", null]";

        String actual = Arrays.toString(classroom.getStudents());
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void moveNullSortArray() {

        int maxNumberOfStudents = 4;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScoresJoe = {92.0, 150.0, 250.0, 0.0};
        Double[] examScoresPax = {250.0, 100.0, 100.0, 150.0};
        Double[] examScoresKay = {0.0, 150.0, 250.0, 50.00};
        Double[] examScoresElisha = {100.0, 120.0, 150.0, 0.0};
        // When
        Student kayFen = new Student("Kay", "Fen", examScoresKay);
        Student JoeFen = new Student("Joe", "Fen", examScoresJoe);
        Student PaxFen = new Student("Pax", "Fen", examScoresPax);
        Student Elisha = new Student("Elisha", "Renz", examScoresElisha);

        classroom.addStudent(kayFen);
        classroom.addStudent(JoeFen);
        classroom.addStudent(PaxFen);
        classroom.addStudent(Elisha);
        classroom.removeStudent("Joe", "Fen");
        classroom.moveNullSortArray();
        // Then
        String expected = "[Student Name: Kay Fen\n" +
                "> Average Score: 164.0\n" +
                "> Exam Scores:\n" +
                "\t  Exam 1 -> 0.0\n" +
                "\t  Exam 2 -> 150.0\n" +
                "\t  Exam 3 -> 250.0\n" +
                "\t  Exam 4 -> 50.0\n" +
                ", Student Name: Pax Fen\n" +
                "> Average Score: 164.0\n" +
                "> Exam Scores:\n" +
                "\t  Exam 1 -> 250.0\n" +
                "\t  Exam 2 -> 100.0\n" +
                "\t  Exam 3 -> 100.0\n" +
                "\t  Exam 4 -> 150.0\n" +
                ", Student Name: Elisha Renz\n" +
                "> Average Score: 92.5\n" +
                "> Exam Scores:\n" +
                "\t  Exam 1 -> 100.0\n" +
                "\t  Exam 2 -> 120.0\n" +
                "\t  Exam 3 -> 150.0\n" +
                "\t  Exam 4 -> 0.0\n" +
                ", null]";

        String actual = Arrays.toString(classroom.getStudents());
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void getStudentByScoreTest() {
        int maxNumberOfStudents = 3;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScoresJoe = {92.0, 150.0, 250.0, 0.0};
        Double[] examScoresPax = {250.0, 100.0, 100.0, 100.0};
        Double[] examScoresKay = {0.0, 150.0, 250.0, 50.00};
        // When
        Student kayFen = new Student("Kay", "Fen", examScoresKay);
        Student JoeFen = new Student("Joe", "Fen", examScoresJoe);
        Student PaxFen = new Student("Pax", "Fen", examScoresPax);

        classroom.addStudent(kayFen);
        classroom.addStudent(JoeFen);
        classroom.addStudent(PaxFen);
        Student[] actual = classroom.getStudentsByScore(150.0);
        // Then
        Student [] expected = new Student[]{kayFen, JoeFen};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortFoundStudents() {

    }

    @Test
    public void compare() {
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScoresJoe = {90.0, 150.0, 100.0, 150.0};
        Double[] examScoresPax = {90.0, 150.0, 100.0, 150.0};
        // When
        Student JoeFen = new Student("Joe", "Fen", examScoresJoe);
        Student PaxFen = new Student("Pax", "Fen", examScoresPax);

        classroom.addStudent(JoeFen);
        classroom.addStudent(PaxFen);
        
        String expected = "Joe Fen";
        String actual = "Joe Fen";
        
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareLexigraphically() {
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScoresJoe = {92.0, 150.0, 250.0, 0.0};
        Double[] examScoresPax = {250.0, 100.0, 100.0, 150.0};
        // When
        Student JoeFen = new Student("Joe", "Fen", examScoresJoe);
        Student PaxFen = new Student("Pax", "Fen", examScoresPax);

        classroom.addStudent(JoeFen);
        classroom.addStudent(PaxFen);
    }

    @Test
    public void getGradeBook() {
        //Given

        Double[] examScores1 = {99.0, 50.0, 82.0};
        Double[] examScores2 = {100.0, 100.0, 50.0};
        Double[] examScores3 = {92.0, 80.0, 73.0};
        Double[] examScores4 = {100.0, 84.0, 62.0};
        Double[] examScores5 = {60.0, 50.0, 90.0};

        Student student1 = new Student ("Joe", "Fen", examScores1);
        Student student2 = new Student ("Pax", "Fennimore", examScores2);
        Student student3 = new Student ("Elisha", "Renz", examScores3);
        Student student4 = new Student ("Nico", "Janse", examScores4);
        Student student5 = new Student ("Tegan", "Naicker", examScores5);

        Student[] students = new Student[5];
        Classroom classroom = new Classroom(students);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.addStudent(student4);
        classroom.addStudent(student5);

        //When
        String expected = "{A=[Student Name: Joe Fen\n" +
                "> Average Score: 77.0\n" +
                "> Exam Scores: \n" +
                "\t   Exam 1 -> 99.0\n" +
                "\t   Exam 2 -> 50.0\n" +
                "\t   Exam 3 -> 82.0\n" +
                "], B=[Student Name: Pax Fennimore\n" +
                "> Average Score: 83.33333333333333\n" +
                "> Exam Scores: \n" +
                "\t   Exam 1 -> 100.0\n" +
                "\t   Exam 2 -> 100.0\n" +
                "\t   Exam 3 -> 50.0\n" +
                "], C=[Student Name: Elisha Renz\n" +
                "> Average Score: 81.66666666666667\n" +
                "> Exam Scores: \n" +
                "\t   Exam 1 -> 92.0\n" +
                "\t   Exam 2 -> 80.0\n" +
                "\t   Exam 3 -> 73.0\n" +
                "], D=[Student Name: Nico Janse\n" +
                "> Average Score: 82.0\n" +
                "> Exam Scores: \n" +
                "\t   Exam 1 -> 100.0\n" +
                "\t   Exam 2 -> 84.0\n" +
                "\t   Exam 3 -> 62.0\n" +
                ", Student Name: Tegan Naicker\n" +
                "> Average Score: 66.66666666666667\n" +
                "> Exam Scores: \n" +
                "\t   Exam 1 -> 60.0\n" +
                "\t   Exam 2 -> 50.0\n" +
                "\t   Exam 3 -> 90.0\n" +
                "]}";
        TreeMap<Character, ArrayList<Student>> actual = classroom.getGradeBook();
        //Then
        Assert.assertEquals(expected, actual.toString());
    }
}

