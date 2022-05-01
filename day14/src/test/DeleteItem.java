package test;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class DeleteItem {

	public static void main(String[] args) {
		Dao<Integer, ItemVo> dao = new ItemDao();
		ItemVo item = new ItemVo(1,"phone", 10000);
		try {
			dao.delete(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
