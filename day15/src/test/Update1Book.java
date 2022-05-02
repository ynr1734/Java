package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class Update1Book {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		try {
			dao.update1(1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
