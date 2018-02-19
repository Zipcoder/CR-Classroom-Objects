package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;


public class Classroom{
    private Student []students;
    // Helper fields
    private int studentsEnrolled;
    private int maxStudents;
    private int numOfExams = 3;

    public Classroom(Student students[], int studentsEnrolled, int maxStudents) {
        this.students = students;
        this.studentsEnrolled = studentsEnrolled;
        this.maxStudents = maxStudents;
    }

    public boolean addStudent(Student student) {
        if(students.length >= 10){
            return false;
        }
        else return true;
    }

    public Student[] removeStudent(String firstName, String lastName) {
        Student student = new Student(firstName, lastName, new ArrayList<Double>(Arrays.asList(90.00)));
            String nameToRemove = firstName + " " + lastName;
            Student[] kid = new Student[students.length];
            int seat = 0;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(student)) {
                    kid[seat] = students[i];
                    seat++;
                }
            }
            return kid;
        }

    public double getClassAverage(){
        double total = 0;
        for(Student student: students){
            student.getTestScores(student).add(total);
        }
        return total / students.length;
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
    public void getClassScores(){
        for(Student student: students){
            System.out.println(student.getTestScores(student));
        }
    }

    /**
     * Sorts the Students array from highest average to lowest, and ties are broken alphabetically.
     */
    //this method takes an arguement of an array of students (kids)
    //Looping through the array, each student will be put into a TreeMap
    // the for loop gets the Test score for a specific exam for each student and the students name
    // Then I wanted to use the comparator class to sort the scores of the students into chronological order based on score
    //Students would be ordered by their names through an if else statement for matching scores
    // if(2 values == each other, sort by name lexogically)
    public void sortStudentsByScore(Student[] kids) {
        TreeMap<Double, String> map = new TreeMap<Double, String>();
        for(Student student: students) {
            student.getTestScores(student);
            map.put(student.getTestScore(student), student.getFirstName(student));
            return Double.compare(map, treeMap);
        }
        System.out.println("Sorted Map......By Key");
                new Comparator<Double>() {
                     Double compare(Double a , Double b) {
                        return (double) a.compareTo(b);
                    }
                };
        }
//not even 100% of the syntax involved here but I want to return the double (scores) of students in order via treemap after comparing the score from greatest to least.



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

    }
}
