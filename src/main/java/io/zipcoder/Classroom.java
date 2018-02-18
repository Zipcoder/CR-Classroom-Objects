package io.zipcoder;


import java.util.*;

public class Classroom {
    private Student[] students;
    // Helper fields
    private int studentsEnrolled;
    private int maxStudents;

    /**
     * Empty constructor.  You get to decide what max students should default to.
     */
    public Classroom() {
        this.students = new Student[30];
    }

    /**
     * Constructor where the caller defines wht maxStudents is.
     *
     * @param maxStudents
     */
    public Classroom(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    /**
     * Constructor that builds a class from an existing Student array.
     *
     * @param students
     */
    public Classroom(Student[] students) {
        this.students = students;
    }

    //code begin

    public Student[] getStudents() {
        return this.students;
    }

    public String getAverageExamScore() {
        Double result = 0.0;
        for (Student entry : students) {
            result += Double.valueOf(entry.getAverageExamScore());
        }
        return result.toString();
    }

    /**
     * Adds a student to the class, and returns true.
     * If you cannot add any more students, then return false and print an error statement.
     *
     * @param student
     * @return
     */
    public boolean addStudent(Student student) {
        Student[] temp = new Student[this.students.length + 1];
        System.arraycopy(this.students, 0, temp, 0, this.students.length);
        temp[temp.length - 1] = student;
        if (temp.length <= 30) {
            this.students = temp;
            return true;
        }
        return false;
    }

    /**
     * Returns the student with the firstName and lastName, and removes them from the array.
     * If there is no student, return null.
     * NOTE: You're going to want to move some students around in the array so that there are no empty spaces in the
     * middle.
     *
     * @param firstName
     * @param lastName
     * @return
     */
    public boolean removeStudent(String firstName, String lastName) {
        ArrayList<Student> buffer = new ArrayList<Student>();
        int lengthStorage = students.length;
        for (Student entry : students) {
            if (entry.getFirstName() != firstName && entry.getLastName() != lastName) {
                buffer.add(entry);
            }
        }
        students = buffer.toArray(new Student[buffer.size()]);
        if (students.length == lengthStorage) {
            return false;
        }
        return true;
    }

    public Student[] getStudentsByScore() {
        Arrays.sort(this.students, averageScoresThenLexigraphically);
        return students;
    }

    public TreeMap<String, ArrayList<String>> getGradeBook() {
        Student[] listOfStudentsToBePlaceed = getStudentsByScore();
        int aGrade = (int) Math.ceil(((double) listOfStudentsToBePlaceed.length) * 0.10);
        int bGrade = (int) Math.ceil(((double) listOfStudentsToBePlaceed.length) * 0.29);
        int cGrade = (int) Math.ceil(((double) listOfStudentsToBePlaceed.length) * 0.50);
        int dGrade = (int) Math.ceil(((double) listOfStudentsToBePlaceed.length) * 0.89);
        int fGrade = (int) Math.ceil(((double) listOfStudentsToBePlaceed.length) * 1);
        TreeMap<String, ArrayList<String>> gradeBook = new TreeMap<String, ArrayList<String>>();
        ArrayList<String> aStudents = new ArrayList<String>();
        ArrayList<String> bStudents = new ArrayList<String>();
        ArrayList<String> cStudents = new ArrayList<String>();
        ArrayList<String> dStudents = new ArrayList<String>();
        ArrayList<String> fStudents = new ArrayList<String>();
        for(int i = 0; i < listOfStudentsToBePlaceed.length; i++){
            if(i <= aGrade){
                aStudents.add(listOfStudentsToBePlaceed[i].getFirstName() + " " + listOfStudentsToBePlaceed[i].getLastName());
            } else if(i > aGrade && i <= bGrade){
                bStudents.add(listOfStudentsToBePlaceed[i].getFirstName() + " " + listOfStudentsToBePlaceed[i].getLastName());
            } else if(i > bGrade && i <= cGrade){
                cStudents.add(listOfStudentsToBePlaceed[i].getFirstName() + " " + listOfStudentsToBePlaceed[i].getLastName());
            } else if(i > cGrade && i <= dGrade){
                dStudents.add(listOfStudentsToBePlaceed[i].getFirstName() + " " + listOfStudentsToBePlaceed[i].getLastName());
            } else if (i <= fGrade && i > dGrade){
                fStudents.add(listOfStudentsToBePlaceed[i].getFirstName() + " " + listOfStudentsToBePlaceed[i].getLastName());
            }
        }
        gradeBook.put("A", aStudents);
        gradeBook.put("B", bStudents);
        gradeBook.put("C", cStudents);
        gradeBook.put("D", dStudents);
        gradeBook.put("F", fStudents);

        return gradeBook;
    }


    //comparator
    public static Comparator<Student> averageScoresThenLexigraphically = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            if (Double.valueOf(o1.getAverageExamScore()) < Double.valueOf(o2.getAverageExamScore())) {
                return 1;
            } else if (Double.valueOf(o1.getAverageExamScore()) > Double.valueOf(o2.getAverageExamScore())) {
                return -1;
            } else {
                int nameCounter = (o1.getFirstName().length() > o2.getFirstName().length() ? o1.getFirstName().length() : o2.getFirstName().length());
                for (int i = 0; i < nameCounter; i++) {
                    if (o1.getFirstName().charAt(i) < o2.getFirstName().charAt(i)) {
                        return 1;
                    } else if (o1.getFirstName().charAt(i) > o2.getFirstName().charAt(i)) {
                        return -1;
                    }
                }
                int nameCounter2 = (o1.getLastName().length() > o2.getLastName().length() ? o1.getLastName().length() : o2.getLastName().length());
                for (int j = 0; j < nameCounter2; j++) {
                    if (o1.getLastName().charAt(j) < o2.getLastName().charAt(j)) {
                        return 1;
                    } else if (o1.getLastName().charAt(j) > o2.getLastName().charAt(j)) {
                        return -1;
                    }
                }
                return 0;
            }

        }
    };
}

