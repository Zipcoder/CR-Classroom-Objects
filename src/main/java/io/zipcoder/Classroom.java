package io.zipcoder;

public class Classroom {

    private Student[] students;
    private Classroom[] classroom;

    public Classroom(int maxNumberOfStudents){
        Classroom[] classroom = new Classroom[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){

    }

    public Student[] getStudents() {
        return students;
    }

    protected Double getAverageExamScore(){
        Double sum = 0.00;
        for (Student student : students) {
            sum += student.getAverageExamScore();
        }

        double averageExamScore = Math.round(sum / this.getStudents().length * 100) / 100;
        return averageExamScore;

    }

    protected Student addStudent(Student student){
        return null;
    }
}
