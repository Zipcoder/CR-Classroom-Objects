package io.zipcoder;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];

    }
    public Classroom(Student[] students) {
        this.students = students;

    }
    public Classroom() {
        this(30);
    }

    public Student[] getStudents(){

        return students;
    }

    public double getAverageExamScore() {
        int count = 0;
        double sum = 0;

        for(int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                sum += students[i].getAverageExamScore();
                count++;
            }
        }
        return sum/count;
    }

    public boolean removeStudent(String firstName, String lastName) {
        for (int i = 0; i < this.students.length; i++) {
            if (students[i].getFirstName().contains(firstName) && students[i].getLastName().contains(lastName)) {
                students[i] = null;
            }
            return true;
        }
        return false;
    }

    public String[] getStudentsByScore() {
        return null;
    }
    public void getGradeBook(){
    }

    public String addStudent() {
        return null;
    }
}
