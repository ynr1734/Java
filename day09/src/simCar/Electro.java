package simCar;

public class Electro extends Simcar {

	private int batterySize;
	private double cBattery;
	private int batteryE;
	
	// constructors
	public Electro() {
		
	}

	public Electro(String name, String color, String kind, String serial) {
		super(name, color, kind, serial);
		
	}

	public Electro(String name, String color, String kind, String serial, int batteryE) {
		super(name, color, kind, serial);
		this.batterySize = 100;
		this.cBattery = 0;
		this.batteryE = batteryE;
	}
		
	public double getcBattery() {
		return cBattery;
	}

	public void setcBattery(double cBattery) {
		this.cBattery = cBattery;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public int getBatteryE() {
		return batteryE;
	}

	@Override
	public void go(int distance) {
		cBattery -= distance/batteryE;
		
		// 배터리가 없거나 부족할 때
		if(cBattery <= 0) {
			if(getStatus().equals("GO") || getStatus().equals("BACK")) {
				System.out.println("0% of battery. This car would stop soon.");
				setStatus("STOP");
				
			}else {
				System.out.println("0% of battery. This car can't move.\n");
			}

		}else if(cBattery <= 5) {
			setStatus("GO");
			System.out.printf("GO %dkm.\n",distance);
			System.out.println("Warning! Low percentage of battery.\n");
			
		}else {
			setStatus("GO");
			System.out.printf("GO %dkm.\n",distance);
		}
	}
	
	@Override
	public void back(int distance) {
		cBattery -= distance/batteryE;
		
		// 배터리가 없거나 부족할 때
		if(cBattery <= 0) {
			if(getStatus().equals("GO") || getStatus().equals("BACK")) {
				System.out.println("There's no battery. This car would stop soon.");
				setStatus("STOP");
				
			}else {
				System.out.println("0% of Battery. This car can't move. \n");
			}

		}else if(cBattery <= 5) {
			setStatus("BACK");
			System.out.printf("Back %dkm.\n",distance);
			System.out.println("Warning! Low percentage of Battery. \n");
			
		}else {
			setStatus("BACK");
			System.out.printf("Back %dkm.\n",distance);
		}
	}
	
	public void chargeBattery(int per) {
		// total size 보다 클 때
		if((cBattery += per) >= batterySize) {
			System.out.println("Battery is fully charged");
			cBattery = 100;
		}else {
			cBattery += per;
		}
	}
	
	@Override
	public String toString() {
		return "Electro [batterySize=" + batterySize + ", cBattery=" + cBattery + ","
				+ " batteryE=" + batteryE + ",\n toString()=" + super.toString() + "]";
	}

}
