package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<Double>();
    // These are helper methods to assist us with array operations.
    private int totalExams;
    private int examsTaken;

    /**
     * How we're going to construct our students when we know how many tests they're going to take
     *
     * @param firstName
     * @param lastName
     * @param examScores
     */
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores.addAll(Arrays.asList(examScores));
    }

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


    public String getExamScores() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= this.examScores.size(); i++) {
            result.append("Exam " + i + " ->  " + this.examScores.get(i - 1));
            result.append("\n");
        }
        return result.toString();
    }

    public void addExamScore(Double[] examScores) {
        this.examScores.addAll(Arrays.asList(examScores));
    }

    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber - 1, newScore);
    }

    public String getAverageExamScore() {
        Double result = 0.0;
        Double counterForDivision = 0.0;
        for (Double entry : examScores) {
            result += entry;
            counterForDivision++;
        }
        result = result / counterForDivision;
        return result.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Student Name: %s %s\n", firstName, lastName));
        result.append(String.format("> Average Score: %s\n", getAverageExamScore()));
        result.append("> Exam Scores:\n");
        result.append(getExamScores());
        return result.toString();
    }
}
