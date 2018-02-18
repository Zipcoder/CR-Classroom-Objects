package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> testScores;
    private int examsTaken;
// These are helper methods to assist us with array operations.
    /**
     * Constructor for a student with just their first and last name.
     * You must make a default amount of tests here.
     * @param firstName
     * @param lastName
     */
    //my student constructor
    //this creates a student object that will be inserted into the class array
    public Student(String firstName, String lastName, ArrayList<Double> testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
    }
    //returning the test scores of the student
    public ArrayList<Double> getTestScores(Student student) {
        return this.testScores;
    }

    public String getFirstName(Student student) {
        return this.firstName;
    }

    public String getLastName(Student student) {
        return this.lastName;
    }


    /**
     * What we want here is a string that, if a student hasn't taken any tests, returns a `no tests taken` string.
     * Otherwise, we want to return something kind of like:
     * Test Scores:
     * Test 1 -> 100
     * Test 2 -> 89
     * Test 3 -> 54
     * @return The test scores in a nice string representation.
     */
    //printing the scores of the student and verifying if a test was taken at all
    public void printExamScores(Student student) {
        if (student.testScores.equals(0)) {
            System.out.println("No tests taken");
        }
            else {
            System.out.println(student.testScores);
        }
    }


    /**
     * This function should add the grade in the correct position in the testScores array.
     * Make sure the score is between 0 and 100, and that the student isn't taking more tests than they're supposed to.
     * If there is a problem, print an error message and return false.
     * Otherwise, return true and put the score in the right spot.
     * @param score
     * @return A boolean based on if the operation worked or not.
     */

    public int takeExam(Student student, int score, int examNum) {
        int grade = 0;
        if (examNum > 2) {
        System.out.println("This exam is not valid");
        }
        else if (score < 0 || score > 100){
            System.out.println("This score is invalid");
        }
        else {
            grade = student.testScores.indexOf(examNum);
            grade = score;
        }
        return grade;
//        int examScore = student.testScores.indexOf(examNum);
//        //exam score will equal the index of the exam number
//        return examScore;
    }

    /**
     * Change the score for one of the students tests.
     * Be aware that the new score must be between 0 and 100, and that they have already taken that test
     * since it doesn't make sense to change the grade on an exam that they haven't taken it.
     * @param examNum Which test the we want to change.
     * @param newScore What we want to change it to.
     * @return A boolean based on if the operation worked or not.
     */
    public int changeScoreForExam(Student student, int examNum, int newScore){
        int grade = 0;
        if (examNum > 2) {
            System.out.println("This exam is not valid");
        }
        else if (newScore < 0 || newScore > 100){

            System.out.println("This score is invalid");
        }
        int grade = student.testScores.indexOf(examNum);
        return grade;
    }

    /**
     * Return the average for all of the exams that the student has taken.
     * If they haven't taken any, be nice and give them 100.0.
     * @return The average for all the exams a student has taken.
     */
    public double getAverage(Student student) {
        int x = 0;
        for(int i = 0; i <= this.testScores.size(); i++){
           x += i;
        }
        return x / this.testScores.size();
    }
}
