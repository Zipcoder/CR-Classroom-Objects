package io.zipcoder;

public class Classroom extends Student{
    Student[] students = new Student[0];

    public Classroom(int maxNumberOfStudents){ }
    public Classroom(Student[] students){}
    public Classroom(){ this.students = new Student[30]; }

    public Student[] getStudents() {
        return students;
     }

    public Double getAverageExamScore(){
        double total = 0;
       for(int i =0; i < students.length; i++){
           total += super.getAverageExamScore();
       }
       return total / students.length;
    }
}
