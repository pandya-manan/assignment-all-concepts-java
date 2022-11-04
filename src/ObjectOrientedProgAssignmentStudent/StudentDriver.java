package ObjectOrientedProgAssignmentStudent;
import java.util.*;
public class StudentDriver {
	/*This program is just for a given task and for demonstration purpose of the task. Thanks!
	 * 
	 */
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students you want to enter: ");
		int number=sc.nextInt();
		
		List<Student> students=new ArrayList<Student>();
		for(int i=1;i<=number;i++)
		{
			//Initializing a new object of type student in each iteration
			Student student=new Student();
			//Taking roll number from the user
			System.out.println("Enter the roll number for student "+i);
			int roll=sc.nextInt();
			student.setRollNo(roll);
			//Taking the name of the student from user
			System.out.println("Enter the name of the student "+i);
			String name=sc.next();
			student.setName(name);
			
			//Adding in a final list of type Student
			students.add(student);
		}
		System.out.println("The final list of students: ");
		for(Student student:students)
		{
			System.out.println(student);
		}
	}

}
