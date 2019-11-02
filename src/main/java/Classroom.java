import io.zipcoder.Student;



import java.util.ArrayList;
import java.util.List;

public class Classroom {

    //instance variables
    private ArrayList<Student> students;
    private Integer maxNumberOfStudents;

    //Nullary Constructor
    public Classroom() {
        students = new ArrayList<Student>(30);
        this.students = students;
    }

    //Constructor with int maxNumberOfStudents
    public Classroom(Integer maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
        students = new ArrayList<>(maxNumberOfStudents);
    }

    //Constructor with the students <list> representative of the collection of student objects this classroom will store.
    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }


    //Getters
    public ArrayList<Student> getStudents() {
        return students;
    }

    public Integer getMaxNumOfStudents() {
        return maxNumberOfStudents;
    }

    public Double getAverageExamScore() {
        Double totalExamScores = 0.0;
        int numOfStudents = students.size();

        for (int i = 0; i < students.size(); i++) {
            totalExamScores += students.get(i).getAverageExamScore();
        }
        return totalExamScores / numOfStudents;
    }

    public void addStudent (Student studentToAdd){
        //StringBuilder sb = new StringBuilder();
        students.add(studentToAdd);
//        sb.append("\n========================================\n");
//        sb.append(studentToAdd.printToString());
//        sb.append("========================================");
        //return sb.toString();
    }

    public void removeStudent (String firstName, String lastName){
        for (int i = 0; i < students.size(); i++) {
             if(students.get(i).equals(firstName) && students.get(i).equals(lastName)){
                 students.remove(i);
            }
        }

    }

}



