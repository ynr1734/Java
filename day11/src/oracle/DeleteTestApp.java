package oracle;

public class DeleteTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01", "pwd01","lee");
		try {
			dao.insert(c1);
			System.out.println("Complated 1 ..");
			dao.delete("id99");
			System.out.println("Complated 2 ..");
		}catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		}catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
