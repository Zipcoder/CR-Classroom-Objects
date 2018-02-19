package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> testScores;
    private int examsTaken;
    private double examNum;
// These are helper methods to assist us with array operations.

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

    public Double getTestScore(Student student){
        return Double.valueOf(student.testScores.indexOf(examNum));
    }

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

    public int changeScoreForExam(Student student, int examNum, int newScore) {
        int grade = 0;
        if (examNum > 2) {
            System.out.println("This exam is not valid");
        } else if (newScore < 0 || newScore > 100) {
            System.out.println("This score is invalid");
        }
        else if (0 == student.testScores.indexOf(examNum)) {
            System.out.println("This exam has not been taken");
        }
        else {
            grade = student.testScores.indexOf(examNum);
        grade = newScore;
    }

        return grade;
    }

    public double getAverage(Student student) {
        int x = 0;
        for(int i = 0; i <= this.testScores.size(); i++){
           x += i;
        }
        return x / this.testScores.size();
    }
}
