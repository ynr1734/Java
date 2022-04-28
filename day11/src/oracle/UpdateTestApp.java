package oracle;

public class UpdateTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01", "pwd01","lee");
		try {
			dao.update(c1);
			System.out.println("Complated 1 ..");
			dao.update(c1);
			System.out.println("Complated 2 ..");
		}catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
