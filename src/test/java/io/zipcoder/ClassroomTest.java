package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;



public class ClassroomTest {
    Student stinkyPete;
    Student smellyPeter;
    Student sugarySam;
    Student juicyJoe;
    Student terribleTariq;
    Classroom test;



    @Before
    public void setUp() {
        stinkyPete = new Student("Stinky", "Pete", new Double[]{100.0, 50.25, 25.3});
        smellyPeter = new Student("Smelly", "Peter", new Double[]{99.0, 100.0, 91.0});
        sugarySam = new Student("Sugary", "Sam", new Double[]{75.0, 82.0, 91.0});
        juicyJoe = new Student("Juicy", "Joe", new Double[]{83.0, 29.87, 88.5});
        terribleTariq = new Student("Terrible", "Tariq", new Double[]{100., 100.0, 100.});
        test = new Classroom(new Student[]{stinkyPete, smellyPeter, sugarySam, juicyJoe, terribleTariq});

    }

    @Test
    public void getStudentsTest(){
        //Given
        //Classroom test

        //When
        Student [] expected = {stinkyPete, smellyPeter, sugarySam, juicyJoe, terribleTariq};
        Student [] actual = test.getStudents();

        //Then
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void nullaryClassroomTest(){
        //Given
        Classroom nullaryTest = new Classroom();

        //When
        int expectedSize = 30;
        int actualSize = nullaryTest.getStudents().length;

        //Then
        Assert.assertEquals(actualSize,expectedSize);
    }

    @Test
    public void maxClassroomSizeTest(){
        //Given
        Classroom maxSizeTest = new Classroom(20);

        //When
        int expectedSize = 20;
        int actualSize = maxSizeTest.getStudents().length;

        //Then
        Assert.assertEquals(actualSize,expectedSize);
    }

    @Test
    public void getAverageExamScoreTest(){
        //Given
        //Classroom test

        //When
        double expectedAverage = 81.0;
        double actualAverage = test.getAverageExamScore();

        //Then
        Assert.assertEquals(expectedAverage,actualAverage, 0.01);
    }

    @Test
    public void addStudentTest(){
        //Given
        Classroom toBeAddedTo = new Classroom(0);
        Student lazyLeon = new Student("Lazy", "Leon", new Double[]{0.0, 50.0, 100.0});



        //When
        toBeAddedTo.addStudent(lazyLeon);
        String expected =
                "[Student Name: Lazy Leon\n"+
                        "Average Score = 50.0\n"+
                        "Exam Scores:\n"+
                        "\tExam 1 => 0\n" +
                        "\tExam 2 => 50\n" +
                        "\tExam 3 => 100\n]";
        String actual = Arrays.toString(toBeAddedTo.getStudents());

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeStudentTest(){
        //Given
        //Classroom test

        //When
        test.removeStudent("Stinky", "Pete");
        Student [] expected = {smellyPeter, sugarySam, juicyJoe, terribleTariq, null};
        Student [] actual = test.getStudents();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getStudentsByScoreTest(){
        //Given
        //Classroom test
        Student franticFroilan = new Student("Frantic", "Froilan",new Double[]{100., 100.0, 100.});
        test.addStudent(franticFroilan);

        //When
        Student [] expected = {franticFroilan, terribleTariq, smellyPeter, sugarySam, juicyJoe, stinkyPete};
        Student[] actual = test.getStudentsByScore();


        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getStudentsByScoreSimilarNameTest(){
        //Given
        //Classroom test
        Student franticFroilan = new Student("Frantic", "Froilan",new Double[]{100., 100.0, 100.});
        Student franticFroilaz = new Student("Frantic", "Froilaz",new Double[]{100., 100.0, 100.});
        test.addStudent(franticFroilaz);
        test.addStudent(franticFroilan);


        //When
        Student [] expected = {franticFroilan, franticFroilaz, terribleTariq, smellyPeter, sugarySam, juicyJoe, stinkyPete};
        Student[] actual = test.getStudentsByScore();


        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getStudentsByScoreSameLastNameTest(){
        //Given
        //Classroom test
        Student franticFroilan = new Student("Frantic", "Froilan",new Double[]{100., 100.0, 100.});
        Student fineFroilan = new Student("Fine", "Froilan",new Double[]{100., 100.0, 100.});
        test.addStudent(franticFroilan);
        test.addStudent(fineFroilan);


        //When
        Student [] expected = {fineFroilan, franticFroilan, terribleTariq, smellyPeter, sugarySam, juicyJoe, stinkyPete};
        Student[] actual = test.getStudentsByScore();


        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void identifyStudentTest(){
        //Given
        //Classroom test

        //When
        Student expected = terribleTariq;
        Student actual = test.identifyStudent("Terrible", "Tariq");

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void identifyStudentIndexTest(){
        //Given
        //Classroom test

        //When
        int expected = 4;
        int actual = test.identifyStudentIndex(terribleTariq);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void moveNullToEndTest(){
        //Given
        Student franticFroilan = new Student ("Frantic", "Froilan", new Double[]{100.0, 75.0, 88.0});
        Student lazyLeon = new Student("Lazy", "Leon", new Double[]{0.0, 50.0, 100.0});
        Student [] test = {null, franticFroilan, lazyLeon};
        Classroom reorderTest = new Classroom (test);


        //When
        reorderTest.moveNullToEnd();
        Student [] expected = {franticFroilan, lazyLeon, null};
        Student [] actual = reorderTest.getStudents();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void reverseSortTest(){
        //Given

    }

}
