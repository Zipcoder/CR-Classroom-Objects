package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(){

    }

    public Student (String firstName, String lastName, Double[] testScores) {
        this.firstName =firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        this.examScores.addAll(Arrays.asList(testScores));

    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getTestScore() {
        return 0;
    }

    public int getNumberOfExamsTaken() {
        int tests = 0;
        for (int i = 0; i<examScores.size(); i++) {
            tests++;
        }

        return tests;
    }

    public String getExamScores() {
        StringBuilder allExamScores = new StringBuilder();
        allExamScores.append("Exam Scores:\n");
        for (int i = 0; i < examScores.size(); i++) {
            allExamScores.append("\tExam " + (i + 1) + " -> " + examScores.get(i) + "\n");
        }

        return allExamScores.toString().trim();
    }

    public double addExamScore(Double examScore){
        return 0;
    }

    public void setExamScore(int examNumber, Double newScore) {

    }

    public double getAverageExamScore() {
        return 0;
    }

    public String toString() {
        return null;
    }


}


