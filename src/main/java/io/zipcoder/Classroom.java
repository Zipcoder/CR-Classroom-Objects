package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom extends Student{

//    Student[]students = new Student[30];
    Student[] students;


    public Classroom(int maxNumberOfStudents){this.students = new Student[maxNumberOfStudents];}
    public Classroom(Student[] students){this.students = students;}
    public Classroom(){ this.students = new Student[30]; }

    public Student[] getStudents() {
        return students;
     }

    public Double getAverageExamScore() {
        double total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i].getAverageExamScore();
        }
        return total / students.length;
    }
  public Student[] addStudent(Student student){
        List<Student> studentList = Arrays.asList(students);
        studentList.add(student);
        return (Student[]) studentList.toArray();
  }

  public Student[] removeStudent(String firstName, String lastName){
      List<Student> studentList = Arrays.asList(students);
      for(int i =0; i < students.length; i++){
            if(students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                studentList.remove(i);
            }
        }
        return (Student[])studentList.toArray();
  }
  public Student[] getStudentByScore(){

  }
}
