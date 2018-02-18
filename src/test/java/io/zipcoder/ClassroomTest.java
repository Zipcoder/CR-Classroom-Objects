package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ClassroomTest {
    private Student[] testStudents;
    private int studentAmount;
    private int maxStudentAmount;
    private HashMap<String, Student> studentHashMap;
    private Classroom testClassroom;
    private Student testStudent;
    private String firstName;
    private String lastName;
    private ArrayList<Double> testScores;


    @Before
    public void setUpStudents() {



        ArrayList<Double> testScore2 = new ArrayList<Double>(){{
            add(99.0);
            add(43.0);
            add(56.0);
            add(88.0);
        }};
        Student student2 = new Student("Teddie", "Rosevelt", testScore2);

        ArrayList<Double> testScore3 = new ArrayList<Double>(){{
            add(65.0);
            add(60.0);
            add(84.0);
            add(70.0);
        }};
        Student student3 = new Student("Fox", "McCloud", testScore3);

        ArrayList<Double> testScore4 = new ArrayList<Double>(){{
            add(100.0);
            add(78.0);
            add(92.0);
            add(77.0);
        }};
        Student student4 = new Student("Yancy", "Nancy", testScore4);

        ArrayList<Double> testScore5 = new ArrayList<Double>(){{
            add(77.0);
            add(92.0);
            add(99.0);
            add(68.0);
        }};
        Student student5 = new Student("Tommy", "Tim", testScore5);








    }

    @Test
    public void getMaxClassroomSize(){
       Integer maxStudentAmount = 10;
       Classroom testClassroom = new Classroom(maxStudentAmount);
       Integer expected = 10;
       Integer actual =  testClassroom.getStudents().length;
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNullaryClassroomSize(){
        Classroom testClassroom = new Classroom();
        Integer expected = 30;
        Integer actual = testClassroom.getStudents().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayStudent() {
        testScores = new ArrayList<>();
        testStudent = new Student(firstName, lastName, testScores);

        ArrayList<Double> testScore0 = new ArrayList<Double>() {{
            add(81.0);
            add(92.0);
            add(76.0);
            add(68.0);
        }};
        Student student0 = new Student("Freddie", "Mercury", testScore0);

        Student[] testStudents = {student0};
        Classroom testClassroom = new Classroom(testStudents);
        String expected = "[Student Name: Freddie Mercury\n" +
                "> Average Score: 79.0\n" +
                "> Exam Scores: \n" +
                "\tExam 1 --> 81.0\n" +
                "\tExam 2 --> 92.0\n" +
                "\tExam 3 --> 76.0\n" +
                "\tExam 4 --> 68.0\n" +
                "]";
        String actual = Arrays.toString(testClassroom.getStudents());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddStudent(){

        ArrayList<Double> testScore1 = new ArrayList<Double>(){{
                add(82.0);
                add(31.0);
                add(56.0);
                add(93.0); }};
        Student student1 = new Student("Spongebob", "Squarepants", testScore1);
    boolean expected = true;
    Classroom testClassroom = new Classroom();
    boolean actual = testClassroom.addStudents(student1);
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddStudent2(){
        ArrayList<Double> testScore9 = new ArrayList<Double>(){{
            add(81.0);
            add(92.0);
            add(34.0);
            add(68.0);
        }};
        Student student9 = new Student("Travis", "Touchdown", testScore9);


        ArrayList<Double> testScore8 = new ArrayList<Double>(){{
            add(88.0);
            add(99.0);
            add(76.0);
            add(68.0);
        }};
        Student student8 = new Student("Mike", "Ross", testScore8);
    boolean expected = false;
    Classroom testClassroom = new Classroom(1);
    testClassroom.addStudents(student8);
    boolean actual = testClassroom.addStudents(student9);
    }

    @Test
    public void testRemoveStudent(){
    Classroom testClassroom = new Classroom(2);
        ArrayList<Double> testScore7 = new ArrayList<Double>(){{
            add(66.0);
            add(92.0);
            add(76.0);
            add(42.0);
        }};
        Student student7 = new Student("Rachel", "Zane", testScore7);
    testClassroom.addStudents(student7);
        ArrayList<Double> testScore6 = new ArrayList<Double>(){{
            add(99.0);
            add(99.0);
            add(99.0);
            add(99.0);
        }};
        Student student6 = new Student("Optimus", "Prime", testScore6);
    testClassroom.addStudents(student6);
    testClassroom.removeStudent("Rachel", "Zane");
    String expected = "[Student Name: Optimus Prime\n" +
            "> Average Score: 99.0\n" +
            "> Exam Scores: \n" +
            "\tExam 1 --> 99.0\n" +
            "\tExam 2 --> 99.0\n" +
            "\tExam 3 --> 99.0\n" +
            "\tExam 4 --> 99.0\n" +
            ", null]";
    String actual =  Arrays.toString(testClassroom.getStudents());
    Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemoveStudent2(){
        Classroom testClassroom = new Classroom(2);
        ArrayList<Double> testScore7 = new ArrayList<Double>(){{
            add(66.0);
            add(92.0);
            add(76.0);
            add(42.0);
        }};
        Student student7 = new Student("Rachel", "Zane", testScore7);
        testClassroom.addStudents(student7);
        ArrayList<Double> testScore6 = new ArrayList<Double>(){{
            add(99.0);
            add(99.0);
            add(99.0);
            add(99.0);
        }};
        Student student6 = new Student("Optimus", "Prime", testScore6);
        testClassroom.addStudents(student6);

    String expected = "This student is not enrolled";
    String actual = testClassroom.removeStudent("Rachel", "Bane");

    }
    @Test
    public void testGetAverageScore(){
        Classroom testClassroom = new Classroom(2);
        ArrayList<Double> testScore7 = new ArrayList<Double>(){{
            add(66.0);
            add(92.0);
            add(76.0);
            add(42.0);
            //avg 69.0
        }};
        Student student6 = new Student("Rachel", "Zane", testScore7);
        testClassroom.addStudents(student6);
        ArrayList<Double> testScore6 = new ArrayList<Double>(){{
            add(99.0);
            add(99.0);
            add(99.0);
            add(99.0);
            //avg 99
        }};
        Student student7 = new Student("Optimus", "Prime", testScore6);
        testClassroom.addStudents(student7);
    Double expected = 84.0;
    Double actual = testClassroom.getClassAverage();
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetStudentbyScore(){

    }

}
