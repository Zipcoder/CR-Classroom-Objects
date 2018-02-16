package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        // Given

        String expectedFirstName =  "";
        String expectedLastName = "";
        Double[] expectedTestScores = new Double[0];

        // When
        Student student = new Student(expectedFirstName, expectedLastName, expectedTestScores);


        // Then

        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        Double[] actualTestScores = student.getTestScores();

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedTestScores, actualTestScores);

    }

    @Test
    public void getExamsScoresTest() {
        String firstName = "Nialls";
        String lastName = "Harrns";
        Double[] examScores = { 93.00, 92.0, 56.0, 88.00 };

        Student student = new Student(firstName, lastName, examScores);

        String output = student.getExamScores();

        System.out.println(output);
    }


}