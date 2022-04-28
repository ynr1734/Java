package ws;


public class InsertTestApp {

	public static void main(String[] args) {
		DAO dao = new TodoDAO();
		TodoVO t1 = new TodoVO("1", "Today", "Review", "Done");
		try {
			dao.insert(t1);
			System.out.println("Complated 1 ..");
			dao.insert(t1);
			System.out.println("Complated 2 ..");
		}catch (DuplicatedKEYException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
