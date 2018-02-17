package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private Double[] testScores;


    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
        // this.examScores = new ArrayList<Double>(Arrays.asList(testScores));

    }

    public String getFirstName() {
        return firstName;
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

    public Double[] getTestScores(){
        return testScores;
    }

    public int getNumberOfExamsTaken(){
        return testScores.length;
    }

    public String getExamScores (){
        String listExamScores="";
        int count = 1;
        for(int i = 0; i < testScores.length; i++) {
            listExamScores += "Exam " + count++ + " -> " + testScores[i] + "\n";
        }
        return listExamScores.trim();
    }

    public Double[] addExamScore() {
        this.testScores.add

        //return testScores.add(testScores);
        return testScores;
    }



//    public ArrayList<Double> getTestScores (){
//        return examScores;
//    }



    public void setExamScores(int examNumber, double newScore){

    }
//    public double getAverageExamScore(){
//        return averageExamScore;
//    }
//
//
//
//    @Override
//    public String toString(){
//
//
//        return newString;
//
//    }



}

