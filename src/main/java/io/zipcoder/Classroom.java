package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    private Student[] students;
    private int maxNumberOfStudents;


    public Classroom() {
        this.students = new Student[30];
    }

        public Classroom(int maxNumberOfStudents) {
            this.students = new Student[maxNumberOfStudents];
        }

        public Classroom(Student... students){
            this.students = students;
        }

        public Student[] getStudents() {
            return students;
        }

        public double getAverageExamScore() {
            double totalSum = 0;
            for (Student element: students) {
                totalSum += element.getAverageExamScore();
            }
            return totalSum /students.length;
        }

        public void addStudent(Student student) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                }
            }
//            ArrayList<Student> newEnrollment = new ArrayList<>(Arrays.asList(students));
//            if (students.length < maxNumberOfStudents) {
//                newEnrollment.add(student);
//            } else System.out.println("Enrollment full");
//            this.students = newEnrollment.toArray(new Student[0]);
    }


        public void removeStudent(String firstName, String lastName) {
            ArrayList<Student> newStudentList = new ArrayList<Student>(Arrays.asList(students));

            newStudentList.set(newStudentList.indexOf(students), null);
        }

        public String getStudentsByScore(){

            return null;
        }

        public Double getGradeBook() {
        
            return null;
        }


}

