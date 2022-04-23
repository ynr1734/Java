package simCar;

public abstract class Simcar {
	private String name;
	private String color;
	private String kind;
	private String serial;
//	private int maxPeople;
//	private int power;
//	private int made;
//	private int year;
	private String status;
	
	// Constructors
	public Simcar() {
	}

	public Simcar(String name, String color, String kind, String serial) {
		this.name = name;
		this.color = color;
		this.kind = kind;
		this.serial = serial;
		this.status = "PARK";
	}

	// Methods
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getKind() {
		return kind;
	}

	public String getSerial() {
		return serial;
	}
	
	public abstract void go(int distance);

	public abstract void back(int distance); 
	
	
	public void stop() {
		setStatus("STOP");
	}
	
	public void park() {
		setStatus("PARK");
	}

	@Override
	public String toString() {
		return "Simcar [name=" + name + ", color=" + color + ", kind=" + kind + ","
				+ " serial=" + serial + ", status=" + status + "]";
	}
	
}
