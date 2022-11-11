package LambdaExpressionAssignment;

public class Employee {// POJO class: plain old java object
	
	// instance data members
	Integer id;
	String name;
	Double salary;
	
	//constructors // membermethods
	
	public Employee() { // default constructor
		super();
		this.salary=0.0;
	}
	public Employee(Integer id, String name, Double salary) {// parameter constructor
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


}
