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

    @Test
    public void removeStudentTest(){
        Student jeff = new Student("jeff", "bridges", 2);
        Student beff = new Student("beff", "smidges", 2);
        Student yeff = new Student("yeff", "ridges", 2);
        Student[] temp = {jeff, beff, yeff};
        testRoom = new Classroom(temp);
        Student[] expected = {jeff, yeff, null, null, null, null, null, null, null, null};
        Student[] actual = testRoom.removeStudent("beff", "smidges");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getClassAverageTest(){
        Double[] testscores1 = {100.0, 100.0, 100.0};
        Double[] testscores2 = {80.0, 80.0, 80.0};
        Double[] testscores3 = {70.0, 70.0, 70.0};
        Student mary = new Student("mary", "martin", testscores1);
        Student gary = new Student("gary", "gartin", testscores2);
        Student steve = new Student("steve", "steve", testscores3);
        Student[] temp = {mary, gary, steve};
        testRoom = new Classroom(temp);
        Double expected = 83.33;
        Double actual = testRoom.getClassAverage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void classScoresTest(){
        Double[] testscores1 = {100.0, 100.0, 100.0};
        Double[] testscores2 = {80.0, 80.0, 80.0};
        Double[] testscores3 = {70.0, 70.0, 70.0};
        Student mary = new Student("mary", "martin", testscores1);
        Student gary = new Student("gary", "gartin", testscores2);
        Student steve = new Student("steve", "steve", testscores3);
        Student[] temp = {mary, gary, steve};
        testRoom = new Classroom(temp);
        String expected = "Students:\nmary martin -> 100.0\ngary gartin -> 80.0\n" +
                "steve steve -> 70.0\n";
        String actual = testRoom.getClassScores();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortStudentsByScoreTest(){
        Double[] testscores1 = {100.0, 100.0, 100.0};
        Double[] testscores2 = {80.0, 80.0, 80.0};
        Double[] testscores3 = {70.0, 70.0, 70.0};
        Student gary = new Student("gary", "gartin", testscores2);
        Student mary = new Student("mary", "martin", testscores1);
        Student steve = new Student("steve", "steve", testscores3);
        Student[] temp = {mary, steve, gary};
        testRoom = new Classroom(temp);
        Student[] expected = {mary, gary, steve, null, null, null, null, null, null, null};
        testRoom.sortStudentsByScore();
        Student[] actual = testRoom.getStudents();
        Assert.assertEquals(expected, actual);
    }

}
