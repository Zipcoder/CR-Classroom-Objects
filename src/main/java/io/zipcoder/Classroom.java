package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Classroom {
    private ArrayList<Student> students;
    private int maxStudents;
    private final int fDEFAULT_MAX_STUDENTS = 30;

    /**
     * Empty constructor.  You get to decide what max students should default to.
     */
    public Classroom() {
        students = new ArrayList<>(fDEFAULT_MAX_STUDENTS);
    }

    /**
     * Constructor where the caller defines wht maxStudents is.
     * @param maxStudents
     */
    public Classroom(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    /**
     * Constructor that builds a class from an existing Student array.
     * @param students
     */
    public Classroom(Student[] students) {
        this.students = (ArrayList<Student>) Arrays.asList(students);
    }

    public Student getStudentByName(String first, String last) {
        for (Student s : students) {
            if (s.getFirstName().equals(first) && s.getLastName().equals(last)) {
                return s;
            }
        }
        return null;
    }

    /**
     * Adds a student to the class, and returns true.
     * If you cannot add any more students, then return false and print an error statement.
     * @param student
     * @return
     */
    public boolean addStudent(Student student) {
        return students.add(student);
    }

    /**
     * Returns the student with the firstName and lastName, and removes them from the array.
     * If there is no student, return null.
     * NOTE: You're going to want to move some students around in the array so that there are no empty spaces in the
     * middle.
     * @param firstName
     * @param lastName
     * @return
     */
    public Student removeStudent(String firstName, String lastName) {
        return null;
    }

    /**
     * Return the average score of all of the student's average scores.
     */
    public double getClassAverage(){
        return 100.0;
    }

    /**
     * Return a string of student names and their averages, like.
     *
     * Students:
     * Bart Simpson -> 72.4
     * Homer Simpson -> 0.1
     * Lisa Simpson -> 100.0
     * Milhouse Van Houten -> 87.6
     *
     * If there are no students in the array, return No Students.
     *
     * @return
     */
    public String getStudentsByScore() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(students);
        for (Student s : students) {
            sb.append(String.format("%1s %2s : %3s \n", s.getFirstName(), s.getLastName(), s.getAverage()));
        }
        return sb.toString();
    }

    /**
     * CHALLENGE METHOD: Don't stress on this.  It's just a little something to challenge you.
     * Must return a string like in `getClassScore`, except it should look like this:
     * Grades:
     * Lisa Simpson -> A
     * Milhouse Van Houten -> B
     * Bart Simpson -> C
     * Homer Simpson -> F
     *
     * And if there are no student's, just return No students.
     *
     * The way the grading is done is by a bell curve where, ideally, the grades should be distributed like this:
     * 10% get A
     * 25% get B
     * 30% get C
     * 25% get D
     * 10% get F
     *
     * Don't stress too much on the grading, but show that you can separate students into those
     * sections and then print that out.
     *
     * @return
     */
    public String gradeClass() {
        return null;
    }
}
