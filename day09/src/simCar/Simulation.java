package simCar;

public class Simulation {

	public static void main(String[] args) {
	
		// 1. ��������ϸ� �����.
		Simcar ram = new Gas("Ramborghini", "Yellow", "Sports Car", "111", 20);
		System.out.println(ram.toString());
		System.out.println();
		
		// 2. �⸧�� �ִ´�.
		Gas ramb = (Gas)ram;
		ramb.addFuel(50);
		System.out.println("Adding Fuel");
		System.out.println(ram.toString());
		System.out.println();
		
		// 3. ������ 2km ����.
		ram.go(2);
		System.out.println(ram.toString());
		System.out.println();
		
		// 4. �ڷ� 4km ����.
		ram.back(4);
		System.out.println(ram.toString());
		System.out.println();
		
	}

}
