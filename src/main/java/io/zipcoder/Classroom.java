package io.zipcoder;

import java.lang.reflect.Array;
import java.util.*;

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

    public Student[] getStudentsByScore(){
        TreeMap<Double, Student> studentsByAverageScore = new TreeMap<Double, Student>(Collections.reverseOrder());
        ArrayList<Student> studentListByAverage;
        studentListByAverage = new ArrayList<>();
            for(Student student: this.students){
                studentsByAverageScore.put(Double.parseDouble(student.getAverageExamScore()), student);
            }
        for(Map.Entry<Double,Student> entry : studentsByAverageScore.entrySet()) {
            Student value = entry.getValue();

            studentListByAverage.add(value);
        }
        this.students=studentListByAverage.toArray(this.students);

            return this.students;
    }

//    public void TreeMap<String, Student> getGradeBook() {
//        TreeMap<Double, Student> studentsByAverageScore = new TreeMap<Double, Student>(Collections.reverseOrder());
//        ArrayList<Student> studentListByAverage;
//        studentListByAverage = new ArrayList<>();
//        for (Student student : this.students) {
//            studentsByAverageScore.put(Double.parseDouble(student.getAverageExamScore()), student);
//        }
//        for (Map.Entry<Double, Student> entry : studentsByAverageScore.entrySet()) {
//            Student value = entry.getValue();
//
//            studentListByAverage.add(value);
//
//
//        }
//
//    }











}
