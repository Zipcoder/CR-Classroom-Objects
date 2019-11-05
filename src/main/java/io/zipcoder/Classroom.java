package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    ArrayList<Student> students;

    public Classroom(int maxNumberOfStudents){
        this.students = new ArrayList<>(maxNumberOfStudents);
    }

   public Classroom(Student[] classroom){
        this.students.addAll(Arrays.asList(classroom));
   }

    public Classroom(){
        this.students = new ArrayList<>(30);
    }

}
