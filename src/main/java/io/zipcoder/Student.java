package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {


    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        /**converted array of doubles to an ArrayList class and used asList method
         * potential future issues. THis solution will not allow you to dynamically
         * change the size of the list*/
        this.examScores = new ArrayList(Arrays.asList(testScores));
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

    public ArrayList<Double> getTestScores() {
        return examScores;
    }

    public int getNumberofExamsTaken() {
        //.size returns number of elements in an array
        return examScores.size();
    }




}


