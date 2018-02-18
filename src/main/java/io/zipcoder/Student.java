package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName) {
        this(firstName, lastName, new Double[0]);
    }

    public Student(String firstName, String lastName, Double[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        examScores.addAll(Arrays.asList(scores));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public void takeExam(double score) {
        examScores.add(score);
    }

    public void updateExamScore(int examNumber, double newScore) {
        if (examScores.size() < examNumber)
            examScores.add(newScore);
        else
            examScores.set(examNumber - 1, newScore);
    }

    public double getAverage() {
        double sum = 0.0;
        for (double d : examScores) {
            sum += d;
        }
        return Math.round(sum / examScores.size());
    }

    /**
     * compare lexicographically by last name;
     */
    private int compareByLastName(Student o) {
        return this.getLastName().compareTo(o.getLastName());
    }

    /**
     * compare lexicographically by first name, if first names
     * are the same, use last name...
     */
    private int compareByFirstName(Student o) {
        int r = this.getFirstName().compareTo(o.getFirstName());
        return (r == 0) ? compareByLastName(o) : r;
    }

    /**
     * first use Double.compareTo on averageScore, if equal scores,
     * compare lexicographically by first name...
     */
    @Override
    public int compareTo(Student o) {
        int r = Double.compare(this.getAverage(), o.getAverage());
        return (r == 0) ? compareByFirstName(o) : r;
    }
}
