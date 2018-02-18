package io.zipcoder;

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



}
