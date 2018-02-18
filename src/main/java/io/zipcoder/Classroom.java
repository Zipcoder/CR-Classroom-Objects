package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Classroom {
    private Student [] students;
    private int studentsEnrolled;
    private int maxStudentAmount;

    private HashMap<String, Student> studentHashMap = new HashMap<>();


    public Classroom(){
        this.students = new Student[30];

    }

    public Classroom(int maxStudentAmount){
        this.students = new Student[maxStudentAmount];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Student[] getStudents(){
        return this.students;
    }

//    public boolean isClassroomFull(){
//        if (maxStudentAmount > 30){
//            return false;
//        }
//    }

    public boolean addStudents(Student student){
        for(int i = 0; i < students.length; i++){
            if (students[i] == (null)){
                students[i] = student;
                return true;
            }

        }
        return false;
    }

    public String removeStudent(String firstName, String lastName){
        for (int i = 0; i < students.length; i++){
            if ((students[i].getFirstName().equals(firstName)) && (students[i].getLastName().equals(lastName))){
                students[i] = null;
                this.sortNullToEnd();
                break;
            }
        }
        return "This student is not enrolled";
    }

    public void sortNullToEnd(){
        int counter = 0;

        Student[] tempArray = Arrays.copyOf(this.students, this.students.length);
            for(int i = 0; i < this.students.length; i++){
                if(!(students[i] == null)){
                    tempArray[counter] = students[i];
                    counter++;
                }
            }
            tempArray[students.length - 1] = null;
            this.students = tempArray;

    }

    public double getClassAverage(){
        int sum = 0;
        for (Student student : this.students){
            sum += student.getAverageExamScores();
        }
        return sum / students.length;

    }

//    public String getStudentByScore(){
//
//    }


    public String getClassScores(){
        return null;
    }

    public void sortStudentsAlphabetically(){

    }

    public void sortStudentsByScore(){

    }

    public String getGradeBook(){
        return null;
    }
}
