package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    ArrayList<Student> students = new ArrayList<>();

    //Constructors
    public Classroom(int maxNumberOfStudents){
        this.students = new ArrayList<>(maxNumberOfStudents);
    }

   public Classroom(Student[] classroom){
        this.students.addAll(Arrays.asList(classroom));
   }

    public Classroom(){
        this.students = new ArrayList<>(30);
    }

    //Get Methods
    public ArrayList<Student> getStudents(){ return this.students; }

    public Double getAverageExamScore(){
        Double sumScores = 0.0;
        Double sumExams = 0.0;
        for (int i = 0; i < students.size(); i++){
            Student kid = students.get(i);
            sumExams += kid.getNumberOfExamsTaken();
            sumScores += (kid.getAverageExamScore() * kid.getNumberOfExamsTaken());
        }
       return sumScores/sumExams;
    }

}
