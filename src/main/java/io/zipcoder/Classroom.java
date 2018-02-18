package io.zipcoder;

import java.text.DecimalFormat;
import java.util.*;

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
    public Student[] removeStudent(String firstName, String lastName) {
        ArrayList<Student> postRemoval = new ArrayList<Student>();
        Student[] postFormat = new Student[this.maxStudents];
        for (int i = 0; i < this.studentsEnrolled; i++){
            checkStudentEquivilenceAddToList(firstName, lastName, postRemoval, students[i]);
        }
        if (this.studentsEnrolled == postRemoval.size()) return null;
        int index = 0;
        createReturnArray(postRemoval, postFormat, index);
        return postFormat;
    }

    private void createReturnArray(ArrayList<Student> postRemoval, Student[] postFormat, int index) {
        for (Student keeper:postRemoval) {
            postFormat[index] = keeper;
            index++;
        }
    }

    private void checkStudentEquivilenceAddToList(String firstName, String lastName, ArrayList<Student> postRemoval, Student student) {
        if (!(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))){
            postRemoval.add(student);
        }
    }

    /**
     * Return the average score of all of the student's average scores.
     */
    public double getClassAverage(){
        Double totalAverages = 0.0;
        for (Student testTaker : this.students) {
            totalAverages = assembleAverageTotal(totalAverages, testTaker);
        }
        return findAverageOfAverages(totalAverages);
    }

    private double findAverageOfAverages(Double totalAverages) {
        totalAverages = totalAverages * 10;
        DecimalFormat grading = new DecimalFormat("#.##");
        return Double.parseDouble(grading.format((totalAverages/10)/this.studentsEnrolled));
    }

    private Double assembleAverageTotal(Double totalAverages, Student testTaker) {
        if (testTaker != null) {
            totalAverages += testTaker.getAverage();
        }
        return totalAverages;
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
        if (this.studentsEnrolled == 0) return "No Students";
        StringBuilder finalOutput = new StringBuilder("Students:\n");
        finalOutputAssembler(finalOutput);
        return finalOutput.toString();
    }

    private void finalOutputAssembler(StringBuilder finalOutput) {
        for (Student validStudent : this.students){
            if (validStudent != null){
                finalOutput.append(validStudent.getFirstName() + " " + validStudent.getLastName() + " -> "
                        + validStudent.getAverage() + "\n");
            }
        }
    }

    /**
     * Sorts the Students array from highest average to lowest, and ties are broken alphabetically.
     */
    public void sortStudentsByScore() {
        //ArrayList<Student> inputArrayList = new ArrayList<Student>();
        Student[] inputArray = new Student[studentsEnrolled];
        int firstIndex = 0;
        for (Student validStudent:this.students) {
            if (validStudent != null){
                inputArray[firstIndex] = validStudent;
                firstIndex++;
            }
        }
        //listSorter(inputArrayList);
        Arrays.sort(inputArray, studentComparator);
        int index = 0;
        for (Student sortedStudent:inputArray) {
            this.students[index] = sortedStudent;
            System.out.println(sortedStudent.getFirstName());
            index++;
        }

    }

//    private void listSorter(ArrayList<Student> inputArrayList) {
//        Collections.sort(inputArrayList, new Comparator<Student>(){
//            public int compare(Student s1, Student s2) {
//                return s2.getAverage().compareTo(s1.getAverage());
//            }
//        });
//    }

    private void listSorter(ArrayList<Student> inputArrayList){

    }
    Comparator<Student> studentComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            double difference = o2.getAverage() - o1.getAverage();
            if (difference == 0.0){
                difference = o2.getLastName().compareTo(o1.getLastName());
            }
            return ((int) difference);
        }
    };

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
