package simCar;

public class Simulation {

	public static void main(String[] args) {
	
		// 1. 람보르기니를 만든다.
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
		
	}

}
