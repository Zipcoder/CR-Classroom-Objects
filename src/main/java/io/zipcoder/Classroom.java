package io.zipcoder;

public class Classroom {
    private Student[] students;
    // Helper fields
    private int studentsEnrolled;
    private int maxStudents;

    /**
     * Empty constructor.  You get to decide what max students should default to.
     */
    public Classroom(Student[] studentList, int studentsEnrolled, int maxStudents) {
        this.studentsEnrolled = studentsEnrolled;
        this.maxStudents = maxStudents;
        this.students = new Student[maxStudents];
        int index = 0;
        for (Student student:studentList) {
            students[index] = student;
            index++;
        }
    }

    public Classroom(){
        this.studentsEnrolled = 0;
        this.maxStudents = 10;
        this.students = new Student[10];
    }

    public int getStudentsEnrolled(){
        return this.studentsEnrolled;
    }

    /**
     * Constructor where the caller defines what maxStudents is.
     * @param maxStudents
     */
    public Classroom(int maxStudents) {
        this.maxStudents = maxStudents;
        this.students = new Student[maxStudents];
        this.studentsEnrolled = 0;
    }

    /**
     * Constructor that builds a class from an existing Student array.
     *
     */
    public Classroom(Student[] studentArray) {
        this.students = new Student[10];
        this.maxStudents = 10;
        this.studentsEnrolled = studentArray.length;
        int index = 0;
        for (Student student:studentArray) {
            students[index] = student;
            index++;
        }

    }

    public Student[] getStudents(){
        return this.students;
    }

    /**
     * Adds a student to the class, and returns true.
     * If you cannot add any more students, then return false and print an error statement.
     * @param student
     * @return
     */
    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
                return true;
            }
        }
        return false;
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
    public String getClassScores(){
        return null;
    }

    /**
     * Sorts the Students array from highest average to lowest, and ties are broken alphabetically.
     */
    public void sortStudentsByScore() {

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
