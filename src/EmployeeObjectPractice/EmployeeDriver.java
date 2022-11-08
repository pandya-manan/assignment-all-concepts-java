package EmployeeObjectPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDriver {
	
	public static void updateSalaryForAllEmployees(List<Employee> employees)
	{
		for(Employee employee:employees)
		{
			int originalSalaryEmployee1=employee.getSalary();
			int incrementedSalaryEmployee1=(int)(1.1*originalSalaryEmployee1);
			employee.setSalary(incrementedSalaryEmployee1);
		}
	}
	
	public static Employee updateSalaryBasedOnEmployeeId(List<Employee> employees,long employeeId)
	{
		Employee impactedEmployee=new Employee();
		for(Employee employee:employees)
		{
			if(employee.getEmpId()==employeeId)
			{
				int originalSalary=employee.getSalary();
				int incrementedSalary=(int)(1.1*originalSalary);
				employee.setSalary(incrementedSalary);
				impactedEmployee=employee;
				break;
			}
		}
		return impactedEmployee;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees to be created: ");
		int numberOfEmployees=sc.nextInt();
			
		List<Employee> employees=new ArrayList<Employee>();
		for(int i=1;i<=numberOfEmployees;i++)
		{
			//Initializing a new object of type student in each iteration
			Employee employee=new Employee();
			//Taking roll number from the user
			System.out.println("Enter the salary ctc for employee "+i);
			int salary=sc.nextInt();
			employee.setSalary(salary);
			System.out.println("Enter the name of the employee "+i);
			String name=sc.next();
			employee.setName(name);
			System.out.println("Enter the employee id "+i);
			//Taking the name of the student from user
			long employeeId=sc.nextLong();
			employee.setEmpId(employeeId);
			
			
			//Adding in a final list of type Student
			employees.add(employee);
		}
		
		updateSalaryForAllEmployees(employees);
		System.out.println("After updation of all employees' salary by 10%");
		for(Employee employee:employees)
		{
			System.out.print(employee+" ");
		}
		System.out.println();
		System.out.println("Enter the employee id whose salary needs to be updated by 10%: ");
		long employeeIdForSalaryUpdate=sc.nextLong();
		Employee updatedSoloEmployee=updateSalaryBasedOnEmployeeId(employees, employeeIdForSalaryUpdate);
		System.out.println("The salary update based on user input employee id is: "+updatedSoloEmployee);
		
	}

}
