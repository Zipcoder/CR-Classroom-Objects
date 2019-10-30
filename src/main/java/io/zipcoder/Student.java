package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List<Double> examScores = new ArrayList<>();



    public Student(String firstName, String lastName, List<Double> examScores) {
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

    public String getExamScores(){
        StringBuilder sbScores = new StringBuilder();

        System.out.println("Exam Scores : \n");
        for(int i = 0; i < getNumberOfExamsTaken();i++){
//            System.out.println("Exam " + i+1 + " -> " + examScores.get(i));
            sbScores.append("Exam " + i+1 + " -> " + examScores.get(i));
        }
        return sbScores.toString();
    }

    public void addExamScore(Double examScore){
        examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        examScores.set(examNumber,newScore);
    }

    public Double getAverageExamScore(){
        Double total = 0.0 ;
        for(int i =0; i < getNumberOfExamsTaken();i++){
            total += examScores.get(i);
        }
        return total/examScores.size();
    }
    public String toString(){
        String nameLine = "Student Name : " + getFirstName()  + " " + getLastName() + "\n";
        String avgLine = "Average Score : " + getAverageExamScore() + "\n";
        String examLines = getExamScores();

        return nameLine + avgLine + examLines;
    }
}
