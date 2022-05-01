package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class InsertCust {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();
		CustVo cust = new CustVo("id77","pwd77","ÀÌ¸»¼÷");
		try {
			dao.insert(cust);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
