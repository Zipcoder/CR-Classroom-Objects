package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    protected ArrayList<Double> testScores;
    private String examScores;
    private int numberOfExamsTaken;


    public Student(String firstName, String lastName, ArrayList<Double> testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;



    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getExamScores(){
        StringBuilder examScores = new StringBuilder();
        examScores.append("Exam Scores: \n");
        for(int i =0; i<testScores.size(); i++)
            examScores.append("\t\t" + "Exam " + (i + 1) + " --> " + testScores.get(i) + "\n");
        return testScores.toString();

    }

    public ArrayList<Double> getTestScores() {
        return testScores;
    }

    public Integer getNumberOfExamsTaken(){
        return this.numberOfExamsTaken;
    }


}
