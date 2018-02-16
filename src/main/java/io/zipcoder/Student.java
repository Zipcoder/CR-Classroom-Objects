package io.zipcoder;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> testScores;
    // These are helper methods to assist us with array operations.
    private int totalExams;
    private int examsTaken;

    /**
     * Constructor for a student with just their first and last name.
     * You must make a default amount of tests here.
     * @param firstName
     * @param lastName
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = new ArrayList<Double>();
        this.examsTaken = 0;
    }

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = new ArrayList<Double>();
        for (Double score: testScores) {
            this.testScores.add(score);
        }
        this.totalExams = testScores.length;
        this.examsTaken = testScores.length;
    }

    /**
     * How we're going to construct our students when we know how many tests they're going to take
     * @param firstName
     * @param lastName
     * @param totalExams
     */
    public Student(String firstName, String lastName, int totalExams) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = new ArrayList<Double>();
        testScores.ensureCapacity(totalExams);
        this.totalExams = totalExams;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotalExams() {
        return totalExams;
    }

    public void setTotalExams(int totalExams) {
        this.totalExams = totalExams;
    }

    public int getExamsTaken() {
        return testScores.size();
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
    public String printExamScores() {
        StringBuilder display = new StringBuilder();
        display.append("Test Scores: \n");
        int i = 1;
        for (Double testscore : this.testScores){
            display.append("Test " + i + " -> " + testscore + "\n");
            i++;
        }
        return display.toString();
    }

    /**
     * This function should add the grade in the correct position in the testScores array.
     * Make sure the score is between 0 and 100, and that the student isn't taking more tests than they're supposed to.
     * If there is a problem, print an error message and return false.
     * Otherwise, return true and put the score in the right spot.
     * @param score
     * @return A boolean based on if the operation worked or not.
     */
    public boolean takeExam(Double score) {
        if (this.totalExams > this.examsTaken){
            this.testScores.add(score);
            return true;
        }
        return false;
    }

    /**
     * Change the score for one of the students tests.
     * Be aware that the new score must be between 0 and 100, and that they have already taken that test
     * since it doesn't make sense to change the grade on an exam that they haven't taken it.
     * @param examNum Which test the we want to change.
     * @param newScore What we want to change it to.
     * @return A boolean based on if the operation worked or not.
     */
    public boolean changeScoreForExam(int examNum, Double newScore){
        if (testScores.get(examNum - 1) > -1) {
            this.testScores.set(examNum - 1, newScore);
            return true;
        }
        return false;
    }

    /**
     * Return the average for all of the exams that the student has taken.
     * If they haven't taken any, be nice and give them 100.0.
     * @return The average for all the exams a student has taken.
     */
    public Double getAverage() {
        double average = 0.0;
        if (this.examsTaken > 0){
            for (Double score: testScores) {
                average += (score * 10);
            }
            DecimalFormat grading = new DecimalFormat("#.##");
            return Double.parseDouble(grading.format((average/10)/examsTaken));
        }
        return 100.0;
    }
}
