package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList(Arrays.asList(examScores));
    }
    public String getFirstName(){
        return firstName;
}
    public void setFirstName(String newName){
        firstName = newName;
}
    public String getLastName(){
        return lastName;
}
    public void setLastName(String newLastName){
        lastName = newLastName;
}
    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }
    public String getExamScores(){
        return "Exam Scores:\n" +
                "\n\tExam 1 -> " + examScores.get(0) +
                "\n\tExam 2 -> " + examScores.get(1) +
                "\n\tExam 3 -> " + examScores.get(2) +
                "\n\tExam 4 -> " + examScores.get(3);
    }
}
