
public class StudentSchedular {
	
	private Student[] students = new Student[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber,String name)
	{
		
		students[counterStudent++]=new Student(rollNumber,name);
		return "Student added successfully";
		
	}
	
	public void showAllStudents()
	{
		
	}

}
