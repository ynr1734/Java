package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;


public class InsertBook {

	public static void main(String[] args) {
		Dao<Integer,BookVo> dao = new BookDao();
		BookVo b = new BookVo("Leaving Time","Jodi Picoult", "9781444778168", 0);
		try {
			dao.insert(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
