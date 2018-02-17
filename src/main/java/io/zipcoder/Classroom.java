package io.zipcoder;
import java.util.Arrays;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        Student [] students = new Student[maxNumberOfStudents];
        this.students = students;

    }

    public Classroom(Student[] students){
        this.students = students;

    }

    public Classroom(){
        Student [] students = new Student[30];
        this.students = students;

    }

    public Student[] getStudents(){
        return this.students;
    }

    public double getAverageExamScore(){
        double sum = 0.0;
        for (Student s : this.students){
            sum += s.getAverageExamScore();
        }
        return Math.round(sum/this.students.length);
    }

    public void addStudent(Student newStudent){
        this.students[students.length-1] = newStudent;
    }

    public void removeStudent(String firstName, String lastName){
        Student studentToRemove = this.identifyStudent(firstName, lastName);
        int studentToRemoveIndex = this.identifyStudentIndex(studentToRemove);
        this.students[studentToRemoveIndex] = null;


    }

    public Student[] getStudentsByScore(){
        return null;

    }

    public Student[] getGradeBook(){
        return null;
    }

    public Student identifyStudent(String firstName, String lastName){
        for(Student s : this.students){
            if(firstName.equals(s.getFirstName()) && lastName.equals(s.getLastName())){
                return  s;
            }
        }
        return null;
    }

    public int identifyStudentIndex(Student student){
        for (int i = 0; i<this.students.length; i++){
            if (this.students[i] == student){
                return i;
            }
        }
        return -1;
    }


}
