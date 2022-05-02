package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class Update0Book {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		try {
			dao.update0(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
