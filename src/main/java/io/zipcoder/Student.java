package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List<Double> testScores;

    /**
     * Constructor for a student with just their first and last name.
     * You must make a default amount of tests here.
     * @param firstName
     * @param lastName
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = new LinkedList<Double>(Arrays.asList(examScores));

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExamsTaken() {

        return testScores.size();

    }

    /**
     * What we want here is a string that, if a student hasn't taken any tests, returns a `no tests taken` string.
     * Otherwise, we want to return something kind of like:
     * Test Scores:
     * Test 1 -> 100
     * Test 2 -> 89
     * Test 3 -> 54
     * @return The test scores in a nice string representation.
     */
    public String getExamScores() {
        StringBuilder examScores = new StringBuilder();
        examScores.append("> Exam Scores:\n");
        for(int i = 0; i < testScores.size(); i++) {
            examScores.append("\t\tExam " + (i + 1) + " -> " + new Double(testScores.get(i)).intValue() +"\n");
        }
        return examScores.toString();
    }

   public void addExamScore(Double examScore) {
        this.testScores.add(examScore);
   }

   public void setExamScore(int index, Double newExamScore) {
        this.testScores.set(index, newExamScore);
   }

   public Double getAverageExamScore() {
        double sum = 0;
        for(int index = 0; index < this.testScores.size(); index++) {
            sum += this.testScores.get(index);
            }
       return sum/this.testScores.size();
   }

   @Override
   public String toString() {
        String formattedOutput = "Student Name: " + this.firstName + " " + this.lastName +
                                 "\n> Average Score: " + new Double(this.getAverageExamScore()).intValue() +
                                 "\n" + this.getExamScores()
                                 ;

        return formattedOutput;
   }

    public static Comparator<Student> averageGradeComparator = new Comparator<Student>() {

        public int compare(Student student1, Student student2) {

                int firstAverage = new Double(student1.getAverageExamScore()).intValue();
                int secondAverage = new Double(student2.getAverageExamScore()).intValue();

                return secondAverage - firstAverage;

        }

    };

}
