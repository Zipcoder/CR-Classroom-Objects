package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName= firstName;
        this.lastName = lastName;
        this.examScores= examScores;

    }

    public String getFirstName() {
        return this.firstName;
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
        return this.examScores.size();
    }

    public Double addExamScore(){
        return null;
    }

    public ArrayList<Double> setExamScore(int examNumber, double newScore) {
        return null;
    }

    public double getAverageExamScore() {
        return 0.0;
    }

    public String toString() {
        return null;
    }





}
