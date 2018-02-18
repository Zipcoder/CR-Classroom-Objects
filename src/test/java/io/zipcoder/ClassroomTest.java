package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Luis J. Romero on 2/16/2018
 *
 * Restrictions - Ensure unit positive and negative unit tests exist per feature of the application
 */


public class ClassroomTest {

    private Classroom classroom;

    @Before
    public void executedBeforeEach() {

    }

    @Test
    public void ClassroomMaxNumberOfStudentsConstructorPositiveTest() {

        // Given
        int expectedMaxNumberOfStudents = 5;
        this.classroom = new Classroom(5);

        // When
        int actualMaxNumberOfStudents = this.classroom.studentsArray.length;

        // Then
        Assert.assertEquals(expectedMaxNumberOfStudents, actualMaxNumberOfStudents);

    }

    @Test
    public void ClassroomStudentsArrayConstructorPositiveTest() {

        // Given
        String expectedFirstName0 = "first0";
        String expectedFirstName1 = "first1";
        String expectedFirstName2 = "first2";

        String expectedLastName0 = "last0";
        String expectedLastName1 = "last1";
        String expectedLastName2 = "last2";

        Double[] expectedDoubleArray0 = {0.0, 1.0, 2.0};
        Double[] expectedDoubleArray1 = {1.0, 1.0, 2.0};
        Double[] expectedDoubleArray2 = {2.0, 1.0, 2.0};

        Student[] expectedStudentsArray = {new Student(expectedFirstName0, expectedLastName0, expectedDoubleArray0),
                new Student(expectedFirstName1, expectedLastName1, expectedDoubleArray1),
                new Student(expectedFirstName2, expectedLastName2, expectedDoubleArray2)};

        this.classroom = new Classroom(expectedStudentsArray);

        // When
        String actualFirstName0 = this.classroom.studentsArray[0].getFirstName();
        String actualFirstName1 = this.classroom.studentsArray[1].getFirstName();
        String actualFirstName2 = this.classroom.studentsArray[2].getFirstName();

        String actualLastName0 = this.classroom.studentsArray[0].getLastName();
        String actualLastName1 = this.classroom.studentsArray[1].getLastName();
        String actualLastName2 = this.classroom.studentsArray[2].getLastName();

        String actualDoubleArray0 = this.classroom.studentsArray[0].getExamScoresArrayList().toString();
        String actualDoubleArray1 = this.classroom.studentsArray[1].getExamScoresArrayList().toString();
        String actualDoubleArray2 = this.classroom.studentsArray[2].getExamScoresArrayList().toString();

        // Then
        Assert.assertEquals(expectedFirstName0, actualFirstName0);
        Assert.assertEquals(expectedFirstName1, actualFirstName1);
        Assert.assertEquals(expectedFirstName2, actualFirstName2);

        Assert.assertEquals(expectedLastName0, actualLastName0);
        Assert.assertEquals(expectedLastName1, actualLastName1);
        Assert.assertEquals(expectedLastName2, actualLastName2);

        Assert.assertEquals(Arrays.toString(expectedDoubleArray0), actualDoubleArray0);
        Assert.assertEquals(Arrays.toString(expectedDoubleArray1), actualDoubleArray1);
        Assert.assertEquals(Arrays.toString(expectedDoubleArray2), actualDoubleArray2);

//        System.out.println(actualFirstName0);
//        System.out.println(actualFirstName1);
//        System.out.println(actualFirstName2);
//
//        System.out.println(actualLastName0);
//        System.out.println(actualLastName1);
//        System.out.println(actualLastName2);
//
//        System.out.println(actualDoubleArray0);
//        System.out.println(actualDoubleArray1);
//        System.out.println(actualDoubleArray2);
    }

    @Test
    public void ClassroomDefaultConstructorPositiveTest() {

        // Given
        int expectedLengthOfStudentsArray = 30;
        this.classroom = new Classroom();

        // When
        int actualLengthOfStudentsArray = this.classroom.studentsArray.length;

        // Then
        Assert.assertEquals(expectedLengthOfStudentsArray, actualLengthOfStudentsArray);
    }

    @Test
    public void getStudentsDefaultConstructorPositiveTest() {

        // Given
        this.classroom = new Classroom();

        // When
        //String actualStudentsArrayAsString0 = this.classroom.getStudents()[0];

        // Then
        Assert.assertEquals(null, this.classroom.getStudents()[0]);
        Assert.assertEquals(null, this.classroom.getStudents()[15]);
        Assert.assertEquals(null, this.classroom.getStudents()[29]);

        //System.out.println(Arrays.toString(this.classroom.getStudents()));
    }


    @Test
    public void getStudentsStudentsArrayConstructorPositiveTest() {

        String expectedFirstName0 = "first0";
        String expectedFirstName1 = "first1";

        String expectedLastName0 = "last0";
        String expectedLastName1 = "last1";

        Double[] expectedDoubleArray0 = {0.0, 1.0, 2.0};
        Double[] expectedDoubleArray1 = {1.0, 1.0, 2.0};

        Student[] expectedStudentsArray = { new Student(expectedFirstName0, expectedLastName0, expectedDoubleArray0),
                                            new Student(expectedFirstName1, expectedLastName1, expectedDoubleArray1) };

        this.classroom = new Classroom(expectedStudentsArray);

        // When
//        String actualFirstName0 = this.classroom.studentsArray[0].getFirstName();
//        String actualFirstName1 = this.classroom.studentsArray[1].getFirstName();
//
//        String actualLastName0 = this.classroom.studentsArray[0].getLastName();
//        String actualLastName1 = this.classroom.studentsArray[1].getLastName();
//
//        String actualDoubleArray0 = this.classroom.studentsArray[0].getExamScoresArrayList().toString();
//        String actualDoubleArray1 = this.classroom.studentsArray[1].getExamScoresArrayList().toString();

        // Then
        //This test is deprecated, but it works
        Assert.assertEquals(expectedStudentsArray, this.classroom.getStudents());
        //System.out.println(Arrays.toString(this.classroom.getStudents()));
    }

    @Test
    public void getClassroomAverageExamScorePositiveTest() {
        // Given
        String expectedFirstName0 = "first0";
        String expectedFirstName1 = "first1";
        String expectedFirstName2 = "first2";

        String expectedLastName0 = "last0";
        String expectedLastName1 = "last1";
        String expectedLastName2 = "last2";

        Double[] expectedDoubleArray0 = { 25.0, 34.0, 41.0 };
        Double[] expectedDoubleArray1 = { 47.0, 7.0, 13.0 };
        Double[] expectedDoubleArray2 = { 50.0, 100.0, 35.0 };

        Student[] expectedStudentsArray = { new Student(expectedFirstName0, expectedLastName0, expectedDoubleArray0),
                                            new Student(expectedFirstName1, expectedLastName1, expectedDoubleArray1),
                                            new Student(expectedFirstName2, expectedLastName2, expectedDoubleArray2) };

        this.classroom = new Classroom(expectedStudentsArray);

        double expectedClassroomAverageExamScore = 39.1;

        // When
        double actualClassroomAverageExamScore = this.classroom.getClassroomAverageExamScore();

        // Then
        Assert.assertEquals(expectedClassroomAverageExamScore, actualClassroomAverageExamScore, 0.001);
        //System.out.println(expectedClassroomAverageExamScore);
    }

    @Test
    public void addStudentPositiveTest() {
        // Given
        String expectedFirstName0 = "first0";
        String expectedFirstName1 = "first1";
        String expectedFirstName2 = "first2";

        String expectedLastName0 = "last0";
        String expectedLastName1 = "last1";
        String expectedLastName2 = "last2";

        Double[] expectedDoubleArray0 = { 25.0, 34.0, 41.0 };
        Double[] expectedDoubleArray1 = { 47.0, 7.0, 13.0 };
        Double[] expectedDoubleArray2 = { 50.0, 100.0, 35.0 };

        Student[] expectedStudentsArray = { new Student(expectedFirstName0, expectedLastName0, expectedDoubleArray0),
                                            new Student(expectedFirstName1, expectedLastName1, expectedDoubleArray1),
                                            new Student(expectedFirstName2, expectedLastName2, expectedDoubleArray2) };

        this.classroom = new Classroom(expectedStudentsArray);
//        System.out.println(Arrays.toString(this.classroom.getStudents()));
//        System.out.println(this.classroom.getClassroomAverageExamScore());
//        System.out.println("+++++++++++++++++++++");

        String expectedNewFirst = "newFirst";
        String expectedNewLast = "newLast";
        Double[] expectedNewDoubleArray = { 9.0, 9.0, 9.0 };
        this.classroom.addStudent(new Student(expectedNewFirst, expectedNewLast, expectedNewDoubleArray));
//        System.out.println(Arrays.toString(this.classroom.getStudents()));
//        System.out.println(this.classroom.getClassroomAverageExamScore());

        // When
        String actualNewFirst = this.classroom.getStudents()[3].getFirstName();
        String actualNewLast = this.classroom.getStudents()[3].getLastName();
        String actualNewDoubleArray = this.classroom.getStudents()[3].getExamScoresArrayList().toString();
        //System.out.println(this.classroom.getStudents()[3].toString());

        // Then
        Assert.assertEquals(expectedNewFirst, actualNewFirst);
        Assert.assertEquals(expectedNewLast, actualNewLast);
        Assert.assertEquals(Arrays.toString(expectedNewDoubleArray), actualNewDoubleArray);
    }


}
