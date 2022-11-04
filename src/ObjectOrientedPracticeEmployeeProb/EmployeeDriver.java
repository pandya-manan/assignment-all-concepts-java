package ObjectOrientedPracticeEmployeeProb;
import java.util.*;
public class EmployeeDriver {
/*This is just a program for two employees based on given task, multiple can be done in another way thanks
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee employee1=new Employee(50000,"Akash",1972602);
		Employee employee2=new Employee(120000,"Jackie",1748309);
		System.out.println("Original Data "+employee1+" "+employee2);
		
		System.out.println("Enter the employee id whose salary needs to be incremented by 10%: ");
		long empIdFromUser=sc.nextLong();
		if(employee1.getEmpId()==empIdFromUser)
		{
			int originalSalary=employee1.getSalary();
			int incrementedSalary=originalSalary+(int)(0.1*originalSalary);
			employee1.setSalary(incrementedSalary);
		}
		else if(employee2.getEmpId()==empIdFromUser)
		{
			int originalSalary=employee2.getSalary();
			int incrementedSalary=originalSalary+(int)(0.1*originalSalary);
			employee2.setSalary(incrementedSalary);
		}
		else
		{
			System.out.println("Employee id with given employee id does not exist!");
		}
		System.out.println(employee1+" "+employee2);
		
		System.out.println("Increasing salary of all employees by 10%");
		
		int originalSalary1=employee1.getSalary();
		int incrementedSalary1=originalSalary1+(int)(0.1*originalSalary1);
		employee1.setSalary(incrementedSalary1);
		
		int originalSalary2=employee2.getSalary();
		int incrementedSalary2=originalSalary2+(int)(0.1*originalSalary2);
		employee2.setSalary(incrementedSalary2);
		
		System.out.println("After increment by 10% "+employee1+" "+employee2);
	}

}
