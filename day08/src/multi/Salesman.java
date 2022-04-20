package multi;

public class Salesman extends Employee {
	private String region;
	private double goals;
	private double achievedGoals;
	
	// Constructors
	public Salesman() {
	}
	
	public Salesman(String empNo, String name, double salary, String region, double goals, double achivedGoals) {
		super(empNo, name, salary);
		this.region = region;
		this.goals = goals;
		this.achievedGoals = achivedGoals;
	}

	
	@Override
	public double incentive(double inc) {
		if (achievedGoals >= (goals * 0.9)) {
			return inc;
		}else if (achievedGoals >= (goals * 0.7)) {
			return inc * 0.8;
		}else if (achievedGoals >= (goals * 0.5)) {
			return inc * 0.5;
		}else {
			return inc * 0.3;
		}
	}

	@Override
	public String toString() {
		return "Salesman [region=" + region + ", goals=" + goals + ", achievedGoals=" + achievedGoals + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
