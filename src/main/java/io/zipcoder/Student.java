package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        Collections.addAll(this.examScores, testScores);
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

    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public String getExamScores() {
        int index = 1;
        String result = "Exam Scores:\n";
        for (Double score: examScores) {
            result += "Exam " + index + " -> " +score + "\n";
            index++;
        }
        return result;
    }

    public void addExamScore(double newScore) {
        examScores.add(newScore);
    }

    public void setExamScore(int index, double newScore) {
        examScores.set(index - 1, newScore);
    }

    public Double getAverageExamScore() {
        Double allExamScore = 0.0;
        for (Double score: examScores) {
            allExamScore += score;
        }
        return allExamScore/examScores.size();
    }
}
