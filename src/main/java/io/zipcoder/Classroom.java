package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
    // Declaring variables
    public int maxNumOfStudents;
    Student[] students = new Student[30];
    ArrayList<Student> studentsList = new ArrayList();

    public Classroom(int maxNumOfStudents){
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(){
    }

    public ArrayList<Student> getStudents(){
        return studentsList;
    }

    public Double getAverageExamScore() {
        Double totalExams = 0.0;
        for (int i = 0; i < students.length; i++) {
            totalExams += students[i].getAverageExamScore();
        }
        return totalExams / students.length;
    }

    public void addStudent(Student student1) {
        studentsList.add(student1);
    }

    public void removeStudent(Student firstName, Student lastName) {
        for (int i = 0; i < studentsList.size(); i++) {
            if(studentsList.get(i).firstName.equals(firstName) && studentsList.get(i).lastName.equals(lastName)){
                studentsList.remove(i);
            }

        }
    }


























}
