package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Classroom {
    public Student [] students;

    public Classroom (){
        this(30);
    }
    public Classroom (int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];

}
    public Classroom (Student[] students){
        this.students = students;
}
    public Student [] getStudents() {
        return this.students;
    }
//define a getter which returns the sum of all exams divided by the number of students

    public double getAverageExamScore() {
       double count = 0.0;
        double sumOfExamScores = 0.0;
        for(int i = 0; i < students.length; i++) {
            if (!(students[i] == null)) {
                sumOfExamScores += students[i].getAverageExamScore();
                count++;
            }
        }
        double average = Math.round(sumOfExamScores/count);
        return average;
    }
 //define a method which uses student perameter to add a student object to student list
    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
    public boolean removeStudent(String firstName, String lastName){
        for (int i = 0; i< students.length;i++){
            if ((students[i].getFirstName().equals(firstName)) && students[i].getLastName().equals(lastName)){
                students[i] = null;
                return true;
            }
        }
        return  false;
    }
    public String [] getStudentsByScore() {
        ArrayList<Student> temp = new ArrayList<>(Arrays.asList(this.students));
        Collections.sort(temp, Student.AverageTestScoreComparator.thenComparu)
        String [] studentSortedArray = new String[students.length];
        for (int i = 0; i < students.length;i++){
            if (students[i] != null) {
                temp.add(students[i]);
            }
            students.
        temp.sort(temp, stud );
        }

        return null;

    }
    //grading curve
    public void getGradeBook() {


    }


}
