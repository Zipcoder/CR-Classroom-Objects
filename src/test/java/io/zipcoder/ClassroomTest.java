package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void getStudents() {
    }

    @Test
    public void getAverageExamScores() {
    }

    @Test
    public void addStudent() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);


        classroom.addStudent(student);
        int postEnrollment = classroom.getNumberOfStudents();

        Assert.assertEquals(1, postEnrollment);



    }
}


