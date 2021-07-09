package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();
    Double [] testScores;
    public Student (String firstName, String lasName, Double [] testScores){

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

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

   // public void setExamScores(ArrayList<Double> examScores) {

       // this.examScores = examScores;
   // }

    public Double[] getTestScores() {
        return testScores;
    }

    public void setTestScores(Double[] testScores) {

        this.testScores = testScores;
    }

    public int getNumberOfExamsTaken(){
        return testScores.length;
    }

   public String GetExamScores(double examScores){
        return Arrays.toString(testScores);
   }

    public void addExamScores(double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        this.examScores.set(examNumber,newScore);
    }

    public double getAverageExamScore(){
        double sum = 0;
        for (int i = 0; i < testScores.length; i++) {
             sum += examScores.get(i);
        }
        return sum;
    }

   @Override
    public String toString(){
        return "NAME: " + firstName + " " + lastName + '\n' +
                "Average Score: " + getAverageExamScore() + '\n' +
                "Exam Scores: " + getExamScores();



       /*" NAME: " + firstName + lastName + "/n",
                " Avrg Exam Score : " + getAverageExamScore() + "/n",
                "Exam Score : " + getExamScores();*/




    }

}
