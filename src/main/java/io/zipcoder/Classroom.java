package io.zipcoder;

import java.util.ArrayList;
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
        this(30);
    }

    public Student[] getStudents() {

        return students;
    }


    public double getAverageExamScore() {
        double count = 0;
        double sum = 0;

        for (Student student : students) {
            count++; //getting count so we can divide average by amount of students to get overall average
            if (student != null) { //Checking that the student object exists
                sum += student.getAverageExamScore(); //gettingAverage for each student
            }
        }
        return sum / count;
    }

    public String addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) { //check that no student exists
                students[i] = student;
                return student.toString();
            }
        }
        return "Classroom is full";
    }

    public boolean removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i]; //create object student for students[i] as placeholder for if statement.
            if (student != null && student.getFirstName().contains(firstName) &&
                    student.getLastName().contains(lastName)) {
                students[i] = null;
                this.moveNull();
                return true;
            }
        }
        return false;
    }

    public void moveNull() {
        Student[] copyArray = Arrays.copyOf(students, students.length);

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) copyArray[i] = students[i];
        }
        copyArray[students.length - 1] = null;
        students = copyArray;
    }

    public String getStudentsByScore(double v, double v1, double v2, double v3) {
        ArrayList<Student> studentScore = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null)
                studentScore.add(students[i]);
        }
        return studentScore.toString();

    }
    public void getGradeBook() {
    }
}
