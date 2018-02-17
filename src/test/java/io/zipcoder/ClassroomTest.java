package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassroomTest {

    Classroom testClassroom;

    @Before
    public void setup () {
        int maxNumberOfStudents = 4;
        Classroom testClassroom = new Classroom(maxNumberOfStudents);

        Double[] student1Scores = {92.5, 88.0, 90.0};
        Student student1 = new Student("Marky", "Maple", student1Scores);

        Double[] student2Scores = {75.0, 68.0, 84.5};
        Student student2 = new Student("Ricky", "Ripple", student2Scores);

        Double[] student3Scores = {88.5, 86.0, 92.0};
        Student student3 = new Student("Danny", "Doughnuts", student3Scores);

        Double[] student4Scores = {92.5, 88.0, 90.0};
        Student student4 = new Student("Terri", "Tapeworm", student4Scores);

        

    }

    @Test
    public void defaultConstructorTest() {
        Classroom constructorClassroom = new Classroom();
        int expectedSize = 30;
        int actualSize = constructorClassroom.students.length;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void constructorWithMaxSizeTest () {
        int maxNumberOfStudents = 15;
        Classroom constructorClassroom = new Classroom(maxNumberOfStudents);
        int expectedSize = 15;
        int actualSize = constructorClassroom.students.length;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void constructorGivenArray () {
        Student[] testStudents = {};
        Classroom constructorClassroom = new Classroom(testStudents);
        int expectedSize = 0;
        int actualSize = constructorClassroom.students.length;
        Assert.assertEquals(expectedSize, actualSize);
    }



    @Test
    public void getStudentsTest() {


    }






}
