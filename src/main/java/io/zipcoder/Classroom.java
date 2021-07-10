package io.zipcoder;

public class Classroom {

    Student[] students;
    int maxNumberOfStudents;


    public Classroom(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student... students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() { return students; }

    public double getAverageExamScore() {
        double total = 0.0;
        for (Student s : students) {
            total += s.getAverageTestScore();

        }
        return total / students.length;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = student;
            }
        }
    }

    public int actualStudentArray(Student student) { //counts how many actual students there are in a classroom size of 30
        int totalStudents = 0;
        for(int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                totalStudents++;
            }
        }
        return totalStudents;
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(firstName, lastName));

        }
    }
}
