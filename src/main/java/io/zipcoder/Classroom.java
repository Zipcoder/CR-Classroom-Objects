package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Classroom {
    private Student[] studentsInClass;

    public Classroom(int numberOfStudents) {
        studentsInClass = new Student[numberOfStudents];
    }
    public Classroom(Student[] students){
        this.studentsInClass = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            studentsInClass[i] = students[i];
        }
    }
    public Classroom(){
        this.studentsInClass = new Student[30];
    }

    public Student[] getStudents() {
        return studentsInClass;
    }


    public Double getClassAverageExamScore() {
        Double average = 0.0;
        for (Student student: studentsInClass) {
            average += student.getAverageExamScore();
        }
        return average/studentsInClass.length;
    }

    public void addStudent(Student student) {
        ArrayList<Student> addingStudents = new ArrayList<>(Arrays.asList(studentsInClass));
        addingStudents.add(student);
        this.studentsInClass = addingStudents.toArray(new Student[0]);
    }

    public void removeStudent(String firstName, String lastName) {
        ArrayList<Student> removingStudent = new ArrayList<>(Arrays.asList(studentsInClass));
        for (Student student:removingStudent) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                removingStudent.remove(student);
                removingStudent.add(null);
                break;
            }
        }
        this.studentsInClass = removingStudent.toArray(new Student[0]);
    }


    public void getStudentByScore() {
        Arrays.sort(studentsInClass);
//        ArrayList<Student> haveSameScores = new ArrayList<>();
//        for (int i = 0; i < studentsInClass.length; i++) {
//            if(studentsInClass[i].getAverageExamScore().equals(studentsInClass[i+1].getAverageExamScore()){
//                haveSameScores.add(studentsInClass[i+1]);
//            }
//        }
//
        //Arrays.sort(studentsInClass, (s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));
    }

    public void getGradedBook(){
        //get exam averages of all student
        //get total count
        //get the mean(avg)
        //get standard deviation

        //Assign letter grades to students
        double result = 0.0;
        double standardDevi = 0.0;
        for (Student eachStudent : studentsInClass) {
            Double classAvg = getClassAverageExamScore();
            Double studentAvg = eachStudent.getAverageExamScore();
            Integer numOfStudents = studentsInClass.length;

            result += Math.pow(studentAvg- classAvg, 2);
            standardDevi = Math.sqrt(result/(numOfStudents - 1));

            if (studentAvg >= (classAvg + (standardDevi * 2))) {
                eachStudent.setLetterGrade("A");
            } else if (studentAvg >= (classAvg + (standardDevi))){
                eachStudent.setLetterGrade("B");
            } else if (studentAvg < (classAvg + standardDevi) && studentAvg > classAvg){
                eachStudent.setLetterGrade("C");
            } else if (studentAvg <= (classAvg - standardDevi)) {
                eachStudent.setLetterGrade("D");
            } else if (studentAvg <= (classAvg - (standardDevi * 2))) {
                eachStudent.setLetterGrade("F"); }
        }

    }
}
