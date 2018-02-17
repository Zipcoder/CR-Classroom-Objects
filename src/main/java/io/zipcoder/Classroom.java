package io.zipcoder;
import java.util.Arrays;
import java.util.Comparator;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        Student[] students = new Student[maxNumberOfStudents];
        this.students = students;

    }

    public Classroom(Student[] students) {
        this.students = students;

    }

    public Classroom() {
        Student[] students = new Student[30];
        this.students = students;

    }

    public Student[] getStudents() {
        return this.students;
    }

    public double getAverageExamScore() {
        double sum = 0.0;
        for (Student s : this.students) {
            sum += s.getAverageExamScore();
        }
        return Math.round(sum / this.students.length);
    }

    public void addStudent(Student newStudent) {
        this.students = Arrays.copyOf(this.students, this.students.length + 1);
        this.students[students.length - 1] = newStudent;
    }

    public void removeStudent(String firstName, String lastName) {
        Student studentToRemove = this.identifyStudent(firstName, lastName);
        int studentToRemoveIndex = this.identifyStudentIndex(studentToRemove);
        this.students[studentToRemoveIndex] = null;
        this.moveNullToEnd();
    }

    public Student[] getStudentsByScore() {
        Arrays.sort(this.students, byAverageScoreThenByName);

        return this.students;
    }

    public Student[] getGradeBook() {
        return null;
    }

    public Student identifyStudent(String firstName, String lastName) {
        for (Student s : this.students) {
            if (firstName.equals(s.getFirstName()) && lastName.equals(s.getLastName())) {
                return s;
            }
        }
        return null;
    }

    public int identifyStudentIndex(Student student) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == student) {
                return i;
            }
        }
        return -1;
    }

    public void moveNullToEnd() {
        Student[] temp = Arrays.copyOf(this.students, this.students.length);
        int counter = 0;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                temp[counter] = this.students[i];
                counter++;
            }
        }
        temp[temp.length - 1] = null;
        this.students = temp;
    }

    public static int sortByFirstName (Student s1, Student s2){
        int longerFirstName = s1.getFirstName().length() >= s2.getFirstName().length() ?
                s1.getFirstName().length() : s2.getFirstName().length();
        for(int i = 0; i < longerFirstName; i++) {
            if (s1.getFirstName().charAt(i) > s2.getFirstName().charAt(i)) {
                return 1;
            } else if (s1.getFirstName().charAt(i) < s2.getFirstName().charAt(i)) {
                return -1;
            }
        }
        return 0;
    }

    public static int sortByLastName (Student s1, Student s2){
        int longerLastName = s1.getLastName().length() >= s2.getLastName().length() ?
                s1.getLastName().length() : s2.getLastName().length();
        for(int i = 0; i < longerLastName; i++) {
            if (s1.getLastName().charAt(i) > s2.getLastName().charAt(i)) {
                return 1;
            } else if (s1.getLastName().charAt(i) < s2.getLastName().charAt(i)) {
                return -1;
            }
        }
        return 0;
    }

    public static Comparator<Student> byAverageScoreThenByName = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2){
            if (s1.getAverageExamScore() < s2.getAverageExamScore()) {
                return 1;
            }
            else if (s1.getAverageExamScore() > s2.getAverageExamScore()) {
                return -1;
            }
            else {
                if(s1.getLastName().equals(s2.getLastName())){
                    return sortByFirstName(s1,s2);
                }
                return sortByLastName(s1,s2);
            }
        }
    };
}






