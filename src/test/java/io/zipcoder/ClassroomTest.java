package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ClassroomTest {
    Classroom testRoom;

    @Before
    public void setup(){

    }

    @Test
    public void classroomConstructorTest(){
        Student[] studentList = new Student[3];
        Classroom testRoomA = new Classroom(studentList, studentList.length, 10);
        Assert.assertEquals(testRoomA.getStudentsEnrolled(), studentList.length);
    }

    @Test
    public void studentArrayConstructor() {
        Student jeff = new Student("jeff", "bridges", 2);
        Student beff = new Student("beff", "bridges", 2);
        Student yeff = new Student("yeff", "bridges", 2);
        Student[] newStudentArray = {jeff, beff, yeff};
        Classroom testRoom = new Classroom(newStudentArray);
        Assert.assertEquals(newStudentArray[2], testRoom.getStudents()[2]);
    }

    @Test
    public void addStudentSuccessTest(){
        Student jeff = new Student("jeff", "bridges", 2);
        Student beff = new Student("beff", "bridges", 2);
        Student yeff = new Student("yeff", "bridges", 2);
        Student[] temp = {jeff, beff};
        Student[] expected = {jeff, beff, yeff};
        testRoom = new Classroom(temp);
        testRoom.addStudent(yeff);
        Assert.assertEquals(expected[2], testRoom.getStudents()[2]);
    }

    @Test
    public void addStudentFailureTest(){
        Student jeff = new Student("jeff", "bridges", 2);
        Student beff = new Student("beff", "bridges", 2);
        Student yeff = new Student("yeff", "bridges", 2);
        Student[] temp = {jeff, beff};
        testRoom = new Classroom(temp, 2, 2);
        Assert.assertFalse(testRoom.addStudent(yeff));
    }

    

}
