package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String aFirstName, String aLastName, Double[] testScores) {
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.examScores = new ArrayList<>();
        this.examScores.addAll(Arrays.asList(testScores));
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String newFirstName) {

        this.firstName = newFirstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String newLastName) {

        this.lastName = newLastName;
    }


    public int getNumberOfExamsTaken() {

        return examScores.size();
    }

    public String getExamScores() {
        StringBuilder toAppendExamScores = new StringBuilder();
        for (int i = 0; i < examScores.size(); i++) {
            toAppendExamScores.append("\tExam " + (i + 1) + " -> " + examScores.get(i) + "\n");
        }

        return toAppendExamScores.toString();
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);

    }

    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber - 1, newScore);
    }

    public double getAverageExamScore() {

        double totalScore = 0;
        for (Double indexScore : this.examScores) {
            totalScore += indexScore;
        }

        double averageExamScore = totalScore / examScores.size();

        return averageExamScore;
    }

    @Override
    public String toString() {

        StringBuilder toStringOverride = new StringBuilder();

        toStringOverride.append("Student Name: " + this.firstName + " " + this.lastName);
        toStringOverride.append("\n> Average Score: " + getAverageExamScore() + "\n> Exam Scores:\n");
        toStringOverride.append(getExamScores());

        return toStringOverride.toString();
    }

}
