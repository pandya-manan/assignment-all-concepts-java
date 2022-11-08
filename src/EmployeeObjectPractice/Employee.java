package EmployeeObjectPractice;

public class Employee {
	
	private int salary;
	private String name;
	private long empId;
	public Employee(int salary, String name, long empId) {
		super();
		this.salary = salary;
		this.name = name;
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", empId=" + empId + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
