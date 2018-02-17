package io.zipcoder;

import java.util.*;

public class Classroom {
    private Student[] students;

    public Classroom() {
        this(30);
    }

    public Classroom(int maxStudents) {
        this.students = new Student[maxStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public String getStudents() {
        return Arrays.toString(students);
    }

    public Double getAverageClassExamScore() {
        double sumOfAverages = 0;
        double studentCounter = 0;
        for (int index = 0; index < this.students.length; index++) {
            if (students[index] != null) {
                sumOfAverages += students[index].getAverageExamScore();
                studentCounter++;
            }
        }
        return sumOfAverages / studentCounter;
    }

    public boolean addStudent(String firstName, String lastName, Double[] examScores) {
        for (int index = 0; index < this.students.length; index++) {
            if (students[index] == null) {
                students[index] = new Student(firstName, lastName, examScores);
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(String firstName, String lastName) {
        for (int index = 0; index < this.students.length; index++) {
            if (students[index].getFirstName().contains(firstName) && students[index].getLastName().contains(lastName)) {
                students[index] = null;
                return true;
            }
        }
        return false;
    }

    public String listStudentsByScore() {
        //Created an ArrayList to push students[i] into so that there are no null values if maxStudents > actual students in the array
        ArrayList<Student> noEmptySpaces = new ArrayList<>();
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                noEmptySpaces.add(this.students[i]);
            }
        }
        Collections.sort(noEmptySpaces, Student.averageGradeComparator.thenComparing(Student::getLastName));
        return noEmptySpaces.toString();
    }

    public ArrayList<Student> getOrderedStudentsAsList() {
        ArrayList<Student> noEmptySpaces = new ArrayList<>();
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                noEmptySpaces.add(this.students[i]);
            }
        }
        Collections.sort(noEmptySpaces, Student.averageGradeComparator.thenComparing(Student::getLastName));
        return noEmptySpaces;
    }

    public String gradeClass() {
        //Debating whether or not I should make multiple methods for this
        ArrayList<Student> OrderedListOfStudents = this.getOrderedStudentsAsList();
        StringBuilder gradedStudents = new StringBuilder();

        for (int index = 0; index < OrderedListOfStudents.size(); index++) {
            if ((int) Math.ceil(OrderedListOfStudents.size() * .1) >= index + 1) {
                gradedStudents.append(OrderedListOfStudents.get(index).getFirstName() + " " + OrderedListOfStudents.get(index).getLastName() + " : A\n");
            } else if ((int) Math.ceil(OrderedListOfStudents.size() * .29) >= index + 1) {
                gradedStudents.append(OrderedListOfStudents.get(index).getFirstName() + " " + OrderedListOfStudents.get(index).getLastName() + " : B\n");
            } else if ((int) Math.ceil(OrderedListOfStudents.size() * .5) >= index + 1) {
                gradedStudents.append(OrderedListOfStudents.get(index).getFirstName() + " " + OrderedListOfStudents.get(index).getLastName() + " : C\n");
            } else if ((int) Math.ceil(OrderedListOfStudents.size() * .89) >= index + 1) {
                gradedStudents.append(OrderedListOfStudents.get(index).getFirstName() + " " + OrderedListOfStudents.get(index).getLastName() + " : D\n");
            } else if ((int) Math.ceil(OrderedListOfStudents.size() * .89) <= index + 1){
                gradedStudents.append(OrderedListOfStudents.get(index).getFirstName() + " " +OrderedListOfStudents.get(index).getLastName() + " : F\n");
            }
        }
        return gradedStudents.toString();
    }
}


