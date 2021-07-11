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
//                        newEnrollment.add(student);
//             this.students = newEnrollment.toArray(new Student[0]);

        public void removeStudentbyName(String firstName, String lastName) {
                //Student[] studentArray = new Student[students.length];
                for (int i = 0; i < students.length-1; i++) {
                        if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                                students[i] = null;

                        } students[i] = students[i+1];
                }
                students[students.length-1] = null;
//                Student[] unnull = new Student[students.length];
//                for (int j = 0; j < students.length; j++) {
//                        if (students[j] == null) {
//                                unnull[j]=students[j];
//                        }
//
//                }
//                this.students = unnull;
        }
//                ArrayList<Student> studentArray = new ArrayList<>(Arrays.asList(students));
//                for (int i = 0; i < studentArray.size() ; i++) {
//                        Student student = studentArray.get(i);
//                        if (student.getLastName().equalsIgnoreCase(lastName) && student.getFirstName().equalsIgnoreCase(firstName)) {
//                                studentArray.set(student);
//
//                        }
//                } studentArray.add(null);
//           this.students = studentArray.toArray(new Student[0]);
        public Student[] moveNullsToEnd(Student[] learners){
                Student[] unnull = new Student[learners.length];
                int i = 0;
                for (Student student : learners) {
                        if (student != null) {
                             unnull[i]=student;
                             i++;
                        }

                }
                return unnull;
        }
}
