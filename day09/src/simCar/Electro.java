package simCar;

public class Electro extends Simcar {

	private int batterySize;
	private int cBattery;
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
		
	public int getcBattery() {
		return cBattery;
	}

	public void setcBattery(int cBattery) {
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
		if(cBattery == 0) {
			if(getStatus().equals("GO") || getStatus().equals("BACK")) {
				System.out.println("There's no battery. This car would stop soon.");
				setStatus("STOP");
			}else {
				System.out.println("Warning. This car would stop soon.");
			}

		}else if(cBattery <= 5) {
			setStatus("GO");
			System.out.printf("GO %dkm.\n",distance);
			System.out.println("There's no battery. This car would stop soon.");
		}else {
			setStatus("GO");
			cBattery -= distance/batteryE;
			System.out.printf("GO %dkm.\n",distance);
		}
		
	}
	
	
	@Override
	public void back(int distance) {
		if(cBattery == 0) {
			if(getStatus().equals("GO") || getStatus().equals("BACK")) {
				System.out.println("There's no battery. This car would stop soon.");
				setStatus("STOP");
			}else {
				System.out.println("Warning. This car would stop soon.");
			}

		}else if(cBattery <= 5) {
			setStatus("BACK");
			System.out.printf("BACK %dkm.\n",distance);
			System.out.println("There's no battery. This car would stop soon.");
		}else {
			setStatus("BACK");
			cBattery -= distance/batteryE;
			System.out.printf("BACK %dkm.\n",distance);
		}
		
	}
	public void chargeBattery(int per) {
		if((cBattery += per) >= batterySize) {
			System.out.println("Battery is fully charged");
			cBattery = 100;
		}else {
			cBattery += per;
		}
	}
	
	@Override
	public String toString() {
		return "Electro [batterySize=" + batterySize + ", cBattery=" + cBattery + ", batteryE=" + batteryE
				+ ", toString()=" + super.toString() + "]";
	}

}
