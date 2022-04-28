package ws;

public class SelectTestApp {

	public static void main(String[] args) throws Exception { // insert의 Duplicated, select의 NotFound 둘 다 필요
		DAO dao = new TodoDAO();
		TodoVO t1 = new TodoVO("1", "Today", "Review", "Done");
		dao.insert(t1);
		String s = t1.getNum();
		try {
			dao.select(s);
			System.out.println("Complated 1 ..");
			dao.select("2");
			System.out.println("Complated 2 ..");
		} catch (NotFoundKEYException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
