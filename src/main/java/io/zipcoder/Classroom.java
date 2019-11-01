package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student... students) {
        this.students = students;
    }
    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return this.students;
    }

    public Double getAverageExamScore() {
        double sum = 0;
        int numberOfExams = 0;
        for (Student student: students) {
            sum += student.getAverageExamScore();
            numberOfExams += 1;//student.getNumberOfExamsTaken();
        }
        return sum / numberOfExams;
    }

    public void addStudent(Student student) {
        Integer newArraySize;
        if (students != null){
            newArraySize = students.length + 1;
        } else {
            newArraySize = 1;
        }
        Student[] newArray = new Student[newArraySize];

        for (int i = 0; i < newArraySize-1; i++) {
            newArray[i] = students[i];
        }
        newArray[newArray.length-1] = student;
        students = newArray;
    }

    public void removeStudent(String firstName, String lastName) {
        Integer newArraySize;
        if (students != null && students.length > 1) {
            newArraySize = students.length - 1;
        } else {
            newArraySize = 1;
        }

        Student[] newArray = new Student[newArraySize];
        int idx = 0;
        for (int i = 0; i < newArraySize; i++) {
            if (!(students[i].getFirstName().equals(firstName)
                    && students[i].getLastName().equals(lastName))) {
                newArray[idx] = students[i];
                idx += 1;
            }
        }

        students = newArray;

    }

    public Student[] getStudentsByScore() {
        Boolean sorted;
        do {
            sorted = true;
            for (int i = 1; i < students.length; i++) {
                Student currentStudent = students[i];
                Student prevStudent = students[i-1];
                if (currentStudent.getAverageExamScore() > prevStudent.getAverageExamScore()) {
                    students[i] = prevStudent;
                    students[i-1] = currentStudent;
                    sorted = false;
                }
                if (currentStudent.getAverageExamScore().equals(prevStudent.getAverageExamScore())) {
                    if (currentStudent.getFirstName().compareTo(prevStudent.getFirstName()) < 0) {
                        students[i] = prevStudent;
                        students[i-1] = currentStudent;
                        sorted = false;
                    }

                }

            }
        } while (!sorted);

        return students;
    }

    public Map getGradeBook() {
        Map gradeBook = new HashMap<String, String>();
        for (Student student: students) {
            String fullName = String.format("%s %s", student.getFirstName(), student.getLastName());
            gradeBook.put(fullName, getPercentile(student));
        }
        return gradeBook;
    }

    public String getPercentile(Student student) {
        Integer maxNum = this.getNumberOfStudents();
        Integer countWorseStudents = 1;
        for (int i = 0; i < getNumberOfStudents(); i++) {
            if (!students[i].getFirstName().equals(student.getFirstName())
                    && students[i].getAverageExamScore() < student.getAverageExamScore()) {
                countWorseStudents += 1;
            }
        }
        Double result = ((double) countWorseStudents / maxNum);
        String grade = "";
        if (result >= .9) {
            grade = "A";
        } else if (result < .9 && result >= .7) {
            grade = "B";
        } else if (result < .7 && result >= .5) {
            grade = "C";
        } else if (result < .5 && result >= .1) {
            grade = "D";
        } else if (result < .1 && result >= .0) {
            grade = "F";
        }
        return grade;
    }

    public Integer getNumberOfStudents() {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFirstName().length() > 0) {
                count++;
            }
        }
        return count;
    }
}
