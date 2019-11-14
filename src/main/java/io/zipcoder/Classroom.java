package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
    Student[] students;
    int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudent){
        maxNumberOfStudents = maxNumberOfStudent;
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

}
