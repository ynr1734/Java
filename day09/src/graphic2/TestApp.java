package graphic2;

public class TestApp {

	public static void main(String[] args) {
		// Shape s = new Shape(); -> 추상 클래스는 만들 수 없다.
		Shape s[] = new Shape[3];
		s[0] = new Rectangle(1, 3, 10, 20);
		s[1] = new Triangle(2, 2, 20, 20);
		s[2] = new Circle(3, 3, 15);
		
		for (Shape sh : s) {
			System.out.println(sh.getArea());
			System.out.println(sh.getCircum());
			sh.setColor("red");
		}
		
		for (Shape sh : s) {
			System.out.println(sh.getPosition());
		}
		
	}

}
