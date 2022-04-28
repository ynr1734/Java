package oracle;

public class SelectTestAPP {

	public static void main(String[] args) throws Exception {
		DAO dao = new CustomerDAO();
		CustomerVO c1 = new CustomerVO("id01", "pwd01", "lee");
		dao.insert(c1);
		String s = c1.getId();
		try {
			dao.select(s);
			System.out.println("Complated 1 ..");
			dao.select("id07");
			System.out.println("Complated 2 ..");
		}catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}
