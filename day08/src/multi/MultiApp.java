package multi;

public class MultiApp {

	public static void main(String[] args) {
		// 1. ��� �� ��ü�� �����ϰ� ����Ͻÿ�.
		Employee e[] = new Employee[4];
		e[0] = new Employee("100", "Kim", 300);
		e[1] = new Secretary("101", "Lee", 350, "Yoon");
		e[2] = new Salesman("102", "Hong", 300, "Seoul", 400, 200);
		e[3] = new Manager("103", "jin", 500, 200);
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].toString());
		}
		
		// 2. ��� ������� ���� ������ ����Ͻÿ�.
		System.out.println("\n [Annual salary]");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getClass().getSimpleName() + ": " + e[i].annSalary());
		}
		
		// 3. ��� ������� �μ�Ƽ�긦 �����ϰ��� �Ѵ�.
		System.out.println("\n [Incentive]");
		double incentive = 200;
		for (int i = 0; i < e.length; i++) {
			double earnedInc = 0.0;
			earnedInc = e[i].incentive(incentive);
			System.out.println(e[i].getClass().getSimpleName() + ": " + earnedInc);
		}

	}
}