package io.zipcoder;

import java.util.*;

import static java.util.Arrays.sort;

public class Classroom {
    private Integer currentAmountOfStudents;
    private Integer maxNumberOfStudents;
    private Student[] students;

    public Classroom(Integer maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
        this.maxNumberOfStudents = maxNumberOfStudents;
        currentAmountOfStudents = 0;
    }
    public Classroom(Student[] students) {
        this.students = students;
        currentAmountOfStudents = students.length;
        maxNumberOfStudents = students.length;
    }
    public Classroom(){
        this(30);
    }
    public Student[] getStudents(){
        List<Student> studentList = new ArrayList<>();
        for (Student student: students)
            if (student != null)
                studentList.add(student);
            return studentList.toArray(new Student[studentList.size()]);
    }

}
