package io.zipcoder;

public class Classroom {

    //private Students Students[] students;
    private Student[] classRoster;

    private int maxNumberOfStudents;

    //Classroom blue = new Classroom(50);

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students){
        classRoster = students;
    }

    public Classroom(){
        this(30);
    }

    public Student[] getStudents() {
        return classRoster;
    }

    public Double getAverageExamScore(){
        return null;
    }

    public void addStudent(Student student){

    }

    public void removeStudent(String firstName, String lastName){

    }

    public Student[] getStudentsByScore(){
        return null;
    }

    public Student[] getGradeBook(){
        return null;
    }

}
