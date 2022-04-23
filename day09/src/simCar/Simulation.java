package simCar;

public class Simulation {

	public static void main(String[] args) {
	
		// Gas Car : Ramborghini
		// 1. Ramborghini�� �����.
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
		
		// Electro Car : Tesla
		// 1. Tesla�� �����.
		Simcar ts = new Electro("Tesla", "Red", "Electronic Car", "777", 10);
		System.out.println(ts.toString());
		System.out.println();
		
		// 2. �⸧�� �ִ´�.
		Electro tsl = (Electro)ts;
		tsl.chargeBattery(80);
		System.out.println("Charging Battery");
		System.out.println(tsl.toString());
		System.out.println();
		
		// 3. ������ 5km ����.
		tsl.go(5);
		System.out.println(tsl.toString());
		System.out.println();
		
		// 4. �ڷ� 3km ����.
		tsl.back(3);
		System.out.println(tsl.toString());
		System.out.println();
		
	}

}
