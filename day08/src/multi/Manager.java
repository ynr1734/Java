package multi;

public class Manager extends Employee {
	private double bonus;

	// Constructors
	public Manager() {
	}

	public Manager(String empNo, String name, double salary, double bonus) {
		super(empNo, name, salary);
		this.bonus = bonus;
	}

	@Override
	public double incentive(double inc) {
		return inc;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}
	
	
}
