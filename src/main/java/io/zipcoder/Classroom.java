package io.zipcoder;
import io.zipcoder.Student.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;

import static java.util.Arrays.sort;


public class Classroom{

    private Student[] students;
    private Student student;


    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];

    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public Student[] getStudents() {
        return students;
    }

    public long getAverageExamScore() {
        int counter = 0;
        double scores = 0.0;
        for (int i = 0; i < this.students.length; i++) {
            Student one = this.students[i];
            scores += one.accessTotalExamsScore();
            counter += one.getNumberOfExamsTaken();
        }
        return Math.round(scores / counter);
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (this.students[i] != (null)) {
                this.students[i] = this.students[i];
            } else if (students[i] == null) {
                this.students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for (int p = 0; p < students.length - 1; p++) {
            String first = students[p].getFirstName();
            String last = students[p].getLastName();
            if (first.equals(firstName) && last.equals(lastName)) {
                students[p] = students[p + 1];
                students[p + 1] = null;
            }
            if (students[p] == null) {
                students[p] = this.students[p + 1];
                students[p + 1] = null;
            }
        }
    }

    public Student[] getStudentsByScore() {
        Arrays.sort(students, sortByScoreThenName);
        return students;
    }


    public LinkedHashMap<Student,String> getGradeBook(){
        LinkedHashMap<Student, String> gradeBook = new LinkedHashMap<>();
        Classroom classroom = new Classroom(students);
        classroom.getStudentsByScore();
        Student [] classMap = classroom.getStudentsByScore();
        int a = (int)Math.round(.1*classMap.length)-1;
        int b = (int)Math.round(.3*classMap.length)-1;
        int c = (int)Math.round(.5*classMap.length)-1;
        int d = (int)Math.round(.9*classMap.length)-1;

        for(int i = 0; i<classMap.length; i++) {
            if(i <= a) {
                gradeBook.put(classMap[i], "A");
            } else if (i <= b) {
                gradeBook.put(classMap[i], "B");
            } else if (i <= c) {
                gradeBook.put(classMap[i], "C");
            } else if (i <= d) {
                gradeBook.put(classMap[i], "D");
            }  else {
                gradeBook.put(classMap[i], "F");
            }
        }
        return gradeBook;
    }

    //for getStudentsByScore
    public static Comparator<Student> sortByScoreThenName = new Comparator<Student>() {
        @Override
        public int compare(Student studentOne, Student studentTwo) {
            int isGreaterOrLess = 0;
            if (studentOne.getAverageExamScore() < studentTwo.getAverageExamScore()) {

                isGreaterOrLess = 1;
            } else if (studentOne.getAverageExamScore() > studentTwo.getAverageExamScore()) {
                isGreaterOrLess = -1;
            } else if (studentOne.getAverageExamScore() == studentTwo.getAverageExamScore()) {
                char first = studentOne.getLastName().charAt(0);
                char second = studentTwo.getLastName().charAt(0);
                if (first > second) {
                    isGreaterOrLess = 1;
                } else if (studentOne.getAverageExamScore() < studentTwo.getAverageExamScore()) {
                    isGreaterOrLess = -1;
                    ;
                }
                return isGreaterOrLess;
            }
            return isGreaterOrLess;
        }
    };


}


/*    TreeMap<Student, Integer> mapScores = new TreeMap<>();
        for(int i = 0; i<students.length; i++) {
        mapScores.put(students[i],students[i].getAverageExamScore());
        }
        for(Map.Entry<Student, Integer> entry: mapScores.entrySet()){

        }
        */

