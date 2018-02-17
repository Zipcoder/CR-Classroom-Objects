package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class ClassroomTest {
    public Classroom classroom;
    public ArrayList<Student> students;

    @Before
    public void setup() {
        // Given:
        classroom = new Classroom();
        students = new ArrayList<>();

        Double[] scores1 = {100.0, 67.7, 98.0};
        Double[] scores2 = {88.0, 33.1, 110.0};
        Double[] scores3 = {90.2, 56.2, 99.0};
        Double[] scores4 = {88.2, 19.2, 12.1};

        // forgive the inconsistency, needed a dup first name
        classroom.addStudent(new Student("William", "Riker", scores1));
        classroom.addStudent(new Student("William", "Shatner", scores2));
        classroom.addStudent(new Student("Leonard", "Nimoy", scores3));
        classroom.addStudent(new Student("DeForest", "Kelly", scores4));

    }

    @Test
    public void testAddStudent() {
        String expected = "Nichelle Nichols : 0.0 \n" +
                "DeForest Kelly : 40.0 \n" +
                "William Shatner : 77.0 \n" +
                "Leonard Nimoy : 82.0 \n" +
                "William Riker : 89.0 \n";
        classroom.addStudent(new Student("Nichelle", "Nichols"));

        String actual = classroom.getStudentsByScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetStudentByName() {
        String expected = "Nichelle";
        classroom.addStudent(new Student(expected, "Nichols"));
        String actual = classroom.getStudentByName("Nichelle", "Nichols").getFirstName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetStudentAverage() {
        Double[] tests = {500.0, 100.0, 200.0, 154.0};
        Double expected = 239.0;
        classroom.addStudent(new Student("Khan", "Noonian Singh", tests));
        Double actual = classroom.getStudentByName("Khan", "Noonian Singh").getAverage();

        Assert.assertEquals(expected, actual);
    }
}
