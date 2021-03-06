package simCar;

public class Simulation {

	public static void main(String[] args) {
	
		// Gas Car : Ramborghini
		// 1. Ramborghini를 만든다.
		Simcar ram = new Gas("Ramborghini", "Yellow", "Sports Car", "111", 20);
		System.out.println(ram.toString());
		System.out.println();
		
		// 2. 기름을 넣는다.
		Gas ramb = (Gas)ram;
		ramb.addFuel(50);
		System.out.println("Adding Fuel");
		System.out.println(ram.toString());
		System.out.println();
		
		// 3. 앞으로 2km 간다.
		ram.go(2);
		System.out.println(ram.toString());
		System.out.println();
		
		// 4. 뒤로 4km 간다.
		ram.back(4);
		System.out.println(ram.toString());
		System.out.println();
		
		// Electro Car : Tesla
		// 1. Tesla를 만든다.
		Simcar ts = new Electro("Tesla", "Red", "Electronic Car", "777", 10);
		System.out.println(ts.toString());
		System.out.println();
		
		// 2. 기름을 넣는다.
		Electro tsl = (Electro)ts;
		tsl.chargeBattery(80);
		System.out.println("Charging Battery");
		System.out.println(tsl.toString());
		System.out.println();
		
		// 3. 앞으로 5km 간다.
		tsl.go(5);
		System.out.println(tsl.toString());
		System.out.println();
		
		// 4. 뒤로 3km 간다.
		tsl.back(3);
		System.out.println(tsl.toString());
		System.out.println();
		
	}

}
