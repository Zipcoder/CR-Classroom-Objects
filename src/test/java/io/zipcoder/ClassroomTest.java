package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void testGetStudents() {
        //given
        Double[] testScores = {90.0, 80.0, 70.0};
        Student student = new Student("Tohru", "Honda", testScores);
        //when
        Classroom classroom = new Classroom();
        classroom.addStudent(student);
        Student actual = classroom.getStudents()[0];
        //then
        Assert.assertEquals(student, actual);
    }

    @Test
    public void testGetAverageExamScore() {}
}
