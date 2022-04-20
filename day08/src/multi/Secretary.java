package multi;

public class Secretary extends Employee{
	private String Boss;

	// Constructors
	public Secretary() {
	}

	public Secretary(String empNo, String name, double salary, String boss) {
		super(empNo, name, salary);
		Boss = boss;
	}
	

	@Override
	public double incentive(double inc) {
		return inc * 0.6;
	}

	@Override
	public String toString() {
		return "Secretary [Boss=" + Boss + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
