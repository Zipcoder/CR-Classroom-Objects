package io.zipcoder;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classroom {
    public Student[] students;

    public Classroom(int maxNumberOfStudents) {

    }

    public Classroom(Student[] students) {

    }

    public Classroom() {
        Student[] students = new Student[30];

    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScores() {
        double avgScore = 0;
        double summ = 0;
        for (int i = 0; i < students.length; i++) {
            summ += students[i].getAverageExamScore();
            avgScore = summ / students.length;

        }
        return avgScore;
    }

    public void addStudent(Student student) {
        Student[] temp = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().length() > 0) {
                temp[i] = students[i];
            } else {
                temp[i] = student;
                break;
            }
        }
        Student[]students = new Student[temp.length];
        for (int i = 0; i < students.length; i++){
            students[i] = temp[i];
        }
        System.out.println(students);
    }

        public int getNumberOfStudents () {
            int count = 0;
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null && students[i].getFirstName().length() > 0) {
                    count++;

                }
            }
            return count;
        }
    }






