package ws;

import java.util.ArrayList;

public class SelectAllTestApp {

	public static void main(String[] args) throws NotFoundKEYException {
		DAO dao = new TodoDAO();
		ArrayList<TodoVO> list = null;
		
		try {
			list = dao.select();
		} catch (NotFoundKEYException e) {
			System.out.println(e.getMessage());
		}
	}

}
