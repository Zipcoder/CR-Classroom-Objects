package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentTest {

//    @Before
//    public void setUp(){
//        Double[] tonyScores= {34.2, 43.2, 90.0};
//        Double[] robScores = {54.2, 61.2, 92.0};
//        Double[] johnScores = {76.0, 80.5, 97.0};
//        Student tony = new Student("Tony", "Smith",tonyScores);
//        Student rob = new Student("Rob", "Thomas", robScores);
//        Student john = new Student("John", "Philip", johnScores);
//    }


    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedFirstName = "Tom";
        String expectedLastName = "Fantana";
        Double[] expectedDouble = {55.2, 64.5, 56.5};
        Student student = new Student(expectedFirstName, expectedLastName, expectedDouble);

        // When
        String actualFirstName = student.getFirstName();
        String actualLastName =  student.getLastName();
        Double[] actualDouble =  student.getTestScores();

        // Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedDouble, actualDouble);
    }

    @Test
    public void getNumberOfExamsTakenTest(){
        // Given
        String expectedFirstName = "Tom";
        String expectedLastName = "Fantana";
        Double[] expectedDouble = {55.2, 64.5, 56.5};
        int expectedDoubleLength = 3;
        Student student = new Student(expectedFirstName, expectedLastName, expectedDouble);

        // When
        int actualDoubleLength = student.getNumberOfExamsTaken();

        // Then
        Assert.assertEquals(expectedDoubleLength, actualDoubleLength);
    }
    @Test
    public void getExamScoresTest(){
        // Given
        String expectedFirstName = "Tom";
        String expectedLastName = "Fantana";
        Double[] expectedDouble = {55.2, 64.5, 56.5};
        String expectedGetExamScores = "Exam 1 -> 55.2\nExam 2 -> 64.5\nExam 3 -> 56.5";
        Student student = new Student(expectedFirstName, expectedLastName, expectedDouble);

        // When
        String actualGetExamScores = student.getExamScores();

        // Then
        Assert.assertEquals(expectedGetExamScores, actualGetExamScores);
    }
    @Test
    public void addExamScoreTest() {
        String expectedFirstName = "Tom";
        String expectedLastName = "Fantana";
        Double[] expectedDouble = {};
        String expectedAddExamScore = "Exam 1 -> 55.2";
        Student student = new Student(expectedFirstName, expectedLastName, expectedDouble);

        // When
        Double actualAddExamScore = student.addExamScore();

        // Then
        Assert.assertEquals(expectedAddExamScore, actualAddExamScore);

    }
    //@Test

}