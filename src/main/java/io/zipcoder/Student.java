package io.zipcoder;

import java.util.ArrayList;

public class Student  {

    private Double[] testScores = new Double[0];
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public Double[] getTestScores() {
        return this.testScores;
    }

    public ArrayList<Double> getExamScores(String firstName,String lastName,Double[] examScores) {

        return this.examScores;
    }
    public Integer getNumberOfExamScores() {
        return  this.getNumberOfExamScores();
    }

}