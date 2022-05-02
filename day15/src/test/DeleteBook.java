package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;


public class DeleteBook {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		
		try {
			dao.delete(8);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	

}
