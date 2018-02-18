package io.zipcoder;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Classroom {

    private Student[] students;

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

    public double getAverageExamScores() {

        double total = 0;

        for (Student student : this.students) {
            total += student.getAverageExamScore();
        }

        return total / students.length;
    }

    public void addStudent(Student student) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
                this.sortArrayAfterRemoveStudent();
                break;
            }
        }
    }

    // Method called with removeStudentTest //
    public void sortArrayAfterRemoveStudent() {

        Student[] sortedStudents = Arrays.copyOf(this.students, this.students.length);

        int counter = 0;
        for (int i = 0; i < this.students.length; i++) {
            if (students[i] != null) {
                sortedStudents[counter] = students[i];
                counter++;
            }
        }

        // Removes copy at end of array //
        sortedStudents[students.length - 1] = null;

        this.students = sortedStudents;
    }


    public Student[] getStudentsByScore() {

        return null;
    }

    public String getGradeBook() {


        return null;
    }
}

