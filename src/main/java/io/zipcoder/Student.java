package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        this.examScores.addAll(Arrays.asList(examScores));

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

    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public String getExamScores(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<examScores.size(); i++){
            builder.append("Exam " + (i+1) + " => " + examScores.get(i) + "\n");
        }
        return builder.toString();
    }

    public void addExamScore(Double newScore){
        examScores.add(newScore);
    }

    public void setExamScore(int examIndex, Double newScore){

    }

    public Double getAverageExamScore(){
        return null;
    }

    @Override
    public String toString(){
        return null;
    }








}
