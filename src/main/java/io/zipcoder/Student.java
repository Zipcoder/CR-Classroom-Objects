package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(examScores);
        this.examScores = examScores;
    }
    public Student(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(examScores);
        this.examScores = examScores;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
       this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfExamsTaken() {
        return this.examScores.size();
    }

    public String getExamScores() {
        StringBuilder scores = new StringBuilder("Exam Scores:");
        for(int i = 0; i < this.examScores.size(); i++) {
            scores.append("\n\tExam ")
                    .append(i+1)
                    .append(" -> ")
                    .append(Math.round(examScores.get(i)));
        }
        return scores.toString();
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScore(int test, double examScore) {
        this.examScores.set(test-1, examScore);
    }

    //for use in getAverageExamScore and also Classroom method getAverageExamScores
    public double accessTotalExamsScore() {
        double totalScore = 0.0;
        for(int i = 0; i < examScores.size(); i++) {
            totalScore += this.examScores.get(i);
        }
        return totalScore;
    }


    public int getAverageExamScore() {
        double totalScore = 0.0;
        for(int i = 0; i < examScores.size(); i++) {
            totalScore += this.examScores.get(i);
        }
        int average = (int) Math.round(totalScore / examScores.size());
        return average;
    }

    @Override
    public String toString() {
        return "\nStudent Name: " + this.firstName + " "
                + this.lastName + "\nAverage Score: " + this.getAverageExamScore()
                + "\n" + this.getExamScores();
    }
}
