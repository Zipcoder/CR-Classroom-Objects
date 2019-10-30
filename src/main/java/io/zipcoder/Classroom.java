package io.zipcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Classroom {

    private Student[] students;


    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    // nullary constructor
    public Classroom() {
        this(30);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        double classTotalScore = 0;
        double numberOfStudents = students.length;

        for (int i = 0; i < students.length; i++) {
            classTotalScore += students[i].getAverageExamScore();
        }

        return (classTotalScore / numberOfStudents);
    }

    public String addStudent(Student student) {

        for (int index = 0; index < students.length; index++) {
            if (students[index] == null) {
                students[index] = student;
                return student.toString();
            }
        }

        return "Classroom is full";
    }

    public boolean removeStudent(String firstName, String lasName) {

        for (int index = 0; index < students.length; index++) {
            Student student = students[index];

            if (student.getFirstName().contains(firstName) &&
                    student.getLastName().contains(lasName)) {

                students[index] = null;
                return true;
            }
        }

        return false;
    }

    public Student[] getStudentByScore(double score) {
        List<Student> studentScore = new ArrayList<>();

        for (Student student : getStudents()) {
            if (student.getExamScores().contains(String.valueOf(score))) {
                studentScore.add(student);
            }
        }

        return studentScore.toArray(new Student[0]);
    }

    public TreeMap<Character, ArrayList<Student>> getGradeBook() {

        TreeMap<Character, ArrayList<Student>> gradeBook = new TreeMap<>();

        int numOfStudents = students.length;

        for (int i = 1; i <= numOfStudents; i++) {

            Double percent = ((i - 1) / (double) numOfStudents);

            Character gradeLetter;
            if (percent <= .1) gradeLetter = 'A';
            else if (percent > .1 && percent <= .29) gradeLetter = 'B';
            else if (percent > .29 && percent <= .50) gradeLetter = 'C';
            else if (percent > .50 && percent <= .89) gradeLetter = 'D';
            else gradeLetter = 'F';

            if (!gradeBook.containsKey(gradeLetter)) {
                gradeBook.put(gradeLetter, new ArrayList<Student>());
            }

            ArrayList<Student> currentStudents = gradeBook.get(gradeLetter);

            Student student = students[i - 1];
            currentStudents.add(student);
            gradeBook.put(gradeLetter, currentStudents);
        }
        return gradeBook;

    }

}