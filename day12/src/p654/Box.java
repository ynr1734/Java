package p654;

public class Box<T> {
	T obj;  // object로 넣으면 박스에 다양한 것들을 넣을 수 있다
	public Box() {
		
	}
	public void setBox(T c) {
		obj = c;
	}
	public T getBox() {
		return obj;
	}
	
	
}
