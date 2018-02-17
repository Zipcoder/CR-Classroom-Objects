package io.zipcoder;

import java.util.Arrays;

public class Classroom {

    Student[] students;



    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }


    public Student[] getStudents() {
        return this.students;

    }

    public Double getAverageExamScores() {

        double total = 0;
        for (Student student : this.students) {
            total += student.getAverageExamScore();
        }

        return total / students.length;

    }

    public void addStudent(Student student) {


    }

    public String removeStudent(String firstName, String lastName) {
        return null;
    }

    public String getStudentsByScore() {
        return null;
    }

    public String getGradeBook() {
        return null;
    }


}
