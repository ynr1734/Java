package multi;

public class Employee {
	private String EmpNo;
	private String name;
	private double salary;
	
	// Constructors
	public Employee() {
	}
	
	public Employee(String empNo, String name, double salary) {
		EmpNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	public double annSalary() {
		return this.salary * 12;
	}
	
	public double incentive(double inc) {
		return inc * 0.5;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpNo=" + EmpNo + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
