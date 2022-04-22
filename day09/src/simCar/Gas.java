package simCar;

public class Gas extends Simcar {
	
	private boolean auto;
	private double cFuel;
	private double fuelSize;
	private double fuelE;
	private String fuelType;
	
	
	public Gas() {
		
	}

	public Gas(String name, String color, String kind, String serial) {
		super(name, color, kind, serial);
	}

	public Gas(String name, String color, String kind, String serial, double fuelE) {
		super(name, color, kind, serial);
		this.auto = true;
		this.cFuel = 0;
		this.fuelSize = 100;
		this.fuelE = fuelE;
		this.fuelType = "Gas";
	}

	public double iscFuel() {
		return cFuel;
	}

	public void setcFuel(double cFuel) {
		this.cFuel = cFuel;
	}

	public boolean isAuto() {
		return auto;
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

	@Override
	public void go(int distance) {
		// 연료가 없거나 부족할 때
		if(cFuel == 0) {
			if(getStatus().equals("GO") || getStatus().equals("BACK")) {
				System.out.println("There's no fuel. This car would stop soon.");
				setStatus("STOP");
			}else {
				System.out.println("Warning. This car would stop soon.");
			}

		}else if(cFuel <= 5) {
			setStatus("GO");
			System.out.printf("GO %dkm.\n",distance);
			System.out.println("There's no fuel. This car would stop soon.");
		}else {
			setStatus("GO");
			cFuel -= distance/fuelE;
			System.out.printf("GO %dkm.\n",distance);
		}
		
	}

	@Override
	public void back(int distance) {
		if(cFuel == 0) {
			if(getStatus().equals("GO") || getStatus().equals("BACK")) {
				System.out.println("There's no fuel. This car would stop soon.");
				setStatus("STOP");
			}else {
				System.out.println("Warning. This car would stop soon.");
			}

		}else if(cFuel <= 5) {
			setStatus("BACK");
			System.out.printf("GO %dkm.\n",distance);
			System.out.println("There's no fuel. This car would stop soon.");
		}else {
			setStatus("BACK");
			cFuel -= distance/fuelE;
			System.out.printf("GO %dkm.\n",distance);
		}
		
	}
			
	public void addFuel(int fuel) {
		cFuel += fuel;
		// 현재 연료 사이즈 > 전체 사이즈 ?
		if((cFuel == 0)) {
			
		}
	}
	
	
	@Override
	public String toString() {
		return "Gas [auto=" + auto + ", fuelSize=" + fuelSize + ", fuelE=" + fuelE + ", cFuel=" + cFuel + ", fuelType="
				+ fuelType + ", toString()=" + super.toString() + "]";
	}

}
