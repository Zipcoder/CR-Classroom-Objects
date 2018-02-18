package io.zipcoder;

import java.util.Arrays;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }
    public Classroom() {
        students = new Student[30];
    }
    public Student[] getStudents() {

        return students;
    }
    public Double getAverageExamScore() {
        Double totalAverages =0.0;
        for (Student student : students) {
            totalAverages += student.getAverageExamScore();
        } return totalAverages/students.length;
    }
    public void addStudent(Student student) {
        int studentCount = 0;
        for (int i =0; i < students.length ; i++) {
            if (students[i] != null){
                studentCount++;
            }
        } students[studentCount]= student;
    }

    public void removeStudent(String firstName, String lastName) {
        boolean removed=false;
        for (int i=0;i < students.length; i++) {
             if (students[i] != null) {
                if (students[i].getFirstName().equals(firstName)
                        && students[i].getLastName().equals(lastName) && i == students.length-1) {
                    students[i] = null;

                }
                 else if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                     removed =true;
                 } if (removed && i < students.length -1) {
                    students[i] = students[i+1];
                 } if (removed && i == students.length -1) {
                    students[i] = null;
                 }
            }
        }
    }

    public Student[] getStudentsByScore() {

    }
}
