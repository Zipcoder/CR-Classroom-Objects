package io.zipcoder;

import java.util.Arrays;

public class Classroom {

    protected Student[] students;

    public Classroom() {

        this.students = new Student[30];
    }

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] aStudentArray) {
        this.students = aStudentArray;
    }

    public Student[] getStudents() {
        return this.students;

    }

    public double getClassTotalExamScore() {
        double classTotalExamScore = 0;
        for (Student student : this.students) {
            classTotalExamScore += student.getTotalExamScore();
        }
        return classTotalExamScore;
    }

    public int getClassTotalCountOfExams() {
        int classTotalCountOfExams = 0;
        for (Student student : this.students) {
            classTotalCountOfExams += student.getCountOfExams();
        }
        return classTotalCountOfExams;
    }

    public double getClassAverageExamScore() {
        double rawAverage = getClassTotalExamScore() / getClassTotalCountOfExams();
        double roundAndMoveDecimal = Math.round(rawAverage * 100);
        double classAverageExamScore = roundAndMoveDecimal / 100;
        return classAverageExamScore;
    }

    public void addStudent(String aFirstName, String aSecondName, Double[] testScores) {

        Student newStudent = new Student(aFirstName, aSecondName, testScores);

        if (isThereAnEmptySeat()) {

            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = newStudent;
                    break;
                }
            }
        } else {
            Student[] tempArray = new Student[this.students.length + 1];
            System.arraycopy(this.students, 0, tempArray, 0, this.students.length);
            tempArray[tempArray.length - 1] = newStudent;
            this.students = tempArray;
        }

    }

    public void removeStudent(String aFirstName, String aLastName) {

        for (int i = 0; i < this.students.length; i++) {
            if (students[i].getFirstName().equals(aFirstName) && students[i].getLastName().equals(aLastName))
                students[i] = null;
        }

        sortNullValuesToEnd();

    }

    public Student[] getStudentsByScore() {
        Arrays.sort(students);

        return students;
    }

    public void getGradeBook() {

    }

    public boolean isThereAnEmptySeat() {
        for (Student student : students) {
            if (student == null) {
                return true;
            }
        }
        return false;
    }

    public void sortNullValuesToEnd() {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                for (int j = i + 1; j < students.length; j++) {
                    students[j - 1] = students[j];
                }
                students[students.length - 1] = null;
                break;
            }
        }
    }


}
