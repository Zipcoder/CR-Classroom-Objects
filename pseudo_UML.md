# Classes
#### Classroom
	* Collection<Student> students (get)
		(compare by average score, data structure tbd)
	
	+ Classroom() -> empty ArrayList<Student> w/ cap=30
	+ Classroom(int maxStudents)
	+ Classroom(ArrayList<Student> students)
	+ getAverageExamScore()
	+ addStudent(Student student)
	+ removeStudent(String firstName, String lastName)
	+ getStudentsByScore()
		decending order by average score, equal scores lexigraphically
	+ getGradeBook()
	+ gradeClass()
		A top 10 percentile
		B 25-29 percentile
		C 30-50 percentile
		D 51-89 percentile
		F lower 10 percentile
#### Student
	* String firstName (get/set)
	* String lastName (get/set)
	* ArrayList<Double> examScores (get)
	
	+ Student(String first, String last, Double[] scores)
	+ takeExam()
	+ getNumberOfExamsTaken()
	+ addExamScore(double examScore)
	+ setExamScore(int examNumber, double newScore)
	+ getAverageExamScore()
	+ toString()
			Average Score: 125
				Exam 1 -> 100
				Exam 2 -> 150
				Exam 3 -> 250
				Exam 4 -> 0