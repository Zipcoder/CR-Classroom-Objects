package io.zipcoder;

public class Classroom {

    Student[] students;

    public Classroom () {

        this.students = new Student[30];
    }

    public Classroom (int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom (Student[] aStudentArray) {
        this.students = aStudentArray;
    }

    public Student[] getStudents() {
        return null;
        //return this.students;
    }

    public double getAverageExamScore () {
        return 0;
    }

    public void addStudent() {

    }

    public void removeStudent() {

    }

    public Student[] getStudentsByScore() {
        return null;
    }

    public void getGradeBook() {

    }


}
