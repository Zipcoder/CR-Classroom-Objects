package io.zipcoder;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScoresList;
    private Double[] examScoresArr;
    private Double oneExam;

    public String results;
    public String output;
//Constructors
    public Student (){};

    public Student (String firstName){
        this.firstName = firstName;
    }
    public Student (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Student(String firstName, String lastName, Double[] examScoresArr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScoresArr = examScoresArr;
        //this.oneExam = oneExam;
    }

//Methods
    public String getFirstName(){ return firstName;}

    public void setFirstName(String firstName) { this.firstName = firstName;}

    public String getLastName(){ return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public Integer getNumberOfExamsTaken(){ return examScoresArr.length;}

    public String showExamScores(){

        StringBuilder output = new StringBuilder();
            for (int i = 0; i < examScoresArr.length; i++){
               output.append("Exam" + (i+1) + "->" + examScoresArr[i]+ "\n");
            }
        System.out.println("Exam Scores:");
           return output.toString();
        }


    public void addExamScore(Double oneExam){
        ArrayList<Double> examScoresList = new ArrayList<>(Arrays.asList(examScoresArr));   //Convert Array into ArrayList
         examScoresList.add(oneExam);                                                             //Add new Exam
         Double [] examScoresArr = examScoresList.toArray(new Double[examScoresList.size()]);    //Convert ArrayList back to Array

    }




}




    //addExamScores(double examScore)  add this to the arraylist of examScores

    //setExamScore(int examID, double changedExamScore)  identify

    //getAverageExamScore() returns sum of Scores / number of exams

    //@Override
    //toString() - returns all student info (first name, last name, etc)


