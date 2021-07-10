package io.zipcoder;

public class Classroom {

        private Student[] students;
        private int maxNumOfStudents;


        public Classroom() {
                this.students = new Student[30];
        }

        public Classroom(int maxNumOfStudents){
                this.students = new Student[maxNumOfStudents];

        }

        public Classroom(Student...students){
                this.students = students;
        }

        public Student[] getStudents() {
                return students;
        }

        public double getAverageExamScore(){
                double total = 0;
                for (Student s: students){
                       total+= s.getAverageExamScore();
                }

                double average = total/(getStudents().length);

                return average;
        }
}
