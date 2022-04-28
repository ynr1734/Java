package ws;

public class DeleteTestApp {

	public static void main(String[] args) {
		DAO dao = new TodoDAO();
		TodoVO t1 = new TodoVO("1", "Today", "Review", "Done");
		try {
			dao.insert(t1);
			System.out.println("Complated 1 ..");
			dao.delete("1"); 
			System.out.println("Complated 2 ..");
			dao.delete("1"); 
			System.out.println("Complated 3 ..");
		}catch (DuplicatedKEYException e) {
			System.out.println(e.getMessage());
		}catch (NotFoundKEYException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
