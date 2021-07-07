package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private Integer examsTaken;


    public Student(String firstname, String lastName, Double[] testScores) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();

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
        return examsTaken;
    }

    public String getExamScores(){
        StringBuilder score= new StringBuilder();
        for (int i = 0; i < examScores.size(); i++) {
            score.append("Exam "+ i+1+ " -> " +examScores.get(i));
        }
        return score.toString();

    }


}
