package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

        private Student[] students;
        private int maxNumOfStudents;


        public Classroom() {
                this.students = new Student[30];
        }

        public Classroom(int maxNumOfStudents){
                this.students = new Student[maxNumOfStudents];

        }

        public Classroom(Student...students){
                this.students = students;
        }

        public Student[] getStudents() {
                return students;
        }

        public double getAverageExamScore(){
                double total = 0;
                for (Student s: students){
                       total+= s.getAverageExamScore();
                }

                double average = total/(getStudents().length);

                return average;
        }

        public void addStudent(Student student) {
                for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                                students[i] = student;
                        }

                }

        }

//                ArrayList <Student> newEnrollment = new ArrayList<>(Arrays.asList(students));
//
//                        newEnrollment.add(student);
//
//
//             this.students = newEnrollment.toArray(new Student[0]);

        public void removeStudentbyName(String firstName, String lastName){
                Student student = new Student(firstName, lastName);
                for (Student s: students){
                        if(s == student) {
                                s = null;

                        }
                }
        }
}
