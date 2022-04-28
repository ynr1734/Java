package bank;

public class OverdrawnException extends Exception {
	public OverdrawnException() {
		
	}	
	public OverdrawnException(String str) {
		super(str);
	}
}
	
