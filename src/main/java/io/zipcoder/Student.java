package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();


    public Student(String firstName, String lastName, Double[] testSccores) {
        this.firstName = firstName;
        this.lastName = lastName;

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

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void getExamScores(ArrayList<Double> examScores){
        System.out.println("Exam Scores : \n");
        for(int i = 0; i < examScores.size();i++){
            System.out.println("Exam " + i+1 + " -> " + examScores.get(i));
        }
    }

    public void addExamScore(Double examScore){
        examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        examScores.set(examNumber,newScore);

    }
}
