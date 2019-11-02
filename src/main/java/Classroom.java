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

    public String addStudent (Student studentToAdd){
        students.add(studentToAdd);
        StringBuilder sb = new StringBuilder();
        sb.append("\n========================================\n");
        sb.append(studentToAdd.printToString());
        sb.append("\n========================================");
        return sb.toString();
    }

}



