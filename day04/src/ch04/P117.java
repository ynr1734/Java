package ch04;

public class P117 {

	public static void main(String[] args) {
		String a = "10";
		switch (a) {
		case "10":
			System.out.println("큰수");
			break;
		case "5":
			System.out.println("중간수");
			break;
		case "1":
			System.out.println("작은수");
			break;
		default:
			System.out.println("입력오류");
			break;
		} // end switch
		System.out.println("End .....");
	}

}
