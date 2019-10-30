package io.zipcoder;

import java.util.Arrays;
import java.util.Collections;

public class Classroom {
    Student[] students;
    int MaxNumberOfStudents;


    public Classroom(int MaxNumberOfStudent){
        MaxNumberOfStudents = MaxNumberOfStudent;

    }
    public Classroom(Student[] allStudents){
        this.students = allStudents;

    }
    public Classroom(){
        this.students = new Student[30];

    }

    public Student[] getStudents() {

        return students;
    }

    public Double getAverageExamScore(){
        Double average = 0.0;
        for(int i = 0; i < students.length; i++){
            average += students[i].getAverageExamScore();
        }
        return average/students.length;
    }
    public void addStudent(Student student){
        students = new Student[MaxNumberOfStudents];
        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }

    }

    public void removeStudent(String firstName, String lastName){
        students = new Student[MaxNumberOfStudents];
        for(int i = 0; i < students.length; i++){
            for (int j = 0; j < students.length-i-1; j++) {
                if(students[i].equals(students[i].getFirstName()) && students[i].equals(students[i].getLastName())) {
                    students[i] = null;
                    if(students[i] == null){

                    }
    
                }
            }
        }
    }

    public Student[] getStudentsByScore() {

        //order from largest to smallest.
        Arrays.sort(students, Collections.reverseOrder());
        return students;
    }

}
