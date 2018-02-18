package io.zipcoder;

import java.util.*;

public class Classroom {

    static int averageOrder;
    static int firstNameOrder;
    static int lastNameOrder;
    ArrayList<Student> students = new ArrayList<>();

    public Classroom(int maxNumberOfStudents) {
        ArrayList<Student> students = new ArrayList<>(maxNumberOfStudents);
    }

    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }

    public Classroom() {
        this(30);
    }

    public String[] getStudents() {
        String[] studentsArrayToString = new String[students.size()];
        int studentsArrayIndex = 0;
        for (Student student : students) {
            studentsArrayToString[studentsArrayIndex] = student.toString();
            studentsArrayIndex++;
        }

        return studentsArrayToString;

    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Student aStudent : students) {
            builder.append("============================\n");
            builder.append("[]\n");
            builder.append("============================\n");
            builder.append("Student Name: ");
            builder.append(aStudent.getFirstName() + " ");
            builder.append(aStudent.getLastName() + "\n");
            builder.append("> Average Score: ");
            builder.append(aStudent.getAverageScoreForAStudent(aStudent.getTestScores()) + "\n");
        }
        return builder.toString();
    }

    public Double getAverageExamScore() {

        Double classAverageTotal = 0.0;

        for (int i = 0; i < students.size(); i++) {
            classAverageTotal += students.get(i).getAverageScoreForAStudent(students.get(i).getTestScores());
        }
        Double averageExamScore = classAverageTotal / students.size();

        return averageExamScore;

    }

    public void removeStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                students.remove(student);
            }
        }
    }

    public String getGradeBook() {

        Collections.sort(this.students, myComparator);
        StringBuilder builder = new StringBuilder();
        builder.append("Grade Book\n");
        builder.append("First Name      Last Name         Grade");

        for (int i = 0; i < students.size(); i++) {
            if (100 * (i + 1) / students.size() <= 10) {
                builder.append(students.get(i).getFirstName()+"     "+students.get(i).getLastName()+"   "+"A\n");
            } else if (10 < 100 * (i + 1) / students.size() && 100 * (i + 1) / students.size() <= 29) {
                builder.append(students.get(i).getFirstName()+"     "+students.get(i).getLastName()+"   "+"B\n");
            } else if (30 < 100 * (i + 1) / students.size() && 100 * (i + 1) / students.size() <= 50) {
                builder.append(students.get(i).getFirstName()+"     "+students.get(i).getLastName()+"   "+"C\n");
            } else if (51 < 100 * (i + 1) / students.size() && 100 * (i + 1) / students.size() <= 89) {
                builder.append(students.get(i).getFirstName()+"     "+students.get(i).getLastName()+"   "+"D\n");
            } else builder.append(students.get(i).getFirstName()+"     "+students.get(i).getLastName()+"   "+"F\n");
        }
        return builder.toString();

    }


    public String[] getStudentByScore() {

        Collections.sort(this.students, myComparator);
        String[] sortedArrayList = this.getStudents();
        return sortedArrayList;
    }

    static final Comparator<Student> myComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if ((s1.getAverageScoreForAStudent(s1.getTestScores()) > s2.getAverageScoreForAStudent(s2.getTestScores()))) {
                return s2.getAverageScoreForAStudent(s2.getTestScores()).compareTo
                        (s1.getAverageScoreForAStudent(s1.getTestScores()));
            } else if ((s1.getAverageScoreForAStudent(s1.getTestScores())) ==
                    (s2.getAverageScoreForAStudent(s2.getTestScores()))) {
                if (s1.getFirstName().equals(s2.getFirstName())) {
                    return s1.getLastName().compareTo(s2.getLastName());
                } else {
                    return s1.getFirstName().compareTo(s2.getFirstName());
                }
            }

            return s2.getAverageScoreForAStudent(s2.getTestScores()).compareTo
                    (s1.getAverageScoreForAStudent(s1.getTestScores()));
        }

    };


    public static void main(String[] args) {

        int maxNumberOfStudents = 10;
        Classroom classroom = new Classroom(maxNumberOfStudents);

        ArrayList<Double> scores1 = new ArrayList<>();
        scores1.add(180.0);
        scores1.add(150.0);
        scores1.add(250.0);
        scores1.add(140.0);
        Student student1 = new Student("Thomas", "Robert", scores1);
        classroom.addStudent(student1);

        ArrayList<Double> scores2 = new ArrayList<>();
        scores2.add(150.0);
        scores2.add(180.0);
        scores2.add(225.0);
        scores2.add(190.0);
        Student student2 = new Student("Mary", "Abraham", scores2);
        classroom.addStudent(student2);


        ArrayList<Double> scores3 = new ArrayList<>();
        scores3.add(180.0);
        scores3.add(150.0);
        scores3.add(250.0);
        scores3.add(200.0);
        Student student3 = new Student("Natalie", "Albert", scores3);
        classroom.addStudent(student3);

        ArrayList<Double> scores4 = new ArrayList<>();
        scores4.add(200.0);
        scores4.add(250.0);
        scores4.add(175.0);
        scores4.add(70.0);
        Student student4 = new Student("Eduardo", "Rodrigez", scores4);
        classroom.addStudent(student4);

        ArrayList<Double> scores5 = new ArrayList<>();
        scores5.add(180.0);
        scores5.add(100.0);
        scores5.add(250.0);
        scores5.add(200.0);
        Student student5 = new Student("Natalie", "Richard", scores5);
        classroom.addStudent(student5);

        ArrayList<Double> scores6 = new ArrayList<>();
        scores6.add(180.0);
        scores6.add(100.0);
        scores6.add(150.0);
        scores6.add(280.0);
        Student student6 = new Student("Efrem", "Gebray", scores6);
        classroom.addStudent(student6);

        ArrayList<Double> scores7 = new ArrayList<>();
        scores7.add(150.0);
        scores7.add(180.0);
        scores7.add(125.0);
        scores7.add(130.0);
        Student student7 = new Student("Melat", "Abraha", scores7);
        classroom.addStudent(student7);


        ArrayList<Double> scores8 = new ArrayList<>();
        scores8.add(180.0);
        scores8.add(150.0);
        scores8.add(120.0);
        scores8.add(200.0);
        Student student8 = new Student("Bereket", "Negash", scores8);
        classroom.addStudent(student8);

        ArrayList<Double> scores9 = new ArrayList<>();
        scores9.add(200.0);
        scores9.add(150.0);
        scores9.add(175.0);
        scores9.add(70.0);
        Student student9 = new Student("Meda", "Tecle", scores9);
        classroom.addStudent(student9);

        ArrayList<Double> scores10 = new ArrayList<>();
        scores10.add(140.0);
        scores10.add(150.0);
        scores10.add(250.0);
        scores10.add(200.0);
        Student student10 = new Student("Bryan", "Scot", scores10);
        classroom.addStudent(student10);


        System.out.println(Arrays.toString(classroom.getStudentByScore()));

    }
}
