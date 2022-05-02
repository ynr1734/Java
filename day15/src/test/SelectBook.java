package test;


import dao.BookDao;
import frame.Dao;
import vo.BookVo;


public class SelectBook {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		BookVo b = null;
		try {
			b = dao.select(1);
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
