package simCar;

public class Plug extends Simcar {

	private int batterySize;
	private double cBattery;
	private int batteryE;
	
	private double fuelSize;
	private double cFuel;
	private double fuelE;
	private String fuelType;
	
	private Boolean batteryMode;
	
	
	// constructors
	public Plug() {
		
	}

	public Plug(String name, String color, String kind, String serial) {
		super(name, color, kind, serial);
		
	}

	public Plug(String name, String color, String kind, String serial, int batteryE, 
			double fuelE) {
		super(name, color, kind, serial);
		this.batteryE = batteryE;
		this.fuelE = fuelE;
		
		this.batterySize = 100;
		this.cBattery = 0;
		this.fuelSize = 100;
		this.cFuel = 0;
		this.fuelType = "Gas";
		this.batteryMode = true;
	}

	
	public double getcBattery() {
		return cBattery;
	}

	public void setcBattery(double cBattery) {
		this.cBattery = cBattery;
	}

	public double getcFuel() {
		return cFuel;
	}

	public void setcFuel(double cFuel) {
		this.cFuel = cFuel;
	}

	public int getBatterySize() {
		return batterySize;
	}
	
	public int getBatteryE() {
		return batteryE;
	}

	public double getFuelSize() {
		return fuelSize;
	}

	public double getFuelE() {
		return fuelE;
	}

	public String getFuelType() {
		return fuelType;
	}

	public Boolean getBatteryMode() {
		return batteryMode;
	}

	@Override
	public void go(int distance) {
		double dWent = 0.0; // dwent : ������ �Ÿ�
		double dBattery = 0.0;
		
		do {
			if(getBatteryMode() == true) {
				dBattery = cBattery;
				cBattery -= distance/batteryE;
//			
				// ���͸��� ���ų� ������ ��
				if(cBattery <= 0) {
					System.out.println("0% of battery. It will be changed to the fuel mode.");
					this.batteryMode = false;
					cBattery = 0;
				// ó������ ���ư��� ? ���ᵵ ������ ?
			}else if(cBattery <= 5) {
				setStatus("GO");
				System.out.printf("GO %dkm.\n",distance);
				System.out.println("Warning! Low percentage of battery. \n");
			}
			
			setStatus("GO");
			System.out.printf("GO %dkm.\n",distance);
			
			
		}else if (getBatteryMode() == false) {
			cFuel -= distance/fuelE;
			// ���ᰡ ���ų� ������ ��
			if(cFuel <= 0) {
				if(getStatus().equals("GO") || getStatus().equals("BACK")) {
					System.out.println("There's no fuel. This car would stop soon.");
					setStatus("STOP");
				}else {
					System.out.println("No fuel. This car can't move.\n");
				}

			}else if(cFuel <= 5) {
				setStatus("GO");
				System.out.printf("GO %dkm.\n",distance);
				System.out.println("Warning! Lack of fuel.\n");
			}
			setStatus("GO");
			System.out.printf("GO %dkm.\n",distance);
		}
	}

	@Override
	public void back(int distance) {
		if(getBatteryMode() == true) {
			cBattery -= distance/batteryE;
			
			// ���͸��� ���ų� ������ ��
			if(cBattery <= 0) {
				System.out.println("0% of battery. It will be changed to the fuel mode.");
				this.batteryMode = false;
				cBattery = 0;
				// ó������ ���ư��� ? ���ᵵ ������ ?
			}else if(cBattery <= 5) {
				setStatus("BACK");
				System.out.printf("BACK %dkm.\n",distance);
				System.out.println("Warning! Low percentage of battery. \n");
			}
			
			setStatus("BACK");
			System.out.printf("BACK %dkm.\n",distance);
			
			
		}else if (getBatteryMode() == false) {
			cFuel -= distance/fuelE;
			// ���ᰡ ���ų� ������ ��
			if(cFuel <= 0) {
				if(getStatus().equals("GO") || getStatus().equals("BACK")) {
					System.out.println("There's no fuel. This car would stop soon.");
					setStatus("STOP");
				}else {
					System.out.println("No fuel. This car can't move.\n");
				}

			}else if(cFuel <= 5) {
				setStatus("BACK");
				System.out.printf("GO %dkm.\n",distance);
				System.out.println("Warning! Lack of fuel.\n");
			}
			setStatus("BACK");
			System.out.printf("BACK %dkm.\n",distance);
		}
	}

	public void addFuel(int fuel) {
		cFuel += fuel;
		// ���� ���� ������ > ��ü ������
	}
	
	public void chargeBattery(int per) {
		cBattery += per;
		// total size ���� ũ�� ?
	}
	
	
	@Override
	public String toString() {
		return "Plug [batterySize=" + batterySize + ", cBattery=" + cBattery + ", batteryE=" + batteryE + ", fuelSize="
				+ fuelSize + ", cFuel=" + cFuel + ", fuelE=" + fuelE + ", fuelType=" + fuelType + ", batteryMode="
				+ batteryMode + ", toString()=" + super.toString() + "]";
	}
	
}
