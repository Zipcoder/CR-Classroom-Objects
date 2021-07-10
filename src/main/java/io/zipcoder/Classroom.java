package io.zipcoder;

import java.util.Arrays;

public class Classroom {

Student[] students;


    public Classroom(int maxNumOfStudents){

        this.students = new Student[maxNumOfStudents];
    }

    public Classroom (Student... students){

        this.students = students;
    }

    public Classroom(){

        this.students = new Student[30];
    }


    public Student[] getStudents(){
        return this.students;

    }

    public double getAverageExamScores(){
       double todosLosExams = 0;
       for( int i = 0; i < students.length; i++){
           if (this.students[i] != null){
               todosLosExams += this.students[i].getAverageExamScore();
           }
       }
     return todosLosExams / this.students.length;
    }

    public void addStudent(Student student){
      for (int i = 0; i < students.length; i++){
          if (students[i] == null){
              students[i] = student;
          }
      }
    }


   public void removeStudent (String firstName, String lastName) {
       for (int i = 0; i < students.length; i++) {
           if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
               students[i] = null;
           }
       }

       for (int i = 0; i < students.length - 1; i++) {
           if (students[i] == null) {
               students[i] = students[i + 1];
               students[i + 1] = null;
           }
       }

   }

       public Student[] getStudentsByScore(){
           Arrays.sort(students);
           return students;

       }


}


