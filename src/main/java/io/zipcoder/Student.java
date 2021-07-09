package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.JarEntry;

public class Student {

    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;
    Double[] testScores;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
        this.examScores = new ArrayList(Arrays.asList(testScores));
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTake() { return testScores.length; }

    public String getExamScores() {
        StringBuilder testScoreString = new StringBuilder();
        for (int i = 0; i < examScores.size(); i++) {
            testScoreString.append(testScores[i] + " | ");
        }
        return testScoreString.toString();
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber, newScore);
    }

    public double getAverageExamScore() {
        double sum = 0.0;
        for (int i = 0; i < examScores.size(); i++) {
            sum += examScores.get(i);

        }
        return sum / examScores.size();
    }
    @Override
    public String toString() {
        return String.format("Student Name: %s %s\n" + "Average Score: %s\n" + "Exam Scores: %s", firstName, lastName, getAverageExamScore(), getExamScores());
        //Student Name: Jen
        //Average Score: 80
        //Exam Score 1: 90, 70, 80
    }
}
