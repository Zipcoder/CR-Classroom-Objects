package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    // These are helper methods to assist us with array operations.
    private int totalExams;
    private int examsTaken;

    /**
     * How we're going to construct our students when we know how many tests they're going to take
     * @param firstName
     * @param lastName
     * @param examScores
     */
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores.addAll(Arrays.asList(examScores));
    }

    /**
     * Constructor for a student with just their first and last name.
     * You must make a default amount of tests here.
     * @param firstName
     * @param lastName
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotalExams() {
        return this.totalExams;
    }

    public void setTotalExams(int totalExams) {
        this.totalExams = totalExams;
    }

    public int getExamsTaken() {
        return this.examsTaken;
    }


    public String getExamScores(){
        return null;
    }

    public String addExamScore(Double[] examScores){
        return null;
    }

    public String setExamScore(int examNumber, double newScore){
        return null;
    }

    public String getAverageExamScore(){
        return null;
    }

    @Override
    public String toString(){
        return null;
    }
}
