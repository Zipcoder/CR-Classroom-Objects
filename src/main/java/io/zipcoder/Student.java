package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private Integer numberOfExamsTaken;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public ArrayList<Double> getTestScores() {
        return examScores;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return numberOfExamsTaken;
    }

    protected String getExamScores(){
        StringBuilder listOfScores = new StringBuilder();
        listOfScores.append("Exam Scores:");
        listOfScores.append("\n");
       for (int i = 0; i < examScores.size(); i++){
           listOfScores.append("Exam " + (i + 1) + ": " + examScores.get(i) + "\n");
       }
       return listOfScores.toString();
    }

    protected ArrayList<Double> addExamScore(double examScore){
        examScores.add(examScore);
        return examScores;
    }

    protected ArrayList<Double> setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
        return examScores;

    }

    protected 

}
