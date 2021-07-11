package io.zipcoder;

import java.util.*;

public class Classroom {

    Student[] students;

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] student) {
        students = student;
    }

    public Classroom() {
        students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double sumOfExamScores = 0.0;
        for (Student student : students) {
            sumOfExamScores += student.getAverageExamScore();

        }
        return sumOfExamScores / students.length;
    }

    public void addStudent(Student student) {
        List<Student> arrayList = new ArrayList<>(Arrays.asList(students));
        arrayList.add(student);
        students = arrayList.toArray(new Student[arrayList.size()]);
    }

    public Student[] removeStudent(String firstName, String lastName) {
        List<Student> arrayList = new ArrayList<>(Arrays.asList(students));
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                arrayList.remove(student);
            }
        }
        return arrayList.toArray(new Student[arrayList.size()]);
    }

    public Student[] getStudentByScore() {
        Arrays.sort(students);
        return students;
    }

    public Map getGradeBook() {
        Map<Student, Character> map = new LinkedHashMap<>();
        Integer studentsInClass = students.length;
        getStudentByScore();
        for (int i = 0; i < studentsInClass; i++) {
            if ((((i + 1) / studentsInClass) * 100) <= 10) {
                map.put(students[i], 'A');
            }
            else if ((((i + 1) / studentsInClass) * 100) >= 11 &&
                    (((i + 1) / studentsInClass) * 100) <= 29) {
                map.put(students[i], 'B');
            }
            else if ((((i + 1) / studentsInClass) * 100) >= 30 &&
                    (((i + 1) / studentsInClass) * 100) <= 50) {
                map.put(students[i], 'C');
            }
            else if ((((i + 1) / studentsInClass) * 100) >= 51 &&
                    (((i + 1) / studentsInClass) * 100) <= 89) {
                map.put(students[i], 'D');
            }
            else {
                map.put(students[i], 'F');
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Zach", "Kitto", new Double[]{100.0});
        Student student2 = new Student("Leon", "Hunter", new Double[]{90.0});
        Student student3 = new Student("Nick", "Wolak", new Double[]{80.0});
        Student student4 = new Student("Zach", "Singer", new Double[]{70.0});
        Student student5 = new Student("Jeremy", "Sabina", new Double[]{60.0});
        Student[] array = new Student[]{student1, student2, student3, student4, student5};
        Classroom classroom = new Classroom(array);
        System.out.println(classroom.getGradeBook());
    }
}
