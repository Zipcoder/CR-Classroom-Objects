package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;        //?
    private Double[] testScores;                 //?
    private int numberOfExamsTaken;

//Constructors
    public Student (){};

    public Student (String firstName){
        this.firstName = firstName;
    }
    public Student (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
    }


    //Methods
    public String getFirstName(){ return firstName;}

    public void setFirstName(String firstName) { this.firstName = firstName;}

    public String getLastName(){ return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}





    //getNumberOfExamsTaken

    //addExamScores(double examScore)  add this to the arraylist of examScores

    //setExamScore(int examID, double changedExamScore)  identify

    //getAverageExamScore() returns sum of Scores / number of exams

    //@Override
    //toString() - returns all student info (first name, last name, etc)

}
