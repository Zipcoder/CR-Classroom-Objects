package io.zipcoder;

import java.util.Arrays;

public class Classroom {

    protected Student[] studentsArray;

    public Classroom(int maxNumberOfStudents) {
        this.studentsArray = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] collectionOfStudents) {
        this.studentsArray = collectionOfStudents;
    }

    public Classroom() {
        this.studentsArray = new Student[30];
    }

    public Student[] getStudents() {
        return this.studentsArray;
    }

    public double getClassroomAverageExamScore() {
        double sumOfStudentAverageExamScores = 0.0;
        for (Student student : this.studentsArray) {
            sumOfStudentAverageExamScores += student.getStudentAverageExamScore();
        }
        double averageClassroomExamScore = sumOfStudentAverageExamScores / this.studentsArray.length;
        double roundedClassroomAverageExamScore = (double) Math.round(averageClassroomExamScore * 10) / 10;
        return roundedClassroomAverageExamScore;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < this.studentsArray.length; i++) {
            if (this.studentsArray[i] == null) {
                this.studentsArray[i] = student;
                break;
            } else if (i == this.studentsArray.length - 1) {
                this.studentsArray = Arrays.copyOf(this.studentsArray, this.studentsArray.length + 1);
                this.studentsArray[this.studentsArray.length - 1] = student;
                break; // I had to add this break, otherwise the loop would never end
                // (because increasing the array's length in the else block
                // would also affect the condition inside the for loop, causing an infinite loop)
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {

        int l = this.studentsArray.length;
        int removeAndReplaceIndex = 0;

        for (int i = 0; i < l; i++)  {
            if (this.studentsArray[i].getFirstName() == firstName
                    && this.studentsArray[i].getLastName() == lastName) {
                removeAndReplaceIndex = i;
                break;
            }
        }

        for (int i = removeAndReplaceIndex; i < l; i++)  {
            if (i < l - 1) {
                this.studentsArray[i] = this.studentsArray[i + 1];
            } else if (i == l - 1) {
                this.studentsArray[i] = null;
            }
        }
    }



}
