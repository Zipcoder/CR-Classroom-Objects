package io.zipcoder;

public class Classroom {

Student[] students;


    public Classroom(int maxNumOfStudents){

        this.students = new Student[maxNumOfStudents];
    }

    public Classroom (Student... students){

        this.students = students;
    }

    public Classroom(){

        this.students = new Student[30];
    }


    public Student[] getStudents(){
        return this.students;

    }

    public double getAverageExamScores(){
       double todosLosExams = 0;
       for( int i = 0; i < students.length; i++){
           if (this.students[i] != null){
               todosLosExams += this.students[i].getAverageExamScore();
           }
       }
     return todosLosExams / this.students.length;
    }

    public void addStudent(Student student){
      for (int i = 0; i < students.length; i++){
          if (students[i] == null){
              students[i] = student;
          }
      }
    }
   public void removeStudent (String firstName, String lastName){
        
}

}
