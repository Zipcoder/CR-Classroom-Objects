import io.zipcoder.Student;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassRoomTest {

    @Test
    public void nullaryConstructorTest(){
            // Given
            ArrayList<Student> expectedStudents = new ArrayList<Student>(30);

            // When
            Classroom testClass = new Classroom();

            // Then
            ArrayList<Student> actualStudents = testClass.getStudents();

            Assert.assertEquals(expectedStudents, actualStudents);
        }


    @Test
    public void maxStudentsConstructorTest(){
        // Given
        Integer expected = 25;

        // When
        Classroom testClass  = new Classroom(expected);

        // Then
        Integer actual = testClass.getMaxNumOfStudents();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getStudentsTest(){
        ArrayList<Double> examScoresTest = new ArrayList(Arrays.asList(85D, 75D, 90D ));
        ArrayList<Double> examScoresTest2 = new ArrayList(Arrays.asList(88D, 90D, 92D ));
        ArrayList<Double> examScoresTest3 = new ArrayList(Arrays.asList(88D, 90D, 92D ));

        Student testStudent1 = new Student("Peter", "Moogie", examScoresTest);
        Student testStudent2 = new Student("Pope", "John Paul", examScoresTest2);
        Student testStudent3 = new Student("May", "West", examScoresTest3);

        ArrayList<Student> expectedStudents = new ArrayList<Student>(Arrays.asList(testStudent1, testStudent2, testStudent3));

        Classroom testClass = new Classroom(expectedStudents);

       ArrayList<Student> actual = testClass.getStudents();

       Assert.assertEquals(expectedStudents, actual);


    }

    @Test
    public void studentObjectsConstructorTest(){
        // Given
        ArrayList<Double> examScoresTest = new ArrayList(Arrays.asList(85D, 75D, 90D ));
        ArrayList<Double> examScoresTest2 = new ArrayList(Arrays.asList(88D, 90D, 92D ));
        ArrayList<Double> examScoresTest3 = new ArrayList(Arrays.asList(88D, 90D, 92D ));

        Student testStudent1 = new Student("Peter", "Moogie", examScoresTest);
        Student testStudent2 = new Student("Pope", "John Paul", examScoresTest2);
        Student testStudent3 = new Student("May", "West", examScoresTest3);

        ArrayList<Student> expectedStudents = new ArrayList<Student>(Arrays.asList(testStudent1, testStudent2, testStudent3));

        // When
        Classroom testClass = new Classroom(expectedStudents);

        // Then
        ArrayList<Student> actualStudents = testClass.getStudents();

        Assert.assertEquals(expectedStudents, actualStudents);
    }

    @Test
    public void getAverageExamScoreTest () {
        // : Given
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100.0, 150.0));
        ArrayList<Double> s2Scores = new ArrayList<>(Arrays.asList(225.0, 25.0));

        Student testStudent1 = new Student("student", "one", s1Scores);
        Student testStudent2 = new Student("student", "two", s2Scores);

        ArrayList<Student> testStudents = new ArrayList<Student>(Arrays.asList(testStudent1, testStudent2));
        Classroom classroom = new Classroom(testStudents);

        // When
        Double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);

    }

    @Test
    public void addStudentTest(){
        Classroom classroom = new Classroom(3);
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(100.0, 150.0));
        ArrayList<Double> s2Scores = new ArrayList<>(Arrays.asList(225.0, 25.0));

        Student testStudent1 = new Student("Petey", "Pablo", s1Scores);
        Student testStudent2 = new Student("Lil", "Jon", s2Scores);

        ArrayList<Student> testStudents = new ArrayList<Student>(Arrays.asList(testStudent1));

        String expected = ("\n========================================\n" + "Student Name: Lil Jon\n" +
                "Average Score: 125.0\n" + "Exam Scores:\n" + "\tExam 1 -> 225.0\n" + "\tExam 2 -> 25.0\n"
                + "========================================");

        String actual = classroom.addStudent(testStudent2);
        Assert.assertEquals(expected, actual);

        //{ System.out.println(actual);
    }


    }




