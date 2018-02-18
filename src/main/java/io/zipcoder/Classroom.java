package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

    private Student[] students;


    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        students = new Student[30];
    }


    public Student[] getStudents(){

        return students;
    }

    public double getAverageExamScore(){
        double totalScore=0;
        double averageScore;

        for(int i = 0; i < students.length; i++){
            totalScore += Double.parseDouble(students[i].getAverageExamScore());

        }
        averageScore = totalScore/students.length;

        return averageScore;
    }

    public void addStudent(Student student){
        ArrayList<Student> studentList;
        if (this.students[0]==null){
            studentList=new ArrayList<>();
            studentList.add(student);
        }
        else {
            studentList = new ArrayList<>(Arrays.asList(this.students));
            studentList.add(student);
        }
        this.students = studentList.toArray(this.students);
    }

    public void removeStudent(String firstName, String lastName){
        ArrayList<Student> studentList;
        studentList = new ArrayList<>(Arrays.asList(this.students));

        for(Student student:  this.students){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                studentList.remove(student);
            }
        }

        this.students=studentList.toArray(this.students);



    }









}
