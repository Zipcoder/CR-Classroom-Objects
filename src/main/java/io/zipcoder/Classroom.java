package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Classroom {
    private final int fDEFAULT_MAX_STUDENTS = 30;
    private ArrayList<Student> students;
    private int maxStudents;

    public Classroom() {
        students = new ArrayList<>(fDEFAULT_MAX_STUDENTS);
    }

    public Classroom(int maxStudents) {
        this.maxStudents = maxStudents;
    }

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

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public boolean removeStudent(String firstName, String lastName) {
        return students.remove(getStudentByName(firstName, lastName));
    }

    /**
     * Return the average score of all of the student's average scores.
     */
    public double getClassAverage() {
        double sum = 0.0;
        for (Student s : students) {
            sum += s.getAverage();
        }
        return Math.round(sum / students.size());
    }

    public String getStudentsByScore() {
        StringBuilder sb = new StringBuilder();

        Collections.sort(students);
        Collections.reverse(students);

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
     * <p>
     * And if there are no student's, just return No students.
     * <p>
     * The way the grading is done is by a bell curve where, ideally, the grades should be distributed like this:
     * 10% get A
     * 25% get B
     * 30% get C
     * 25% get D
     * 10% get F
     * <p>
     * Don't stress too much on the grading, but show that you can separate students into those
     * sections and then print that out.
     *
     * @return
     */

    /**
     * A bell curve is a natural distribution pattern, not a method of grading. Think about
     * what would happen if a class of ten students all scored within 10 points of a perfect
     * score on a 100 point test, each having a unique score. Forcing this class into a bell
     * curve would mean the student that scored a 100% has an A and the student that
     * scored a 90% has been labeled a 'failure' and effectively disenfranchised for
     * retaining 90% of the tested material. Unacceptable.
     * - v
     */
    public String gradeClass() {
        StringBuilder sb = new StringBuilder();

        Collections.sort(students);
        Collections.reverse(students);
        double ratio = 100 / students.get(0).getAverage();
        sb.append("    Student    Curved Grade\n---------------------------\n");
        for (Student s : students) {
            sb.append(String.format("%8s %-8s %5.1f %2s\n",
                    s.getFirstName(),
                    s.getLastName(),
                    (ratio * s.getAverage()),
                    getLetterGrade(ratio * s.getAverage())));
        }
        return sb.toString();
    }

    /**
     * Give students the grade they earn (assuming test fairness)
     * @param grade the final grade to be assigned a letter
     * @return the letter grade
     */
    private String getLetterGrade(double grade) {
        if (grade >= 90)
            return "A";
        else if (grade >= 80)
            return "B";
        else if (grade >= 70)
            return "C";
        else if (grade >= 60)
            return "D";

        return "F";
    }
}
