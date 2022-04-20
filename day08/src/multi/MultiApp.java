package multi;

public class MultiApp {

	public static void main(String[] args) {
		// 1. 사원 별 객체를 생성하고 출력하시오.
		Employee e[] = new Employee[4];
		e[0] = new Employee("100", "Kim", 300);
		e[1] = new Secretary("101", "Lee", 350, "Yoon");
		e[2] = new Salesman("102", "Hong", 300, "Seoul", 400, 200);
		e[3] = new Manager("103", "jin", 500, 200);
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].toString());
		}
		
		// 2. 모든 사원에게 연봉 정보를 출력하시오.
		System.out.println("\n [Annual salary]");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getClass().getSimpleName() + ": " + e[i].annSalary());
		}
		
		// 3. 모든 사원에게 인센티브를 지급하고자 한다.
		System.out.println("\n [Incentive]");
		double incentive = 200;
		for (int i = 0; i < e.length; i++) {
			double earnedInc = 0.0;
			earnedInc = e[i].incentive(incentive);
			System.out.println(e[i].getClass().getSimpleName() + ": " + earnedInc);
		}

	}
}