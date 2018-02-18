package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;


public class StudentTest {
public static Student dummyStudent = new Student("John", "Smith",new Double[]{65.00, 76.00, 100.00});


    //getFirstName()

    @Test
    public void testGetFirstName() {
        // Given
        String expected = "John";

        // When
         Student dummyStudent = new Student("John", "Smith", new Double[]{65.00, 75.00, 100.00});

        // Then
        String actual = dummyStudent.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFirstName() {
        // Given
        Student dummyStudent = new Student();
        String expected = "John";

        // When
        dummyStudent.setFirstName(expected);
        String actual = dummyStudent.getFirstName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastName() {
        // Given
        String expected = "Smith";

        // When
        Student dummyStudent = new Student("John", "Smith", new Double[]{65.00, 75.00, 100.00});

        // Then
        String actual = dummyStudent.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLastName() {
        // Given
        Student dummyStudent = new Student();
        String expected = "Smith";

        // When
        dummyStudent.setLastName(expected);
        String actual = dummyStudent.getLastName();

        // Then
        Assert.assertEquals(expected, actual);

    }

    

    //setFirstName()

    //getLastName()
    //setLastName()

    //getNumberOfExamsTaken

    //addExamScores(double examScore)  add this to the arraylist of examScores

    //setExamScore(int examID, double changedExamScore)  identify

    //getAverageExamScore() returns sum of Scores / number of exams

    //@Override
    //toString() - returns all student info (first name, last name, etc)


}