package io.zipcoder;

import java.util.ArrayList;

public class Classroom extends Student {

    private Student[] students;
    private ArrayList<Double> studentScores = new ArrayList<>();
    public Classroom(int maxNumberOfStudents){

    }
    public Classroom(Student[] students ){
        this.students = students;

    }
    public Classroom(){
    this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Double getAverageExamScore(){
        Double average=0.0;
        Double total=0.0;
        for (int i = 0; i < students.length; i++) {
        total+=students[i].getAverageExamScore();
            average=total/ students.length;
        }
        return average;
    }
}
