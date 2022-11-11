package com.employee.exception;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee(14432,"","",5000.0);
		
		try
		{
			System.out.println("The Employee Details: "+employee1.toString());
			Double retrievedSalary=employee1.getSalary();
			if (retrievedSalary<3000.0)
			{
				throw new EmployeeSalaryException("The salary is less than 3000 Rupees for employee-> "+employee1.getEmpId());
			}
			String firstName=employee1.getFirstName();
			String lastName=employee1.getLastName();
			
			if ((firstName.isBlank()|| firstName.isEmpty()) && (lastName.isBlank()||lastName.isEmpty()))
			{
				throw new EmployeeNameException("First Name and Last Name is Blank for employee-> "+employee1.getEmpId());
			}
			
		}
		catch(EmployeeSalaryException empEx)
		{
			System.out.println("The exception caught is: "+empEx.getMessage());
		}
		catch(EmployeeNameException empNameExp)
		{
			System.out.println("The exception caught is: "+empNameExp.getMessage());
		}
	}

}
