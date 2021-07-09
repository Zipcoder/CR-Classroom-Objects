package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    ArrayList<Double> examScores = new ArrayList<>();
    Double [] testScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.examScores = examScore;

    }

    // ================== GETTERS ================== //
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }


    public int getNumberOfExamsTaken() {
        return testScores.length;
    }


    // ===================== SETTERS =================== //
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public void setExamScores(ArrayList<Double> examScores) {
//        this.examScores = examScores;
//    }


    public void setExamScore(int examNumber, double newScore){
        this.examScores.set(examNumber, newScore);

    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }






}
