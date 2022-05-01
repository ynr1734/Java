package test;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class DeleteProduct {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();
		ProductVo p = new ProductVo("shirts", 20000, 3.5);
		try {
			dao.delete(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
